package com.sz.college.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 处理请求中流的工具类
 * @author ZhangHanbo
 * @date 2016年10月18日
 *
 */
public class Stream2MapUtils {
	
	
	public static Map<String, String> jsonToMap(HttpServletRequest request){
		Map<String, String> map=new HashMap<String, String>();
		InputStream ins=null;
		try {
			//获取输入流
			ins=request.getInputStream();
			//将流转换成字符串
			String insString=convertStreamToString(ins);
			if(insString!=null&&!insString.equals("")){
				//处理json数据
				JSONObject params=JSON.parseObject(insString);
				//将参数置入map
				Set<String> keys=params.keySet();
				for(String key:keys){
					map.put(key, params.getString(key));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
	
	
	public static String convertStreamToString(InputStream is) {
		StringBuilder sb = new StringBuilder();
		try {
			String line = null;
			BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}
	/**
	 * @user jk
	 * @author：String 转InputStream
	 * @date : 2016年12月23日 下午2:48:21
	 */
	public static InputStream convertStringToStream(String str) { 
		if(str==null||str.equals("")){
			return null;
		}else{
			InputStream   in_withcode = null;
			try {
				in_withcode   =   new   ByteArrayInputStream(str.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return in_withcode;
		}
	}

}

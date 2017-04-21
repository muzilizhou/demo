package com.sz.college.util;

import java.io.IOException;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.dao.EmptyResultDataAccessException;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.sz.college.model.User;

/**
 * @author：发送http请求，获取返回参数
 * @date : 2017年3月6日下午1:28:47
 */
public class HTTPCLIENT {
	private static PoolingHttpClientConnectionManager connectionManager = null;
	private static HttpClientBuilder httpBulder = null;
	private static RequestConfig requestConfig = null;
	private static int MAXCONNECTION = 10;

	private static int DEFAULTMAXCONNECTION = 5;

	private static String IP = "127.0.0.1";
	private static int PORT = 8080;
	static {
		requestConfig = RequestConfig.custom().setSocketTimeout(10000).setConnectTimeout(10000)
				.setConnectionRequestTimeout(10000).build();

		HttpHost target = new HttpHost(IP, PORT);
		connectionManager = new PoolingHttpClientConnectionManager();
		connectionManager.setMaxTotal(MAXCONNECTION);
		connectionManager.setDefaultMaxPerRoute(DEFAULTMAXCONNECTION);
		connectionManager.setMaxPerRoute(new HttpRoute(target), 20);
		httpBulder = HttpClients.custom();
		httpBulder.setConnectionManager(connectionManager);
	}
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		String url = "http://localhost:8080/College/z";
		Map<String, String> map = new HashMap<String, String>();
		map.put("action", "register");
		HttpClient client = getConnection();
		HttpUriRequest post = getRequestMethod(map, url, "post");
		HttpResponse httpResponse = null;
		String message = null;
		try {
			httpResponse = client.execute(post);
			HttpEntity entity = httpResponse.getEntity();
			message = EntityUtils.toString(entity, "utf-8");
			System.out.println(message);
			users = JSON.parseObject(message, new TypeReference<ArrayList<User>>() {
			});
		} catch (ClientProtocolException e) {
			// TODO 错误日志
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 错误日志
			e.printStackTrace();
		} catch (EmptyResultDataAccessException e) {
			// 未查询到数据,直接返回空对象 TODO 处理日志
			e.printStackTrace();
		}
		System.out.println(JSON.toJSONString(users));
	}
	public static CloseableHttpClient getConnection() {
		CloseableHttpClient httpClient = httpBulder.build();
		httpClient = httpBulder.build();
		return httpClient;
	}
	public static HttpUriRequest getRequestMethod(Map<String, String> map,
			String url, String method) {
		HttpUriRequest reqMethod = null;
		if (map != null && map.size() > 0) {
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			Set<Map.Entry<String, String>> entrySet = map.entrySet();
			for (Map.Entry<String, String> e : entrySet) {
				String name = e.getKey();
				String value = e.getValue();
				NameValuePair pair = new BasicNameValuePair(name, value);
				params.add(pair);
			}
			if ("post".equals(method)) {
				reqMethod = RequestBuilder
						.post()
						.setUri(url)
						.addParameters(
								params.toArray(new BasicNameValuePair[params
										.size()])).setConfig(requestConfig)
						.build();
				System.out.println(reqMethod);
			} else if ("get".equals(method)) {
				reqMethod = RequestBuilder
						.get()
						.setUri(url)
						.addParameters(
								params.toArray(new BasicNameValuePair[params
										.size()])).setConfig(requestConfig)
						.build();
			}
		} else {
			if ("get".equalsIgnoreCase(method)) {
				reqMethod = RequestBuilder.get().setUri(url)
						.setConfig(requestConfig).build();
			} else if ("post".equalsIgnoreCase(method)) {
				reqMethod = RequestBuilder.post().setUri(url)
						.setConfig(requestConfig).build();
			}
		}
		return reqMethod;
	}

}

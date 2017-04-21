package com.sz.college.util;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 容器工具类
 * @author ZhangHanbo
 * @date 2016年10月25日
 *
 */
public class ContexUtils {
	
	
	private AbstractApplicationContext ctx;//spring容器对象
	private static ContexUtils instance=null;//静态单例
	
	//私有构造函数,禁用外部实例化
	private ContexUtils(){
		String[] configFiles = new String[] { "classpath:applicationContext.xml" };
		this.ctx=new ClassPathXmlApplicationContext(configFiles);
	}
	
	//获取单例
	public static ContexUtils getInstance(){
		if(instance==null){
			instance=new ContexUtils();
		}
		return instance;
	}
	
	public AbstractApplicationContext getAbstractApplicationContext(){
		return ctx;
	}
	

}

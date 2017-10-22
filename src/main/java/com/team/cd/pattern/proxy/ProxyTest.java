package com.team.cd.pattern.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		com.team.cd.pattern.proxy.Proxy staticProxy= new com.team.cd.pattern.proxy.Proxy(new ConcreteSubject());
		staticProxy.exec("静态代理......");
		Subject subject = new ConcreteSubject();
		InvocationHandler handler =new DynamicInvocetionHander<Subject>(subject);
		
		Subject object = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), 
				new Class[]{Subject.class}, handler);
		object.exec("执行方法");
	
	}
}

package com.sikiedu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikiedu.bean.Collection;
import com.sikiedu.bean.User;

public class test {

	public static void main(String[] args) {
//		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		// ��������spring�ķ������ļ� //ApplicationContext app = new
////		ClassPathXmlApplicationContext("applicationContext.xml", "applicationContext2.xml");
//
//		User u = (User) app.getBean("user");
//
//		System.out.println(u); // �����com.sikiedu.bean.User@29774679(��ȡ�˶���)

		
		
		
		
		
//		ʵ��InvocationHandler��ʵ�ֶ�̬����		
//		JdkStatic jdk = new UserDao();
//	
//		UserProxy u = new UserProxy(jdk);
//		
//		u.createProxy().serUser();
		
		
		
		
		
//		jdk��̬����
//		JdkStatic js = (JdkStatic)Proxy.newProxyInstance(jdk.getClass().getClassLoader(), jdk.getClass().getInterfaces(),
//				new InvocationHandler() {
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						// TODO Auto-generated method stub
//						
//						System.out.println("123");
//						Object s = method.invoke(jdk, args);
//						System.out.println("zxt");
//						return s;
//					}
//				});
//		js.serUser();
	}

}

package com.sikiedu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//jdbc ��̬����
public interface JdkStatic {
	public void serUser();
}

class UserDao implements JdkStatic{

	@Override
	public void serUser() {
		System.out.println("�����û�");	
	}
}

class UserProxy implements InvocationHandler{

	private JdkStatic jdkStatic;
	
	public UserProxy(JdkStatic jdkStatic)
	{
		this.jdkStatic = jdkStatic;
	}
	
	public JdkStatic createProxy()
	{
		JdkStatic u = (JdkStatic)Proxy.newProxyInstance(jdkStatic.getClass().getClassLoader(), jdkStatic.getClass().getInterfaces(), this);
		return u;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("zxt");
		
		return method.invoke(jdkStatic, args);
	}
	
}

package com.sikiedu.bean;

public class User {
	private String name;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
		
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
//	  @PostConstruct   //��������ǰ����
//    public void init(){
//        System.out.println("��ʼ");
//    }
//    @PreDestroy����   //��������ǰ����
//    public void destory(){
//        System.out.println("����");
//    }
}

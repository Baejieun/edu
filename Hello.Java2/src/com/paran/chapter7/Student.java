package com.paran.chapter7;


public class Student{
	String name; //private : 내 클래스 안에서만 public : 모두 접근 가능
	String stuId;
	protected boolean isMilSer; //전역여부
	//기본 생성자
//	public Student(){		
//	}
	//파라미터 3개, 생성자
	public Student(String name, String stuId, boolean isMilSer){
		this.name = name;
		this.stuId = stuId;
		this.isMilSer = isMilSer;
	}
	public void showInfo(){
		System.out.println("이름: " + name + "     학번: " + stuId);
	}
	public boolean getIsMilSer(){
		return isMilSer;
	}
	public void setIsMilSer(boolean getIsMilSe){
		this.isMilSer =  isMilSer;
	}
}
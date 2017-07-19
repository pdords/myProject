package spring.web.ch05.ex02;

import java.sql.Date;

public class User {
	private String name;
	private int age;
	private Date regDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String toString(){
		return String.format("%s, %d, %s",name,age,regDate);
	}
}

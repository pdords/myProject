package spring.web.ch05.ex01;

public class Result {
	boolean duplicated;
	String availabled;
	
	public boolean isDuplicated(){
		return duplicated;	
		//리턴타입이 boolean인경우 맨앞의 변수명에 is를 붙이는것이 관계
	}
	public void setDuplicated(boolean duplicated){
		this.duplicated = duplicated;
	}
	public String getAvailabled(){
		return availabled;
	}
	public void setAvailabled(String availableld){
		this.availabled = availableld;
	}
}
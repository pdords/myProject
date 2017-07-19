<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ page import="org.apache.logging.log4j.LogManager" %>
<%@ page import="org.apache.logging.log4j.Logger" %>
<!DOCTYPE html>
<h3>시스템 에러가 발생했습니다.</h3>
<h5>고객센터 1577-1577로 문의하세요.</h5>
<%
	Logger logger = null;
	if(application.getAttribute("logger") != null)
		logger = (Logger)application.getAttribute("logger");
	else{
		logger = LogManager.getLogger();	//log객체를 불러옴
		application.setAttribute("logger",logger);
	}
	//로그 객체가있으면 꺼내쓰고 없으면 만들어 사용한다는 로직.
	
	logger.error(exception);//과거의 파일이 계속 백업되어서 생성.
%>
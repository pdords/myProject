<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
div{
    width:300px;
    height:300px;
    background-image:url("<c:url value="/upload/${fileName}"/>");
    background-size: 300px 300px;
}
</style>
<div></div>
${fileName}
<p><img src="<c:url value="/upload/${fileName}"/>"></p>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style type="text/css">
label{
	display:block;
	float:left;
	font-weight:bold;
	width:50px;
}
</style>

<form method="post" enctype="multipart/form-data">
	<label for="title">제목</label>
	<input type="text" id="title" name="title"><br>
	<label for="uploadFile">파일</label>
	<input type="file" id="uploadFile" name="uploadFile"><br>
	<input type="submit"/>
</form>
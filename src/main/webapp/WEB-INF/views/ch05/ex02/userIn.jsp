<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script>
	$(function(){
		$("#userForm").bind("submit",function(e){
			e.preventDefault();
			$.ajax({
				url:"user/register",	//register메서드 실행.
				method:"post",
				data:$("#userForm").serialize(),
				//시리얼라이즈를 사용하면, parameter들을 자바스크립트 형태 객체로 준비.
				success:function(user){
					$("p").html("다음 내용으로 저장되었습니다.<br>"
							+"이름: "+user.name+"<br>"
							+"나이: "+user.age+"<br>"
							+"가입일: "+user.regDate);
				},
				error:function(a, b, errMsg){
					$("p").html("실패: "+errMsg);
				}
			});
		});
	});
</script>
<form id="userForm">
	<label>이름</label>
	<input id="name" type="text" name="name" required><br/>
	<label>나이</label>
	<input id="age" type="number" name="age" required><br/>
	<label>등록일</label>
	<input id="regDate" type="date" name="regDate" required/><br/>
	<input type="submit"/>
</form>
<p></p>
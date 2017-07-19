<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h3>사용자 정보</h3>
<p>
${user.name}<br>
${user.age}
</p>
<p>
${user2.name}<br>
${user2.age}
</p>

<!-- url은 특정자원에 붙은 이름 그 수가 한정되있는 상태이다.
	 엄청나게 많은 request 자원들을 url화 데이터자체를 url화 시키는 작업의 이름을
	 rest 라고 표현하고 url을 입력하는 것으로 준비된 메서드들의 값을 입력 할
	 수 있게 하는 것이다. -->
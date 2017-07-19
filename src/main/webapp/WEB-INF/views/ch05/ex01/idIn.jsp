<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script>
$(function(){
	$("#chkBtn").bind("click", function(){
		$.ajax({
			url:"id/validate",	//자바의 /validate로 연결
			method:"get",		//get방식
			data:{
				loginId:$("#loginId").val()	//loginId 에 입력한 값이 데이터값.
			},
			success:function(result){	//성공시
				if(result.duplicated === true)
					$("#msgModal #msg").text("이미 등록된 아이디:" +result.availableld+"를 권합니다.")
				else $("#msgModal #msg").text("사용할 수 있는 아이디입니다.");
			},
			error:function(a, b, errMsg){
				$("#msgModal #msg").text("수정 실패" + errMsg);
			},
			complete:function(){	//에러이던 성공이던 화면은 나타나게 처리.
				$("#msgModal").modal("show");
			}
		});
	});
});
</script>

<p></p>
<form>
	<label>로그인 아이디: </label>
	<input id="loginId" type="text"/>
	<input id="chkBtn" type="button" value="아이디 중복검사"/>
</form>
<div id="msgModal" class="modal fade">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>
			<div class="modal-body">
				<p id="msg">수정 성공</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="close" data-dismiss="modal">확인</button>
			</div>
		</div>
	</div>
</div>
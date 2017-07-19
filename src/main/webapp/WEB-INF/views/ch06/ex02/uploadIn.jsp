<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script>
//버튼별 handler를 등록한다.
var regButtons = function() {    
    $(":button#send").bind("click", function() {        
        var formData = new FormData($("form")[0]);        
        $.ajax({
            method: "post",            
            data: formData,
            processData: false, //no serialize
            contentType: false, // multipart/formdata
            //기본값이 TRUE가 된상태에서는 바이너리 데이터가 처리되지 않는다.
            success: function(result){
                if(result)$("#msgModal #msg").text("업로드 성공");                
            },
            error: function(a, b, errMsg){
                $("#msgModal #msg").text("업로드 실패: " + errMsg);
            },
            complete:function(){
                $("#msgModal").modal("show");
            }
        });        
    });
};
 
$(document).ready(
    function() {        
        regButtons();
    }
);
 
var imgView = function(input) {
    if (input.files && input.files[0]) {//객체에 첨부파일이 있는지 조사
        var reader = new FileReader();	//있을경우 객체 생성.        
        reader.addEventListener("load", function(){
            $('.previewImg').attr('src', reader.result);
          }, false);		//이미지객체에 src속성의 값을 reader.result값으로 변경한다.
        reader.readAsDataURL(input.files[0]);
    }
}
// readAsDataURL 메서드 설명 사이트: https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsDataURL
</script>
 
<div>
    <img class="previewImg" align="left" hspace="72"  width="200" height="250" >
</div> 
<form>    
    <input type="file" id="uploadFile" name="uploadFile" onChange="imgView(this)">        
</form><!-- 첨부파일을 선택하면 파일 객체에 체인지 이벤트가 발생, 이미지뷰 펑션을 호출 this객체를 
			파라미터 값으로 넘긴다. 즉 파일타입의 객체가 담기게 된다. -->
<button type="button" id="send" class="button btn-default">업로드</button>
 
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
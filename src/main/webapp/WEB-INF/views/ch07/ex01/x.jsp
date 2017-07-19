<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script>
// 현재 일시를 표시한다.
var showDate = function() {
    var date = new Date();
    $("#current").html(
        date.getFullYear() + "/" + (date.getMonth() + 1) + "/"
            + date.getDate() + " " + date.getHours() + ":"
            + date.getMinutes() + ":" + date.getSeconds()
    );
};

// 버튼별 handler를 등록한다.
var regButtons = function() {
    $(":button#good").bind("click", function() {
        $("#msg").text("Good, click");
        $.ajax({
            method: "GET",
            url: "x/good",	//주소를찾아줌.
            success: function(rowCnt){
                $("#msg").text(rowCnt+"건 처리.");
                listNums();
            }        
        });
    });	//good,click메세지 이후 처리메세지 출력 에러일경우 이상태에서 멈춤.
    
    $(":button#badWithX").bind("click", function() {
        $("#msg").text("BadWithX, click");
        $.ajax({
            method: "GET",
            url: "x/badWithX",
            success: function(rowCnt){
                $("#msg").text(rowCnt+"건 처리.");
                listNums();
            },
            error: function(a, b, errMsg){
                $("#msg").text("실패: " + errMsg);                
            }
        });
    });
    
    $(":button#badNoX").bind("click", function() {    
        $("#msg").text("BadNoX, click");
        $.ajax({
            method: "GET",
            url: "x/badNoX",
            success: function(rowCnt){
                $("#msg").text(rowCnt+"건 처리.");
                listNums();
            },
            error: function(a, b, errMsg){
                $("#msg").text("실패: " + errMsg);                
            }
        });
    });
    
    $(":button#badService").bind("click", function() {    
        $("#msg").text("BadService, click");
        $.ajax({
            method: "GET",
            url: "x/badService",
            success: function(rowCnt){
                $("#msg").text(rowCnt+"건 처리.");
                listNums();
            },
            error: function(a, b, errMsg){
                $("#msg").text("실패: " + errMsg);                
            }
        });
    });
    
    $(":button#listNums").bind("click", function() {    
        $("#msg").text("ListNums, click");
        listNums();
    });
};
 
var listNums = function(){
    $.ajax({
        method: "GET",
        url: "x/listNums",
        success: function(numList){
            $("ul").empty();	//li내용을 모두지운다
            $(numList).each(function(idx, num){
                $("ul").append("<li>"+num+"</li>");
            });	//그리고 새로운 li들을 입력시킨다.
        }
    });
}
 
$(document).ready(
    function() {
        showDate();
        regButtons();
    }
);
</script>

<title>Transaction</title>
<p id="current"></p>

<button type="button" id="good">Good</button>
<button type="button" id="badWithX">BadWithX</button>
<button type="button" id="badNoX">BadNoX</button>
<button type="button" id="badService">BadServiceWithX</button>
<button type="button" id="listNums">ListNums</button>

<p id="msg"></p>

<ul></ul>
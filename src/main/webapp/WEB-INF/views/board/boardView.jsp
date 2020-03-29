<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail</title>
<style type="text/css">
.form-group{
    margin-right: 30px;
}

.btn-danger{
	float: right;
	margin-left: 10px;
}

.form-group > .btn-primary{
	float: right;
}

#listBtn{
    float: right;
    margin-right: 40px;
}

</style>
</head>
<body>
 
 
<h2> 게시글 상세 </h2>
      
<button class="btn btn-primary" id="listBtn" onclick="location.href='/board/list'">리스트</button>
    <div style="padding : 30px;">
      <div class="form-group">
        <label>제목</label>
        <span>${board.title}</span>
      </div>
      <div class="form-group">
        <label>작성자</label>
        <span>${board.writer}</span>
      </div>
      <div class="form-group">
        <label>작성날짜</label>
        <span><fmt:formatDate value="${board.regDate}" pattern="yyyy/ MM/ dd HH:mm" /></span>
      </div>
      <div class="form-group">
        <label>조회수</label>
        <span>${board.viewCnt}</span>
      </div>
      <div class="form-group">
        <label>내용</label>
        <p>${board.content}</p>
      </div>
    </div> 	 	
	<div class="form-group">
	    <form:form action="/board/post/${board.bno}" method="DELETE">
	        <input class="btn btn-danger"  type="submit" value="삭제">
	    </form:form>
	    <input  class="btn btn-primary" type="button" value="수정" onclick='location.href="/board/post/${board.bno}"'>
	</div>
<%@ include file="bootstrap.jsp" %>
</body>
</html>
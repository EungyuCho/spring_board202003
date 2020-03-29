<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
<style type="text/css">
.btn-primary{
    float: right;
    margin-right: 10%;
}

.container{
    margin-top: 50px;
 }
</style>
</head>
<body>
 
<h2> 게시글 목록 </h2>
 
<button class="btn btn-primary" onclick="location.href='/board/post'">글쓰기</button>
 
<div class="container">
    <table class="table table-hover">
        <tr>
            <th>No</th>
            <th>제목</th>
            <th>작성자</th>
            <th>일자</th>
            <th>조회수</th>
        </tr>
          <c:forEach var="l" items="${list}">              
          <tr onclick="location.href='/board/${l.bno}'">
                  <td>${l.bno}</td>
                  <td>${l.title}</td>
                  <td>${l.writer}</td>
                  <td>${l.regDate}</td>
                  <td>${l.viewCnt}</td>
              </tr>
          </c:forEach>
    </table>
    <div id="paginationBox">
		<ul class="pagination">
			<c:if test="${pagination.prev}">
				<li class="page-item"><a class="page-link" href="#" onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}')">Previous</a></li>
			</c:if>
			<c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" var="idx">
				<li class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/> "><a class="page-link" href="#" onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}')"> ${idx} </a></li>
			</c:forEach>
			<c:if test="${pagination.next}">
				<li class="page-item"><a class="page-link" href="#" onClick="fn_next('${pagination.range}', '${pagination.range}', '${pagination.rangeSize}')" >Next</a></li>
			</c:if>
		</ul>
	</div>

</div>
 <script>

//이전 버튼 이벤트
function fn_prev(page, range, rangeSize) {
		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;
		var url = "${pageContext.request.contextPath}/board/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
  //페이지 번호 클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
		var url = "${pageContext.request.contextPath}/board/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;	
	}
	//다음 버튼 이벤트
	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;
		var url = "${pageContext.request.contextPath}/board/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
</script>
 
<%@ include file="bootstrap.jsp" %>
</body>
</html>
<%@page import="java.util.ArrayList"%>
<%@page import="Goods.GoodsDao"%>
<%@page import="dto.Goods"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품목록</title>
</head>
<body>
실제 보여주는 내용은 권한별 제한적으로 보여줄것 지금은 테스트용으로 전체 조회.
<%
GoodsDao dao = new GoodsDao();
ArrayList<Goods> agl = dao.GoodsSelectAll();
%>
	<h1>상품조회 테스트</h1>
	<table width="100%" border="1">
		<tr>
			<td>상품코드(PK)</td>
			<td>구매자(FK)</td>
			<td>상품이름</td>
			<td>상품카테고리</td>
			<td>판매가격</td>
			<td>상품색상</td>
			<td>매입일자</td>
			<td>매입수량</td>
			<td>재고수량</td>
			<td>상품브랜드</td>
			<td>사이즈</td>
			<td>매입가격</td>
		</tr>
<%
for (int i=0; i<agl.size(); i++) {
	Goods goods = agl.get(i);
%>
		<tr>
			<td><%= goods.getGoods_code()%></td>
			<td><%= goods.getMember_id()%></td>
			<td><%= goods.getGoods_name()%></td>
			<td><%= goods.getGoods_cate()%></td>
			<td><%= goods.getGoods_price()%></td>
			<td><%= goods.getGoods_color()%></td>
			<td><%= goods.getGoods_buy_date()%></td>
			<td><%= goods.getGoods_buy_count()%></td>
			<td><%= goods.getGoods_stock()%></td>
			<td><%= goods.getGoods_brand()%></td>
			<td><%= goods.getGoods_size()%></td>
			<td><%= goods.getGoods_buy_price()%></td>
		</tr>
<%
}
%>
	</table>
	<div>
		<a href="<%=request.getContextPath()%>/goods/GoodsAdd.jbh">
			<input type="submit" value="상품추가"/>
		</a>
	</div>
	<div>
		<input type="submit" value="상품수정"/>
	</div>
	<div>
		<input type="submit" value="상품삭제"/>
	</div>
</body>
</html>
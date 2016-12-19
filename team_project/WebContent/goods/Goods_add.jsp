<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품추가</title>
</head>
<body>
<h1>상품추가 테스트</h1>
<form action="<%= request.getContextPath()%>/goods/GoodsAdd.jbh" method="post">
	<table>
		<tr>
			<td>상품코드(PK)</td>
			<td><input type="text" name="goods_code" size="20"/></td>
		</tr>
		<tr>	
			<td>구매자(FK)</td>
			<td><input type="text" name="member_id" size="20"/></td>
		</tr>
		<tr>
			<td>상품이름</td>
			<td><input type="text" name="goods_name" size="20"/></td>
		</tr>
		<tr>
			<td>상품카테고리</td>
			<td><input type="text" name="goods_cate" size="20"/></td>
		</tr>
		<tr>
			<td>판매가격</td>
			<td><input type="text" name="goods_price" size="20"/></td>
		</tr>
		<tr>
			<td>상품색상</td>
			<td><input type="text" name="goods_color" size="20"/></td>
		</tr>
		<tr>
			<td>매입일자</td>
			<td><input type="date" name="goods_buy_date" size="20"/></td>
		</tr>
		<tr>
			<td>매입수량</td>
			<td><input type="text" name="goods_buy_count" size="20"/></td>
		</tr>
		<tr>
			<td>재고수량</td>
			<td><input type="text" name="goods_stock" size="20"/></td>
		</tr>
		<tr>
			<td>상품브랜드</td>
			<td><input type="text" name="goods_brand" size="20"/></td>
		</tr>
		<tr>
			<td>사이즈</td>
			<td><input type="text" name="goods_size" size="20"/></td>
		</tr>
		<tr>
			<td>매입가격</td>
			<td><input type="text" name="goods_buy_price" size="20"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="상품등록버튼"/></td>
		</tr>
	</table>
</form>
</body>
</html>
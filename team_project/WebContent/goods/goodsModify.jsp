<%@page import="dto.Goods"%>
<%@page import="Goods.GoodsDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ ����</title>
</head>
<body>
	���� �׽�Ʈ ȭ��
	<%
	GoodsDao dao = new GoodsDao();
	Goods goods = new Goods();
	String sendCode = request.getParameter("sendCode");
	System.out.println(this.getClass()+" sendCode :"+sendCode);
	goods = dao.GoodsUpdateForSelect(sendCode);
	
	String goodsCode = goods.getGoods_code();
	String memberId = goods.getMember_id();
	String goodsName = goods.getGoods_name();
	String goodsCate = goods.getGoods_cate();
	int goodsPrice = goods.getGoods_price();
	int goodsPoint = goods.getGoods_point();
	String goodsColor = goods.getGoods_color();
	String goodsBuyDate = goods.getGoods_buy_date();
	int goodsBuyCount = goods.getGoods_buy_count();
	int goodsStock = goods.getGoods_stock();
	String goodsBrand = goods.getGoods_brand();
	int goodsSize = goods.getGoods_size();
	int goodsBuyPrice = goods.getGoods_buy_price();
	%>
	<form action="<%=request.getContextPath()%>/goods/GoodsDetailAction.jbh" method="post">
		<tr>
			<td>��ǰ�ڵ�</td>
			<td>
				<input type="text" name="goods_code" value="<%= goodsCode %>"/>
			</td>
		</tr>
		<tr>
			<td>������</td>
			<td>
				<input type="text" name="member_id" value="<%= memberId %>"/>
			</td>
		</tr>
		<tr>
			<td>��ǰ�̸�</td>
			<td>
				<input type="text" name="goods_name" value="<%= goodsName %>"/>
			</td>
		</tr>
		<tr>
			<td>��ǰī�װ�</td>
			<td>
				<input type="text" name="goods_cate" value="<%= goodsCate %>"/>
			</td>
		</tr>
		<tr>
			<td>�ǸŰ���</td>
			<td>
				<input type="text" name="goods_price" value="<%= goodsPrice %>"/>
			</td>
		</tr>
		<tr>
			<td>��ǰ����</td>
			<td>
				<input type="text" name="goods_color" value="<%= goodsPoint %>"/>
			</td>
		</tr>
		<tr>
			<td>��������</td>
			<td>
				<input type="text" name="goods_buy_date" value="<%= goodsColor %>"/>
			</td>
		</tr>
		<tr>
			<td>���Լ���</td>
			<td>
				<input type="text" name="goods_buy_count" value="<%= goodsBuyDate %>"/>
			</td>
		</tr>
		<tr>
			<td>������</td>
			<td>
				<input type="text" name="goods_stock" value="<%= goodsStock %>"/>
			</td>
		</tr>
		<tr>
			<td>��ǰ�귣��</td>
			<td>
				<input type="text" name="goods_brand" value="<%= goodsBrand %>"/>
			</td>
		</tr>
		<tr>
			<td>������</td>
			<td>
				<input type="text" name="goods_size" value="<%= goodsSize %>"/>
			</td>
		</tr>
		<tr>
			<td>���԰���</td>
			<td>
				<input type="text" name="goods_buy_price" value="<%= goodsBuyPrice %>"/>
			</td>
		</tr>
	</form>
</body>
</html>
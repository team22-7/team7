<%@page import="java.util.ArrayList"%>
<%@page import="Goods.GoodsDao"%>
<%@page import="dto.Goods"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ���</title>
</head>
<body>
���� �����ִ� ������ ���Ѻ� ���������� �����ٰ� ������ �׽�Ʈ������ ��ü ��ȸ.
<%
GoodsDao dao = new GoodsDao();
ArrayList<Goods> agl = dao.GoodsSelectAll();
%>
	<h1>��ǰ��ȸ �׽�Ʈ</h1>
	<table width="100%" border="1">
		<tr>
			<td>��ǰ�ڵ�(PK)</td>
			<td>������(FK)</td>
			<td>��ǰ�̸�</td>
			<td>��ǰī�װ�</td>
			<td>�ǸŰ���</td>
			<td>��ǰ����</td>
			<td>��������</td>
			<td>���Լ���</td>
			<td>������</td>
			<td>��ǰ�귣��</td>
			<td>������</td>
			<td>���԰���</td>
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
			<td>
				<a href="<%=request.getContextPath()%>/goods/GoodsAdd.jbh">
					��ǰ�߰�
				</a>
			</td>
			<td>
				<a href="<%=request.getContextPath()%>/goods/GoodsDetailAction.jbh?sendCode=<%= goods.getGoods_code() %>">
					��ǰ����
				</a>
			</td>
			<td>
				<a href="">
					��ǰ����
				</a>
			</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
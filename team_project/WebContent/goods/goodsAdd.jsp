<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ�߰�</title>
</head>
<body>
<h1>��ǰ�߰� �׽�Ʈ</h1>
<form action="<%= request.getContextPath()%>/goods/GoodsAdd.jbh" method="post">
	<table>
		<tr>
			<td>��ǰ�ڵ�(PK)</td>
			<td><input type="text" name="goods_code" size="20"/></td>
		</tr>
		<tr>	
			<td>������(FK)</td>
			<td><input type="text" name="member_id" size="20"/></td>
		</tr>
		<tr>
			<td>��ǰ�̸�</td>
			<td><input type="text" name="goods_name" size="20"/></td>
		</tr>
		<tr>
			<td>��ǰī�װ�</td>
			<td><input type="text" name="goods_cate" size="20"/></td>
		</tr>
		<tr>
			<td>�ǸŰ���</td>
			<td><input type="text" name="goods_price" size="20"/></td>
		</tr>
		<tr>
			<td>��ǰ����</td>
			<td><input type="text" name="goods_color" size="20"/></td>
		</tr>
		<tr>
			<td>��������</td>
			<td><input type="date" name="goods_buy_date" size="20"/></td>
		</tr>
		<tr>
			<td>���Լ���</td>
			<td><input type="text" name="goods_buy_count" size="20"/></td>
		</tr>
		<tr>
			<td>������</td>
			<td><input type="text" name="goods_stock" size="20"/></td>
		</tr>
		<tr>
			<td>��ǰ�귣��</td>
			<td><input type="text" name="goods_brand" size="20"/></td>
		</tr>
		<tr>
			<td>������</td>
			<td><input type="text" name="goods_size" size="20"/></td>
		</tr>
		<tr>
			<td>���԰���</td>
			<td><input type="text" name="goods_buy_price" size="20"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="��ǰ��Ϲ�ư"/></td>
		</tr>
	</table>
</form>
</body>
</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: adhibarfan
  Date: 11/27/16
  Time: 12:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tambah Barang</title>

    <link href="<c:url value="/webjars/bootstrap/3.3.7/dist/css/bootstrap.min.css"/> " rel="stylesheet"/>
</head>
<body>
<h1 class="text-center">Tambah Barang</h1>
<div class="container">

    <form:form modelAttribute="barang" action="${pageContext.request.contextPath}/simpanBarang" method="post">
        <div class="form-group">
            <label>Nama Barang</label>
            <form:input path="namaBarang" type="text" cssClass="form-control" placeholder="Input nama barang"/>
        </div>

        <div class="form-group">
            <label>Jenis Barang</label>
            <form:select path="jenisBarang" cssClass="form-control">
                <form:option value="cair">Cair</form:option>
                <form:option value="padat">Padat</form:option>
                <form:option value="gas">Gas</form:option>
            </form:select>

        </div>

        <div class="form-group">
            <label>Tanggal Kadaluarsa Barang</label>
            <form:input path="tanggalKadaluarsa" type="date" cssClass="form-control" placeholder="Tanggal Kadaluarsa"/>
        </div>

        <div class="form-group">
            <label for="deskripsi">Deskripsi Barang</label>
            <form:textarea path="deskripsi" cssClass="form-control" placeholder="Deskripsi barang"/>
        </div>

        <spring:eval expression="barang.tanggalKadaluarsa"/>
        <button type="submit" class="btn btn-default">Submit</button>

    </form:form>


</div>


<script src="<c:url value="/webjars/jquery/3.1.1/dist/jquery.min.js"/> "></script>
<script src="<c:url value="/webjars/bootstrap/3.3.7/dist/js/bootstrap.min.js"/> "></script>
</body>


</html>

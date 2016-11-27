<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adhibarfan
  Date: 11/27/16
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Halaman index</title>

    <link href="<c:url value="/webjars/bootstrap/3.3.7/dist/css/bootstrap.min.css"/> " rel="stylesheet"/>
</head>
<body>

<h1 class="text-center">Data Barang</h1>


<div class="container">

    <a href="${pageContext.request.contextPath}/tambahBarang">
        <button class="btn btn-primary">Tambah Barang</button>
    </a>
    <p>

    </p>


    <table class="table table-bordered table-hover table-responsive table-striped">
        <thead>
        <tr>
            <th class="text-center">id barang</th>
            <th class="text-center">nama barang</th>
            <th class="text-center">jenis barang</th>
            <th class="text-center">tanggal kadaluarsa</th>
            <th class="text-center">deskripsi</th>
            <th class="text-center">aksi</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${barangs}" var="barang">
            <tr>
                <td>${barang.idBarang}</td>
                <td>${barang.namaBarang}</td>
                <td>${barang.jenisBarang}</td>
                <td>${barang.tanggalKadaluarsa}</td>
                <td>${barang.deskripsi}</td>
                <td class="text-center">
                    <a href="${pageContext.request.contextPath}/editBarang/${barang.idBarang}">
                        <button class="btn btn-success">
                            <i class="glyphicon glyphicon-pencil"></i>
                        </button>
                    </a>
                    <a href="${pageContext.request.contextPath}/hapusBarang/${barang.idBarang}">
                        <button class="btn btn-danger">
                            <i class="glyphicon glyphicon-trash"></i>
                        </button>
                    </a>
                </td>
            </tr>
        </c:forEach>

        </tbody>


    </table>
</div>


<script src="<c:url value="/webjars/jquery/3.1.1/dist/jquery.min.js"/> "></script>
<script src="<c:url value="/webjars/bootstrap/3.3.7/dist/js/bootstrap.min.js"/> "></script>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          crossorigin="anonymous">

</head>
<body>
<%-- CIA BUS JUSU PUSLAPIO VISAS KODAS--%>
<table class="table table-striped">
    <thead>
    <tr>
        <th> ID</th>
        <th> Name</th>
        <th> Surname</th>
        <th> Phone</th>
        <th> E-mail</th>
    </tr>
    </thead>
    <tbody>
    <%--kiekvieno zingsnio metu ims studentuspo viena ir saugo i "st"--%>
    <c:forEach items="${students}" var="st">
        <tr>
            <td><a href="/editstudentservlet?id=${st.id}">${st.id}</a></td>
            <%--//stulpeliai--%>
            <td>${st.name}</td>
            <td>${st.surname}</td>
            <td>${st.phone}</td>
            <td>${st.email}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>
<%--js bibliotekos turi buti failo apacioje--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" crossorigin="anonymous"></script>
</body>
</html>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title> list person</title>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    </head>
    <body>
        <table>
            <tr>
                <th>Nom</th>
                <th>Prenom</th>
                <th>Mail</th>
            </tr>
            <c:forEach items="${listPerson}" var="person">
                <tr>
                    <td><c:out value="${person.surname}"/></td>
                    <td><c:out value="${person.forename}"/></td>
                    <td><c:out value="${person.mail}"/></td>
                </tr>
            </c:forEach>
        </table>
         <br/><a href="/">back</a>
    </body>
</html>
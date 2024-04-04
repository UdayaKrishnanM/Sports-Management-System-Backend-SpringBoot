<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>List of Players</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Department</th>
                <th>T20 Rank</th>
                <th>ODI Rank</th>
                <th>Test Rank</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="player" items="${players}">
                <tr>
                    <td>${player.id}</td>
                    <td>${player.name}</td>
                    <td>${player.age}</td>
                    <td>${player.department}</td>
                    <td>${player.ranks.t20_rank}</td>
                    <td>${player.ranks.odi_rank}</td>
                    <td>${player.ranks.test_rank}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
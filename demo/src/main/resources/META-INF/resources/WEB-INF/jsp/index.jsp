<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sports Management System</title>
</head>
<body>

<h1>Welcome to the Player Management System</h1>
    <div>
        <form action="addPlayer.jsp" method="get">
            <button type="submit">Add a Player</button>
        </form>
    </div>
    <div>
        <form action="listPlayers.jsp" method="get">
            <button type="submit">List All Players</button>
        </form>
    </div>
    <div>
        <form action="pickTopPlayers.jsp" method="get">
            <button type="submit">Pick Top Players</button>
        </form>
    </div>
    <div>
        <form action="deletePlayer.jsp" method="get">
            <button type="submit">Delete a Player</button>
        </form>
    </div>
    <div>
        <form action="updatePlayer.jsp" method="get">
            <button type="submit">Update a Player</button>
        </form>
    </div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GET Form Processing</title>
    <link rel="stylesheet" type="text/css" href="WEB-INF/css/style.css">
    <style>
        /* Additional CSS for better visibility */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2, h3 {
            color: #333;
            text-align: center;
        }

        p {
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>GET Form Processing</h2>
        <%-- Retrieving parameters from the request --%>
        <% String name = request.getParameter("name"); %>
        <% String email = request.getParameter("email"); %>

        <h3>Hello, <%= name %></h3>
        <p>Your email is: <%= email %></p>
    </div>
</body>
</html>

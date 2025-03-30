<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Odd-Even & Multiplication Table</title>
</head>
<body>
    <h2>Check if a Number is Odd or Even</h2>
    <form action="OddEvenServlet" method="get">
        Enter a Number: <input type="text" name="t1" required><br>
        <input type="submit" value="Check Odd Even">
    </form>

    <h2>Generate Multiplication Table</h2>
    <form action="MultiplicationServlet" method="get">
        Enter a Number: <input type="text" name="t2" required><br>
        <input type="submit" value="Generate Table">
    </form>

    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        <label>Email:</label>
        <input type="email" name="email" required><br><br>

        <label>Password:</label>
        <input type="password" name="password" required><br><br>

        <button type="submit">Login</button>
    </form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        form {
            background-color: burlywood;
        }
    </style>
</head>
<body>
<h2>SIMPLE CALCULATOR</h2>
<FORM action="/calculator" method="post">
<label>First operand: </label>
<input type="text" name="txtFOperand" placeholder="First operand"><br>
<label>Operator: </label>
<select name="operator">
    <option value="+">Addition</option>
    <option value="-">Subtraction</option>
    <option value="*">Multiplication</option>
    <option value="/">Division</option>
</select><br>
<label>Second operand: </label>
<input type="text" name="txtSOperand" placeholder="Second operand"><br>
<INPUT type="submit" value="calculator">
</FORM>
</body>
</html>

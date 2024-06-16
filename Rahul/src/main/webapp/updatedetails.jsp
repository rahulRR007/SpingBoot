<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Updated of Emp</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333333;
            margin-bottom: 20px;
        }
        form {
            text-align: center;
        }
        input[type="text"], input[type="submit"] {
            padding: 10px;
            margin-bottom: 10px;
            width: 100%;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Updated successfully ${user}</h2>
        <form action="adduser">
            <label for="name">Enter your username:</label><br>
            <input type="text" name="name" id="name"><br>
            <label for="id">Enter your id:</label><br>
            <input type="text" name="id" id="id"><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>

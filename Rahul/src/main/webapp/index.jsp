<!DOCTYPE html>
<html>
<head>
    <title>Welcome to my  website</title>
    <style>
        body {
            background-color: beige;
            font-family: Arial, sans-serif;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            border: 2px solid black;
            border-radius: 10px;
            background-color: white;
        }
        form {
            margin-bottom: 20px;
        }
        input[type="text"], input[type="submit"] {
            padding: 10px;
            margin-bottom: 10px;
            width: 100%;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50; /* Green */
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
        <h2 style="text-align: center;">Welcome to my  website</h2>
        <form action="adduser">
            <label for="name">Enter your username:</label>
            <input type="text" name="name" id="name"><br>
            <label for="id">Enter your id:</label>
            <input type="text" name="id" id="id"><br>
            <input type="submit" value="Submit">
        </form>

        <form action="getuser">
            <label for="getId">Enter your id to retrieve:</label>
            <input type="text" name="id" id="getId"><br>
            <input type="submit" value="Retrieve">
        </form>

        <form action="deleteuser">
            <label for="deleteId">Enter the id to delete:</label>
            <input type="text" name="id" id="deleteId"><br>
            <input type="submit" value="Delete">
        </form>

        <form action="updateuser">
            <label for="updateId">Enter the id to update:</label>
            <input type="text" name="id" id="updateId"><br>
            <input type="submit" value="Update">
        </form>
    </div>
</body>
</html>

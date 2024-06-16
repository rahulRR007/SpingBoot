<!DOCTYPE html>
<html>
<head>
    <title>Welcome to skct</title>
    <style>
        /* Resetting default margin and padding for all elements */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        /* Setting body styles */
        body {
            background-color: #f4f4f4; /* Light background color */
            font-family: Arial, sans-serif; /* Setting font family */
            color: #333; /* Default text color */
            line-height: 1.6; /* Improved line height for readability */
        }
        
        /* Styling container */
        .container {
            width: 80%; /* Adjust container width */
            margin: 0 auto; /* Centering the container */
            padding: 50px 20px; /* Padding for content */
            background-color: #fff; /* White background color for container */
            border-radius: 8px; /* Rounded corners */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Adding a subtle shadow */
        }
        
        /* Heading styles */
        h1, h2 {
            margin-bottom: 20px; /* Adding space below headings */
            color: #007bff; /* Heading color */
        }
        
        /* Form styles */
        form {
            margin-bottom: 30px; /* Adding space between forms */
        }
        
        /* Text input styles */
        input[type="text"] {
            width: 100%; /* Full width */
            padding: 10px; /* Padding for input fields */
            margin-bottom: 20px; /* Space between input fields */
            border: 1px solid #ccc; /* Adding border */
            border-radius: 5px; /* Rounded corners */
            transition: border-color 0.3s; /* Smooth transition for border color */
        }
        
        /* Submit button styles */
        input[type="submit"] {
            width: 100%; /* Full width */
            padding: 10px; /* Padding for button */
            background-color: #007bff; /* Button background color */
            color: #fff; /* Button text color */
            border: none; /* Removing border */
            border-radius: 5px; /* Rounded corners */
            cursor: pointer; /* Pointer cursor */
            transition: background-color 0.3s; /* Smooth transition for background color */
        }
        
        /* Hover effect for submit button */
        input[type="submit"]:hover {
            background-color: #0056b3; /* Darker background color on hover */
        }
        
        /* Responsive styling */
        @media (max-width: 768px) {
            .container {
                width: 90%; /* Adjust container width for smaller screens */
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to SKCT</h1>
        
        <form action="addUser">
            <h2>Add User</h2>
            <input type="text" name="id" placeholder="Enter Your ID">
            <input type="text" name="name" placeholder="Enter Your Name">
            <input type="submit" value="Submit">
        </form>

        <form action="getUser">
            <h2>Display Employee</h2>
            <input type="text" name="id" placeholder="Enter ID">
            <input type="submit" value="Submit">
        </form>

        <form action="updateUser">
            <h2>Update User</h2>
            <input type="text" name="id" placeholder="Enter ID">
            <input type="submit" value="Submit">
        </form>

        <form action="deleteUser">
            <h2>Delete User</h2>
            <input type="text" name="id" placeholder="Enter ID">
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>

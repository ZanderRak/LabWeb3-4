<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link href="../../resources/bootstrap-3.3.5-dist/css/bootstrap.css" rel="stylesheet">
    <link href="../../resources/bootstrap-3.3.5-dist/css/bootstrap-theme.css" rel="stylesheet">
    <link href="../../resources/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../resources/bootstrap-3.3.5-dist/css/registration.css" rel="stylesheet">
    <link href="../../resources/bootstrap-3.3.5-dist/css/stylesheet-pure-css.css" rel="stylesheet">

</head>
<body>
<div class="form">
    <div class="form-group">
        <h2 class="form-name">Registration</h2>
        ${message.accountId}
        <form method="POST" action="/allOk" target="_blank">
            <p>Login: <input class="form-control" type="text" name="login" value placeholder="Login"></p>

            <p>Email: <input class="form-control" type="email" name="email" value placeholder="Email"></p>

            <p>Password: <input class="form-control" type="password" name="password" value placeholder="Password"></p>

            <p>First name: <input class="form-control" type="text" name="firstName" value placeholder="First Name"></p>

            <p>Surname: <input class="form-control" type="text" name="surname" value placeholder="Surname"></p>

            <p>Country: <input class="form-control" type="text" name="country" value placeholder="Country"></p>

            <p>City: <input class="form-control" type="text" name="city" value placeholder="City"></p>

            <p>Birthday: <input class="form-control" type="date" name="birthday" value placeholder="Birthday"></p>

            <p>Sex</p>

            <div class="radio-div">
                <input type="radio" name="radio" id="radio1" class="radio radio-inline"/>
                <label for="radio1">Male</label>
            </div>
            <div class="radio-div">
                <input type="radio" name="radio" id="radio2" class="radio radio-inline"/>
                <label for="radio2">Female</label>
            </div>
            <p><input class="btn btn-success btn-suc" type="submit" value="Submit"></p>
        </form>
    </div>
</div>
</body>
</html>

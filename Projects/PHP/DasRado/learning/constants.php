<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Constants | DasRado</title>
</head>

<body>
<h1>
    <?php
        define("GREETING", "Welcome to W3Schools.com! <br>" );
        echo GREETING;

        # Const keyword
        const MYCAR = "Audi <br>";
        echo MYCAR;

        # Constant arrays
        define("cars", [
            "Audi",
            "Mercedes",
            "Porsche <br>"
        ]);
        echo cars[2];

        #Global constants
        define("GREETING", "Welcome to W3Schools.com!");

        function myTest() {
            echo GREETING;
        }

        myTest();


    ?>
</h1>
</body>
</html>
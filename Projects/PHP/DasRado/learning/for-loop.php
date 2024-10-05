<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>For Loops | DasRado</title>
</head>

<body>
<h1>
    <?php
        for ($x = 0; $x <= 10; $x++) {
            echo "The number is: $x <br>";
        }

        #The break statement
        for ($x = 0; $x <= 10; $x++) {
            if ($x == 3) break;
            echo "The number is: $x <br>";
        }

        #The continue statement
        for ($x = 0; $x <= 10; $x++) {
            if ($x == 3) continue;
            echo "The number is: $x <br>";
        }

        #Step 10
        for ($x = 0; $x <= 100; $x+=10) {
            echo "The number is: $x <br>";
        }
    ?>
</h1>
</body>
</html>
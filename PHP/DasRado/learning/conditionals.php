<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Conditional Statements | DasRado</title>
</head>

<body>
<h1>
    <?php
        if (5 > 3) {
            echo "Have a good day!";
        }

        #With variable
        #$t = 14;

        #Or with variable with the real-world system time
        $t = date_default_timezone_set("Europe/Paris");


        if ($t < 20) {
            echo "Have a good day!";
        }

        #If else
        $t = date("H-i-s");

        if ($t < "20") {
            echo "Have a good day!";
        } else {
            echo "Have a good night!";
        }

        #Else-If
        $t = date("H");

        if ($t < "10") {
            echo "Have a good morning!";
        } elseif ($t < "20") {
            echo "Have a good day!";
        } else {
            echo "Have a good night!";
        }

        #Short Hand If
        $a = 5;

        if ($a < 10) $b = "Hello";

        echo $b;

        #Short Hand If.Else
        $a = 13;

        $b = $a < 10 ? "Hello" : "Good Bye";

        echo $b;

        #Nested If
        $a = 13;

        if ($a > 10) {
            echo "Above 10";
            if ($a > 20) {
                echo " and also above 20";
            } else {
                echo " but not above 20";
            }
        }

        ?>
</h1>
</body>
</html>
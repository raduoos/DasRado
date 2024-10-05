<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Continue Statements | DasRado</title>
</head>

<body>
<h1>
    <?php
        for ($x = 0; $x < 10; $x++) {
            if ($x == 4) {
                continue;
            }
            echo "The number is: $x <br>";
        }

        #Continue in While Loop
        $x = 0;

        while($x < 10) {
            if ($x == 4) {
                continue;
            }
            echo "The number is: $x <br>";
            $x++;
        }

        #Continue in Do While Loop
        $i = 0;

        do {
            $i++;
            if ($i == 3) continue;
            echo $i;
        } while ($i < 6);

        #Continue in FOr Each Loop
        $colors = array("red", "green", "blue", "yellow");

        foreach ($colors as $x) {
            if ($x == "blue") continue;
            echo "$x <br>";
        }
    ?>
</h1>
</body>
</html>
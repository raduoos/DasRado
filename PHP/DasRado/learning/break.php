<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Break in Loops | DasRado</title>
</head>

<body>
    <h1>
        <?php
            for ($x = 0; $x < 10; $x++) {
                if ($x == 4) {
                    break;
                }
                echo "The number is: $x <br>";
            }

            #Break in While Loop
            $x = 0;

            while($x < 10) {
                if ($x == 4) {
                    break;
                }
                echo "The number is: $x <br>";
                $x++;
            }

            #Break in Do While Loop
            $i = 1;

            do {
                if ($i == 3) break;
                echo $i;
                $i++;
            } while ($i < 6);

            #Break in For Each Loop
            $colors = array("red", "green", "blue", "yellow");

            foreach ($colors as $x) {
                if ($x == "blue") break;
                echo "$x <br>";
            }
        ?>
    </h1>
</body>
</html>

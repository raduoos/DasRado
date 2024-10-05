<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>While Loops | DasRado</title>
</head>

<body>
<h1>
    <?php
        $i = 1;
        while ($i < 6) {
            echo $i;
            $i++;
        }

        #The break statement
        $i = 1;
        while ($i < 6) {
            if ($i == 3) break;
            echo $i;
            $i++;
        }

        #The continue statement
        $i = 0;
        while ($i < 6) {
            $i++;
            if ($i == 3) continue;
            echo $i;
        }

    ?>
</h1>
</body>
</html>
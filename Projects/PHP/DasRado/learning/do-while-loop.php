<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Do While Loops | DasRado</title>
</head>

<body>
<h1>
    <?php
        $i = 1;

        do {
            echo $i;
            $i++;
        } while ($i < 6);

        #The break statement
        $i = 1;

        do {
            if ($i == 3) break;
            echo $i;
            $i++;
        } while ($i < 6);

        #The continue statement
        $i = 0;

        do {
            $i++;
            if ($i == 3) continue;
            echo $i;
        } while ($i < 6);

        ?>
</h1>
</body>
</html>
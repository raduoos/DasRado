<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Functions | DasRado</title>
</head>

<body>
<h1>
    <?php
        function myMessage() {
            echo "Hello world!";
        }

        myMessage();

        #Function arguments
        function familyName($fname, $year) {
            echo "$fname Refsnes. Born in $year <br>";
        }

        familyName("Hege", "1975");
        familyName("Stale", "1978");
        familyName("Kai Jim", "1983");

        #Default argument value
        function setHeight($minheight = 50) {
            echo "The height is : $minheight <br>";
        }

        setHeight(350);
        setHeight(); // will use the default value of 50
        setHeight(135);
        setHeight(80);

        #Returning values
        function sum($x, $y) {
            $z = $x + $y;
            return $z;
        }

        echo "5 + 10 = " . sum(5, 10) . "<br>";
        echo "7 + 13 = " . sum(7, 13) . "<br>";
        echo "2 + 4 = " . sum(2, 4);

        #Passing arguments by reference
        function add_five(&$value) {
            $value += 5;
        }

        $num = 2;
        add_five($num);
        echo $num;

    ?>
</h1>
</body>
</html>
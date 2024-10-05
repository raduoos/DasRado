<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>For Each Loops | DasRado</title>
</head>

<body>
<h1>
    <?php
        $colors = array("red", "green", "blue", "yellow");

        foreach ($colors as $x) {
            echo "$x <br>";
        }

        #Keys and values
        $members = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");

        foreach ($members as $x => $y) {
            echo "$x : $y <br>";
        }

        #Foreach loop on objects
        class Car {
            public $color;
            public $model;
            public function __construct($color, $model) {
                $this->color = $color;
                $this->model = $model;
            }
        }

        $myCar = new Car("red", "Volvo");

        foreach ($myCar as $x => $y) {
            echo "$x: $y <br>";
        }

        #The break statement
        $colors = array("red", "green", "blue", "yellow");

        foreach ($colors as $x) {
            if ($x == "blue") break;
            echo "$x <br>";
        }

        #The continue statement
        $colors = array("red", "green", "blue", "yellow");

        foreach ($colors as $x) {
            if ($x == "blue") continue;
            echo "$x <br>";
        }

        #Foreach Byref
        $colors = array("red", "green", "blue", "yellow");

        foreach ($colors as $x) {
            if ($x == "blue") $x = "pink";
        }

        var_dump($colors);
    ?>
</h1>
</body>
</html>
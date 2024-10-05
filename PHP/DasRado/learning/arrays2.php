<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Arrays 2 | DasRado</title>
</head>

<body>
<h1>
    <?php
    $cars = array("Volvo", "BMW", "Toyota");

    #Array items
    $myArr = array("Volvo", 15, ["apples", "bananas"], myFunction);

    #Array functions
    $cars = array("Volvo", "BMW", "Toyota");
    echo count($cars);

    #Indexed Arrays
    $cars = array("Volvo", "BMW", "Toyota");
    var_dump($cars);

    #Access Indexed Arrays
    $cars = array("Volvo", "BMW", "Toyota");
    echo $cars[0];

    #Change Value
    $cars = array("Volvo", "BMW", "Toyota");
    $cars[1] = "Ford";
    var_dump($cars);

    #Loop through an indexed array
    $cars = array("Volvo", "BMW", "Toyota");
    foreach ($cars as $x) {
        echo "$x <br>";
    }

    #Index Number
    $cars[0] = "Volvo";
    $cars[1] = "BMW";
    $cars[2] = "Toyota";

    array_push($cars, "Ford");
    var_dump($cars);

    #Associative Array
    $car = array("brand"=>"Ford", "model"=>"Mustang", "year"=>1964);
    var_dump($car);

    #Access Associative Arrays
    $car = array("brand"=>"Ford", "model"=>"Mustang", "year"=>1964);
    echo $car["model"];

    #Change value
    $car = array("brand"=>"Ford", "model"=>"Mustang", "year"=>1964);
    $car["year"] = 2024;
    var_dump($car);

    #Loop through an associative array
    $car = array("brand"=>"Ford", "model"=>"Mustang", "year"=>1964);

    foreach ($car as $x => $y) {
        echo "$x: $y <br>";
    }

    #Create Array
    $cars = ["Volvo", "BMW", "Toyota"];

    #Multiple Lines
    $cars = [
        "Volvo",
        "BMW",
        "Toyota"
    ];

    #Trailing Comma
    $cars = [
        "Volvo",
        "BMW",
        "Toyota",
    ];

    #Array keys
    $cars = [
        0 => "Volvo",
        1 => "BMW",
        2 =>"Toyota"
    ];

    $myCar = [
        "brand" => "Ford",
        "model" => "Mustang",
        "year" => 1964
    ];

    #Declare empty array
    $cars = [];
    $cars[0] = "Volvo";
    $cars[1] = "BMW";
    $cars[2] = "Toyota";

    $myCar = [];
    $myCar["brand"] = "Ford";
    $myCar["model"] = "Mustang";
    $myCar["year"] = 1964;

    #Mixing Array Keys
    $myArr = [];
    $myArr[0] = "apples";
    $myArr[1] = "bananas";
    $myArr["fruit"] = "cherries";

    #Last session: https://www.w3schools.com/php/php_arrays_access.asp
    ?>
</h1>
</body>
</html>

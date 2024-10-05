<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Strings | DasRado</title>
</head>

<body>
<h1>
    <?php
        $x = "John";
        echo 'Hello $x';

        # To know the length of a string
        echo strlen("Hello world!");

        # To know the word count number
        echo str_word_count("Hello world!");

        # To search or the text within a string
        echo strpos("Hello world!", "world");

        # To make the string uppercase
        $x = "Hello World!";
        echo strtoupper($x);

        # To make the string lowercase
        $x = "Hello World!";
        echo strtolower($x);

        # To replace the string
        $x = "Hello World!";
        echo str_replace("World", "Dolly", $x);

        # To reverse a string
        $x = "Hello World!";
        echo strrev($x);

        # To remove the whitespace
        $x = " Hello World! ";
        echo trim($x);

        # To convert the string into array
        $x = "Hello World!";
        $y = explode(" ", $x);

        print_r($y);

        # Concatenation of a string
        $x = "Hello";
        $y = "World";
        $z = $x . $y;
        echo $z;

    ?>
</h1>
</body>

</html>
<?php

    for ($x = 0; $x <= 10; $x++) {
        echo "Ciao \n";
    }

    echo "Ecco qua un array associativo di Dollaro_SERVER -> ";

    foreach ($_SERVER as $key => $value) { 
        echo "$key : $value " . "\n";
    }

?>
<?php
require_once('Account.php'); //require once, con eso funciono

class User extends Account {
    public function __construct($name, $document){
        parent::__construct($name, $document);
    }
}
?>
package com.syntax.class24;

public abstract class Database {
    abstract void open();
    abstract void readData();
    abstract boolean writeData();
    public void closeTheDatabase(){
        System.out.println("Terminate the connection to close it");
    }
}
class Informix extends Database{

    @Override
    void open() {
        System.out.println("Opening the Informix database class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the Informix");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }

    public void closeTheDatabase() {
        super.closeTheDatabase();
    }
}

class MySQLServer extends Database{

    @Override
    void open() {
        System.out.println("Opening the MySQL database class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the MySQLServer");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }
}
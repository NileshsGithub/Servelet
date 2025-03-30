package com.example.servlets;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionITP {
    static Connection con;
    public static Connection getConnection() throws Exception
    {

        String driverName="com.mysql.cj.jdbc.Driver";
        String dbUrl="jdbc:mysql://localhost:3306/temp";
        String dbUserName="root";
        String dbPassword="Nilesh@2002";

        Class.forName(driverName);
        con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
        return con;
    }
}
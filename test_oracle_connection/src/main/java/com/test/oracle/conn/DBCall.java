package com.test.oracle.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCall {

        public Connection getConn() {
                try {
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                } catch (ClassNotFoundException e){
                        System.out.println("OracleDriver not found");
                        e.printStackTrace();
                        return null;
                }

                Connection connection = null;
                try {
                        connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.15.30:1521:orcl","SCOTT","centos");
                } catch (SQLException e) {
                        System.out.println("Connection failed");
                        e.printStackTrace();
                        return null;
                }

                if (connection != null) {
                        System.out.println("Success");
                        return connection;
                } else {
                        System.out.println("Failed");
                        return null;
                }
        }
}


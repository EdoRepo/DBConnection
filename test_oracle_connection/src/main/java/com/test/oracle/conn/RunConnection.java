package com.test.oracle.conn;

import java.sql.Connection;
import java.sql.SQLException;

public class RunConnection {
        public static void main (String[] args) {
                DBCall testCon = new DBCall();
                Connection conn = testCon.getConn();
                if (conn != null )
                        try {
                                conn.close();
                                System.out.println("conn closed...");
                        } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
        }
}

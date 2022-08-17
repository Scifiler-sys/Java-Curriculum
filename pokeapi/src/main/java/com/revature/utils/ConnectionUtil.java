package com.revature.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static Connection con;

    private ConnectionUtil(){
        con = null;
    }

    public static Connection getConnection(){
        try {
            if (con != null && !con.isClosed()) {
                return con;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        Properties props = new Properties();

        String url, user, pass;

        try {
            props.load(new FileReader("C:\\Users\\Stephen - Work\\Documents\\Revature\\Java\\pokeapi\\src\\main\\resources\\application.properties"));
        
            url = props.getProperty("url");
            
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return con;
    }
}

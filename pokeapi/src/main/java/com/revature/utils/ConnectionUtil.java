package com.revature.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
            Class.forName("org.postgresql.Driver");

            props.load(new FileReader("C:\\Users\\StephenPagdilao\\Documents\\Revature\\Java\\Java Enterprise\\pokeapi\\src\\main\\resources\\database.properties"));
        
            url = props.getProperty("url");
            user = props.getProperty("user");
            pass = props.getProperty("pass");

            con = DriverManager.getConnection(url, user, pass);
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

        return con;
    }
}

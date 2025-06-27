package com.example.servingwebcontent.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@Controller
public class myConnection {
    @Value("${app.database.url}")
    private String urlString;

    @Value("${app.database.driver}")
    private String appDriver;

public Statement myDbConnection(){
    Connection conn = null;
        try {
           
            Class.forName(appDriver);
            conn = DriverManager.getConnection(
                    urlString);
            Statement sta = conn.createStatement();
            return sta;
}

catch(Exception e){
    System.out.println(e);

}

}
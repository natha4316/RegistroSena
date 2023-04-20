/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    
    Connection con;

    public conexion() 
    {
        try{
             class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tecnologo2023","root","");
        
        }catch(Exception e)
        {
        System.err.println("Err0or"+e);
        }
    }
    public Connection getConnection()
    {
        return con;
    }
    
    }

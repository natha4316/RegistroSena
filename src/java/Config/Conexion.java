/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    
    public Conexion()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tecnologo2023","root","");
        
        
        }catch(Exception e)
        {
         System.err.println("Error"+e);
        }
    }
    public Connection getConnection()
    {
        return con;
    }
    
}

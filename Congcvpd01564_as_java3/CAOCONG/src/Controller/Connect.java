
package Controller;

import java.sql.*;
import javax.swing.*;


public class Connect {
    public static Connection conn = null;
    
    public static Connection getConnect(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Quanli_Sinhvien1;userName=sa;password=123456;");
            System.out.println("Connection successful");
            return conn;
        }
        catch(Exception e){
            System.err.print("Connection Error");
        e.printStackTrace();
        return null;
        }
    }
    public static void main(String[] args) {
        System.out.println("ket noi thanh cong");
        System.out.println(getConnect());
    }
      
}

   

    


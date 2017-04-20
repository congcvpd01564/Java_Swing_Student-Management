/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import javax.swing.*;

public class Point {
    
    public static PreparedStatement pst = null;//biến thực thi câu lệnh sql;
    public static ResultSet rs = null;//kết quả trả về là 1 dòng hoặc 1 bảng
    public static Connection conn =Connect.getConnect();//phương thức kết nối với CSDL;
    
    //hàm chèn dữ liệu vào bảng
    public static void InsertPoint(String ID, String Username,String Topnotch, String Java,
                                String Csdl, String Mang)
    {
        String sql = "INSERT INTO Point VALUES(?,?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, ID);
            pst.setString(2, Username);
            pst.setString(3, Topnotch);
            pst.setString(4, Java);
            pst.setString(5, Csdl);
            pst.setString(6, Mang);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Add Sucessfull");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ID was exist");
        }
    }
    
     //hàm update
    public static void UpdatePoint(String ID1,String ID, String Username,String Topnotch, String Java,
                                String Csdl, String Mang)
        {
            String sql1 = "UPDATE Point SET ID ='"+ID+"',Username = '"+Username+"',"
                    + "TopNotch = '"+Topnotch+"',Java = '"+Java+"',CSDL = '"+Csdl+"',"
                    + "Mang = '"+Mang+"' WHERE ID = '"+ID1+"'";
            try{
                pst = conn.prepareStatement(sql1);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Update Sucessfull");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
//    
     public static void DeletePoint(String ID){
        String sql2 = "DELETE FROM Point WHERE ID = '"+ID+"'";
        try{
            pst = conn.prepareStatement(sql2);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Sucessfull");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

}

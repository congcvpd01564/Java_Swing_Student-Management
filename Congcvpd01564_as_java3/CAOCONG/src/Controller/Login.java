
package Controller;

import java.sql.*;
import javax.swing.*;

public class Login {
    public static PreparedStatement pst = null;//biến thực thi câu lệnh sql;
    public static ResultSet rs = null;//kết quả trả về là 1 dòng hoặc 1 bảng
    public static Connection conn =Connect.getConnect();//phương thức kết nối với CSDL;
    
    public static ResultSet loginUser(String user, String pass){
       String sql = "SELECT * FROM Users WHERE Username =? AND Pass = ?" ;
       try{
           pst = conn.prepareStatement(sql);
           pst.setString(1, user);
           pst.setString(2, pass);
           return rs = pst.executeQuery();
           
       }catch(Exception e){
           return rs = null;
       }
    
    }
    public static void changePass(String user, String pass){
        String sql = "UPDATE Users SET Pass = '"+pass+"' WHERE Username = '"+user+"'";
            try{
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Change Password Sucessfull");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
    }
}


package Controller;
import java.sql.*;
import javax.swing.*;
import Model.*;
import View.*;

public class Student {
    
    public static PreparedStatement pst = null;//biến thực thi câu lệnh sql;
    public static ResultSet rs = null;//kết quả trả về là 1 dòng hoặc 1 bảng
    public static Connection conn =Connect.getConnect();//phương thức kết nối với CSDL;
    
    //hàm chèn dữ liệu vào bảng
   public static void InsertStudent(String ID, String Lop,String Fullname,
                                String Dateofbirth, String Adress, String Email, String Phone)
    {                     
        String sql = "INSERT INTO Student VALUES(?,?,?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, ID);
            pst.setString(2, Lop);
            pst.setString(3, Fullname);
            pst.setString(4, Dateofbirth);
            pst.setString(5, Adress);
            pst.setString(6, Email);
            pst.setString(7, Phone);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Add Sucessfull");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ID was exist");
        }   
    }
   
    //hàm update
    public static void UpdateStudent(String ID1,String ID, String Lop,String Fullname,
                                String Dateofbirth, String Adress, String Email, String Phone)
        {
            String sql1 = "UPDATE Student SET ID ='"+ID+"',Class = '"+Lop+"',"
                    + "FullName = '"+Fullname+"',Dateofbirth = '"+Dateofbirth+"',"
                    + "Adress = '"+Adress+"',Email = '"+Email+"',Phone = '"+Phone+"' WHERE ID = '"+ID1+"'";
            try{
                pst = conn.prepareStatement(sql1);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Update Sucessfull");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
 
    //hàm Delete
    public static void DeleteStudent(String ID){
        String sql2 = "DELETE FROM Student WHERE ID = '"+ID+"'";
        try{
            pst = conn.prepareStatement(sql2);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Sucessfull");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}

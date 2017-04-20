
package Controller;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;//thu vien rs2xml

public class UpdataTable {
    public static PreparedStatement pst = null;//biến thực thi câu lệnh sql;
    public static ResultSet rs = null;//kết quả trả về là 1 dòng hoặc 1 bảng
    public static Connection conn =Connect.getConnect();//phương thức kết nối với CSDL;
    
    
    //hàm cập nhật dữ liệu cho bảng
    public static void LoadData(String sql,JTable tb){
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel(DbUtils.resultSetToTableModel(rs));
            //Nạp dữ liệu lên bảng mà mình truyền vào
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"Error",1);
        }
    }
    //hàm đổ dữ liệu ngược lên textfiled
    public static ResultSet ShowText(String sql){
        try{
             pst = conn.prepareStatement(sql);
             return pst.executeQuery();
             //trả về kết quả đọc được ở bảng.
        }catch(Exception e){
            return null;
        }
    }
    //load combobox
    public static void LoadDataCB(String sql, JComboBox cb, String bien){
        try{ 
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                cb.addItem(rs.getString(bien));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"Error",1);
        }
    }

}

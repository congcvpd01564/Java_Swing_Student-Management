
package View;

import java.sql.*;
import javax.swing.*;
import Controller.*;

public class FrmPoint extends javax.swing.JFrame {
    //gọi hàm cập nhật dữ liệu lên bảng jTableStudent;
    public static String sql = "SELECT * FROM Point ORDER BY ID ASC";
    //moi
    public static String sqluser = "SELECT * FROM Users ";
    public static String sqlstudent = "SELECT * FROM Student ";
    public static String masv;//biến tạm
    
    public FrmPoint() {
        initComponents();
        setLocationRelativeTo(null);
        
        UpdataTable.LoadDataCB(sqluser, jComboBoxUser, "Username");//lấy dữ liệu từ bảng Users.
        UpdataTable.LoadDataCB(sqlstudent, jComboBoxID, "ID");//lấy dữ liệu tù bảng Student.
        
        UpdataTable.LoadData(sql, jTablepoint);//cập nhật dữ liệu
        
        Control(false);
        //jTextFieldID.setEnabled(true);
        //jTextFieldUser.setEnabled(true);
        jComboBoxID.setEnabled(true);
        jComboBoxUser.setEnabled(true);
        jTextFieldAverage.setEnabled(true);
        jButtonadd.setEnabled(true);
        jButtontop.setEnabled(true);
    }
     public void Control(boolean b){//ẩn hiện button cần thiết
        jButtonadd.setEnabled(b);
        jButtontop.setEnabled(b);
        jButtonupdate.setEnabled(b);
        jButtondelete.setEnabled(b);
        jButtonreset.setEnabled(b);
        //jTextFieldID.setEnabled(b);
        //jTextFieldUser.setEnabled(b);
         jComboBoxID.setEnabled(b);
        jComboBoxUser.setEnabled(b);
        jTextFieldAverage.setEnabled(b);
    }
     //DiemTB
    public void DTB(){
        double TA = Double.parseDouble(jTextFieldTA.getText());
        double Java = Double.parseDouble(jTextFieldJava.getText());
        double Mang = Double.parseDouble(jTextFieldMang.getText());
        double CSDL = Double.parseDouble(jTextFieldSQL.getText());
        double dtb = (TA + Java + Mang +CSDL)/4.0;
        jTextFieldAverage.setText(dtb+"");
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAverage = new javax.swing.JTextField();
        jTextFieldJava = new javax.swing.JTextField();
        jTextFieldTA = new javax.swing.JTextField();
        jTextFieldSQL = new javax.swing.JTextField();
        jTextFieldMang = new javax.swing.JTextField();
        jComboBoxID = new javax.swing.JComboBox<>();
        jComboBoxUser = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButtontop = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtonreset = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablepoint = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuItemhangePass = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Computer-Network-icon.png"))); // NOI18N
        jLabel1.setText("APP STUDENT MANAGER");
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel2.setText("Information Point");
        jPanel2.add(jLabel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("information")));

        jLabel3.setText("ID");

        jLabel4.setText("User Name");

        jLabel5.setText("Average");

        jLabel6.setText("Java Point");

        jLabel7.setText("TopNotch Point");

        jLabel8.setText("SQL Point");

        jLabel9.setText("Mang Point");

        jTextFieldJava.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldJavaFocusLost(evt);
            }
        });
        jTextFieldJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJavaActionPerformed(evt);
            }
        });

        jTextFieldTA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTAFocusLost(evt);
            }
        });
        jTextFieldTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTAActionPerformed(evt);
            }
        });

        jTextFieldSQL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSQLFocusLost(evt);
            }
        });
        jTextFieldSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSQLActionPerformed(evt);
            }
        });

        jTextFieldMang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldMangFocusLost(evt);
            }
        });
        jTextFieldMang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAverage, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldJava)
                    .addComponent(jTextFieldTA)
                    .addComponent(jTextFieldSQL)
                    .addComponent(jTextFieldMang, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridLayout(5, 1));

        jButtontop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtontop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user-group.png"))); // NOI18N
        jButtontop.setText("Top");
        jButtontop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontopActionPerformed(evt);
            }
        });
        jPanel4.add(jButtontop);

        jButtonadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ListMenuPatient1.png"))); // NOI18N
        jButtonadd.setText("Add");
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonadd);

        jButtonupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save_1.png"))); // NOI18N
        jButtonupdate.setText("Update");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonupdate);

        jButtonreset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reset.png"))); // NOI18N
        jButtonreset.setText("Reset");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonreset);

        jButtondelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/File-Delete-icon.png"))); // NOI18N
        jButtondelete.setText("Delete");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtondelete);

        jTablepoint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablepoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablepointMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablepoint);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        jMenu1.setText("System");

        jMenuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLogout.setText("Log out");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLogout);

        jMenuItemhangePass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemhangePass.setText("Change Pass");
        jMenuItemhangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemhangePassActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemhangePass);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, 0));
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Management");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Window");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        // TODO add your handling code here:
        /*Point.InsertPoint(this.jTextFieldID.getText(), this.jTextFieldUser.getText(),
                this.jTextFieldTA.getText(), this.jTextFieldJava.getText(), 
                this.jTextFieldSQL.getText(), this.jTextFieldMang.getText());*/
        
         Point.InsertPoint((String)this.jComboBoxID.getSelectedItem(), (String)this.jComboBoxUser.getSelectedItem(),
                this.jTextFieldTA.getText(), this.jTextFieldJava.getText(), 
                this.jTextFieldSQL.getText(), this.jTextFieldMang.getText());
        UpdataTable.LoadData(sql, jTablepoint);//cập nhật dữ liệu
        
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        // TODO add your handling code here:
        
        /*Point.UpdatePoint(masv, this.jTextFieldID.getText(), this.jTextFieldUser.getText(), 
                this.jTextFieldTA.getText(), this.jTextFieldJava.getText(),
                this.jTextFieldSQL.getText(), this.jTextFieldMang.getText());*/
        
        Point.UpdatePoint(masv,(String)this.jComboBoxID.getSelectedItem(),(String)this.jComboBoxUser.getSelectedItem(), 
                this.jTextFieldTA.getText(), this.jTextFieldJava.getText(),
                this.jTextFieldSQL.getText(), this.jTextFieldMang.getText());
        UpdataTable.LoadData(sql, jTablepoint);//cập nhật dữ liệu
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        // TODO add your handling code here:
        Point.DeletePoint(masv);
        UpdataTable.LoadData(sql, jTablepoint);//cập nhật dữ liệu
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jTablepointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablepointMouseClicked
        // TODO add your handling code here:
        Control(false);
        jButtontop.setEnabled(true);
        jButtonupdate.setEnabled(true);
        jButtondelete.setEnabled(true);
        jButtonreset.setEnabled(true);
      
        
        try{
            int row = this.jTablepoint.getSelectedRow();//lấy dòng đang trỏ chuột.
            String IDrow = (this.jTablepoint.getModel().getValueAt(row, 0)).toString();//lấy giá trị dòng vừa nhấn chuột chuyển về kiểu String.
            String sql1 = "SELECT * FROM Point WHERE ID = '"+IDrow+"'";
            ResultSet rs = UpdataTable.ShowText(sql1);//đọc dòng dữ liệu hiện tại
            if(rs.next())//nếu có dữ liệu
            {
                masv = rs.getString("ID");//truyền cho biến tạm giá trị của cột ID trong CSDL;
                //thì lấy dữ liệu từ CSDL
                //this.jTextFieldID.setText(rs.getString("ID"));
                //this.jTextFieldUser.setText(rs.getString("Username"));
                this.jComboBoxID.setSelectedItem(rs.getString("ID"));
                this.jComboBoxUser.setSelectedItem(rs.getString("Username"));
                this.jTextFieldTA.setText(rs.getString("TopNotch"));
                this.jTextFieldJava.setText(rs.getString("Java"));
                this.jTextFieldSQL.setText(rs.getString("CSDL"));
                this.jTextFieldMang.setText(rs.getString("Mang"));
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTablepointMouseClicked

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        // TODO add your handling code here:
        Control(true);
        jButtonupdate.setEnabled(false);
        jButtonreset.setEnabled(false);
        jButtondelete.setEnabled(false);
        
        //this.jTextFieldID.setText(null);
        //this.jTextFieldUser.setText(null);
        this.jComboBoxID.setSelectedIndex(0);
        this.jComboBoxUser.setSelectedIndex(0);
        this.jTextFieldAverage.setText(null);
        this.jTextFieldJava.setText(null);
        this.jTextFieldTA.setText(null);
        this.jTextFieldSQL.setText(null);
        this.jTextFieldMang.setText(null);
        
        UpdataTable.LoadData(sql, jTablepoint);//cập nhật dữ liệu       
    }//GEN-LAST:event_jButtonresetActionPerformed

    private void jTextFieldJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJavaActionPerformed
        // TODO add your handling code here:
        DTB();
    }//GEN-LAST:event_jTextFieldJavaActionPerformed

    private void jTextFieldTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTAActionPerformed
        // TODO add your handling code here:
        DTB();
    }//GEN-LAST:event_jTextFieldTAActionPerformed

    private void jTextFieldSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSQLActionPerformed
        // TODO add your handling code here:
        DTB();
    }//GEN-LAST:event_jTextFieldSQLActionPerformed

    private void jTextFieldMangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMangActionPerformed
        // TODO add your handling code here:
        DTB();
    }//GEN-LAST:event_jTextFieldMangActionPerformed

    private void jTextFieldJavaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldJavaFocusLost
        // TODO add your handling code here:
        DTB();
    }//GEN-LAST:event_jTextFieldJavaFocusLost

    private void jTextFieldTAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTAFocusLost
        // TODO add your handling code here:
        DTB();
    }//GEN-LAST:event_jTextFieldTAFocusLost

    private void jTextFieldSQLFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSQLFocusLost
        // TODO add your handling code here:
        DTB();
    }//GEN-LAST:event_jTextFieldSQLFocusLost

    private void jTextFieldMangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMangFocusLost
        // TODO add your handling code here:
        DTB();
    }//GEN-LAST:event_jTextFieldMangFocusLost

    private void jButtontopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontopActionPerformed
        // TODO add your handling code here:           
       String sql1 = "SELECT TOP 3 * FROM Point ORDER BY (TopNotch + Java +CSDL + Mang)/4.0 DESC";        
       UpdataTable.LoadData(sql1, jTablepoint);
        Control(true);
        jButtonadd.setEnabled(false);
        //jTextFieldUser.setEnabled(false);
        //jTextFieldID.setEnabled(false);
        jComboBoxID.setEnabled(false);
        jComboBoxUser.setEnabled(false);
        jTextFieldAverage.setEnabled(false);
    }//GEN-LAST:event_jButtontopActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Do you want to exit");
        if(i== 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Do you want to log out");
        if(i== 0){
            FrmLogin lg = new FrmLogin();
            lg.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jMenuItemhangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemhangePassActionPerformed
        // TODO add your handling code here:
        FrmChangePass pass = new FrmChangePass();
        pass.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemhangePassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPoint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JButton jButtontop;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JComboBox<String> jComboBoxID;
    private javax.swing.JComboBox<String> jComboBoxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemhangePass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablepoint;
    private javax.swing.JTextField jTextFieldAverage;
    private javax.swing.JTextField jTextFieldJava;
    private javax.swing.JTextField jTextFieldMang;
    private javax.swing.JTextField jTextFieldSQL;
    private javax.swing.JTextField jTextFieldTA;
    // End of variables declaration//GEN-END:variables
}

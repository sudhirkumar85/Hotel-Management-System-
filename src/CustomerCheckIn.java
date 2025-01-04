
import db.DBConnection;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CustomerCheckIn extends javax.swing.JFrame {

    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = DBConnection.getCon();

    public CustomerCheckIn() {
        initComponents();
        SimpleDateFormat dat = new SimpleDateFormat("yyyy/MM/dd ");
        Date d = new Date();
        txtdate.setText(dat.format(d));
        txtname.requestFocus();
        itemChnage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        combogender = new javax.swing.JComboBox<>();
        txtnat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadhar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtaddres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        combobed = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        comboroomtype = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        comboroomnumber = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblemail = new javax.swing.JLabel();
        h = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checked.png"))); // NOI18N
        jLabel1.setText("Customer Check IN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 220, 70));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 380, 35));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 291, 36));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 380, 37));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 380, 27));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nationality");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 390, 29));

        txtname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 390, 42));

        txtmob.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtmob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmobFocusLost(evt);
            }
        });
        txtmob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmobKeyPressed(evt);
            }
        });
        getContentPane().add(txtmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 390, 40));

        txtemail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 390, 40));

        combogender.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        combogender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combogenderFocusLost(evt);
            }
        });
        combogender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogenderActionPerformed(evt);
            }
        });
        combogender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combogenderKeyPressed(evt);
            }
        });
        getContentPane().add(combogender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 390, 40));

        txtnat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtnat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnatFocusLost(evt);
            }
        });
        txtnat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnatKeyPressed(evt);
            }
        });
        getContentPane().add(txtnat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 390, 39));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Adhar Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 294, 38));

        txtadhar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtadharFocusLost(evt);
            }
        });
        txtadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadharKeyPressed(evt);
            }
        });
        getContentPane().add(txtadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 390, 42));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 294, 34));

        txtaddres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtaddres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddresFocusLost(evt);
            }
        });
        txtaddres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaddresMouseClicked(evt);
            }
        });
        txtaddres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddresActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 390, 38));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Check IN Date(Today)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 294, 40));

        txtdate.setEditable(false);
        txtdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 350, 38));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bed");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 257, 28));

        combobed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        combobed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        combobed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobedItemStateChanged(evt);
            }
        });
        getContentPane().add(combobed, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 350, 37));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Room Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 257, 40));

        comboroomtype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON AC" }));
        comboroomtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboroomtypeItemStateChanged(evt);
            }
        });
        comboroomtype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboroomtypeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboroomtypeMouseReleased(evt);
            }
        });
        comboroomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboroomtypeActionPerformed(evt);
            }
        });
        getContentPane().add(comboroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 350, 40));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Room Number");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 340, 40));

        comboroomnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboroomnumber.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboroomnumberItemStateChanged(evt);
            }
        });
        getContentPane().add(comboroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 350, 40));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 350, 30));

        txtprice.setEditable(false);
        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 350, 39));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 50, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 102));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Allote Room");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, -1, 40));

        jButton3.setBackground(new java.awt.Color(153, 0, 51));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 90, 40));

        lblemail.setForeground(new java.awt.Color(204, 0, 0));
        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 390, 20));

        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bac.jpg"))); // NOI18N
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtname.setText("");
        txtmob.setText("");
        txtnat.setText("");
        txtemail.setText("");
        txtadhar.setText("");
        txtaddres.setText("");
        combogender.setSelectedIndex(0);
        combobed.setSelectedIndex(0);
        comboroomtype.setSelectedIndex(0);
        if (comboroomnumber.getItemCount() == 0) {
            txtprice.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed

    }//GEN-LAST:event_txtdateActionPerformed

    private void comboroomnumberItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboroomnumberItemStateChanged
        try {
            pst = con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (SQLException e) {
        }

    }//GEN-LAST:event_comboroomnumberItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtname.requestFocus();
        } else if (txtmob.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtmob.requestFocus();
        } else if (txtemail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtemail.requestFocus();
        } else if (txtnat.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtnat.requestFocus();
        } else if (txtadhar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtadhar.requestFocus();
        } else if (txtaddres.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtaddres.requestFocus();
        } else if (txtprice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Sorry, This type of Room Not avaible Select another room ");
            txtaddres.requestFocus();
        } else if (txtmob.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Mobile Number Should be 10 Digit.");
        } else if (txtadhar.getText().length() != 12) {
            JOptionPane.showMessageDialog(this, "Adhar Number Should be 12 Digit.");
        } else {
            try {
                long l = Long.parseLong(txtmob.getText());
                l = Long.parseLong(txtadhar.getText());

                try {
                    pst = con.prepareStatement("insert into customer(name,mobile,email,gender,address,id,nationality,date,roomnumber,bed,roomtype,price,status)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    pst.setString(1, txtname.getText());
                    pst.setString(2, txtmob.getText());
                    pst.setString(3, txtemail.getText().toLowerCase());
                    pst.setString(4, combogender.getItemAt(combogender.getSelectedIndex()));
                    pst.setString(5, txtaddres.getText());
                    pst.setString(6, txtadhar.getText());
                    pst.setString(7, txtnat.getText());
                    pst.setString(8, txtdate.getText());
                    pst.setString(9, (String) comboroomnumber.getSelectedItem());
                    pst.setString(10, (String) combobed.getSelectedItem());
                    pst.setString(11, (String) comboroomtype.getSelectedItem());
                    pst.setString(12, txtprice.getText());
                    pst.setString(13, "NULL");
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Room Alloted");
                    pst = con.prepareStatement("update room set status=? where roomnumber=?");
                    pst.setString(1, "Booked");
                    pst.setString(2, (String) comboroomnumber.getSelectedItem());
                    pst.executeUpdate();
                   itemChnage();
                    txtname.setText("");
                    txtmob.setText("");
                    txtnat.setText("");
                    txtemail.setText("");
                    txtadhar.setText("");
                    txtaddres.setText("");
                    combogender.setSelectedIndex(0);
                    combobed.setSelectedIndex(0);
                    comboroomtype.setSelectedIndex(0);
                    if (comboroomnumber.getItemCount() == 0) {
                        txtprice.setText("");
                    }
                } catch (HeadlessException | SQLException e) {
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Either Mobile Number or Adhar Number Not valied");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboroomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeActionPerformed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseReleased

    private void comboroomtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboroomtypeItemStateChanged
        itemChnage();
    }//GEN-LAST:event_comboroomtypeItemStateChanged

    private void comboroomtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboroomtypeMouseClicked
    }//GEN-LAST:event_comboroomtypeMouseClicked

    private void comboroomtypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboroomtypeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeMouseReleased

    private void combobedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobedItemStateChanged
       itemChnage();
    }//GEN-LAST:event_combobedItemStateChanged

    private void txtaddresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddresActionPerformed

    private void txtaddresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaddresMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddresMouseClicked

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained

    }//GEN-LAST:event_txtnameFocusGained

    private void txtmobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmobFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobFocusLost

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailFocusLost

    private void combogenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combogenderFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_combogenderFocusLost

    private void txtnatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnatFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnatFocusLost

    private void txtadharFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtadharFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadharFocusLost

    private void txtaddresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddresFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddresFocusLost

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
    }//GEN-LAST:event_txtnameFocusLost

    private void combogenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combogenderActionPerformed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtmob.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtmobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtemail.requestFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_txtmobKeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            combogender.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyPressed

    private void combogenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combogenderKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtnat.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_combogenderKeyPressed

    private void txtnatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnatKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtadhar.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnatKeyPressed

    private void txtadharKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadharKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtaddres.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtadharKeyPressed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        txtemail.setText(txtemail.getText().toLowerCase());

        int a = txtemail.getText().indexOf('@');
        int b = txtemail.getText().length();
        if (a == -1) {
            lblemail.setText("Invalied Email id");
        } else if (b > a + 1) {
            String s = txtemail.getText();
            String[] splitString = s.split("@");
            if (splitString[1].equalsIgnoreCase("gmail.com")) {
                lblemail.setText("");
            } else {
                lblemail.setText(" Invalied Email id");
            }
        }
        if (txtemail.getText().equals(""))
            lblemail.setText("");
    }//GEN-LAST:event_txtemailKeyReleased

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
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobed;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JComboBox<String> comboroomnumber;
    private javax.swing.JComboBox<String> comboroomtype;
    private javax.swing.JLabel h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtaddres;
    private javax.swing.JTextField txtadhar;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnat;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables

    private void itemChnage() {
        try {
            pst = con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bed=?");
            pst.setString(1, "Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobed.getItemAt(combobed.getSelectedIndex()));
            rs = pst.executeQuery();
            comboroomnumber.removeAllItems();
            while (rs.next()) {
                comboroomnumber.addItem(rs.getString("roomnumber"));
            }
            pst = con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, (String) comboroomnumber.getSelectedItem());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

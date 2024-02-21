/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhathuoc;

import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author TienNV
 */
public class UpdateMedicine extends javax.swing.JFrame {

    /**
     * Creates new form UpdateMedicine
     */
    public String numberParttern = "^[0-9]*$";
    
    public UpdateMedicine() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        medidt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mednamet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        providert = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantityt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        unitt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        unitpricet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addquantityt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ingret = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        effectt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cập nhật thuốc");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã thuốc");

        medidt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medidtActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton2.setText("Tìm kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên thuốc");

        jLabel4.setText("Nhà cung cấp");

        jLabel5.setText("Số lượng");

        jLabel6.setText("Đơn vị");

        jLabel7.setText("Đơn giá");

        jLabel8.setText("Thêm số lượng");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save.png"))); // NOI18N
        jButton3.setText("Cập nhật");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Thành phần");

        jLabel10.setText("Công dụng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(320, 320, 320)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(medidt, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButton2)
                                .addGap(0, 127, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(unitpricet, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(unitt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantityt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(providert, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mednamet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(addquantityt)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ingret)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(effectt))
                                .addGap(54, 54, 54)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medidt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mednamet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addquantityt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(providert, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(ingret))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effectt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitpricet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medidtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medidtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medidtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int checkmedExist = 0;
        String medid = medidt.getText();
        if (medid.equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập id thuốc");
        }
        else{
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from medicine where medid_pk = '"+medid+"'");
                while(rs.next()){
                    medidt.setEditable(false);
                    mednamet.setText(rs.getString("medname"));
                    providert.setText(rs.getString("provider"));
                    quantityt.setText(rs.getString("quantity"));
                    unitt.setText(rs.getString("unit"));
                    unitpricet.setText(rs.getString("unitprice"));
                    ingret.setText(rs.getString("ingre"));
                    effectt.setText(rs.getString("effect"));
                    quantityt.setEditable(false);
                    checkmedExist = 1;
                }
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            if(checkmedExist == 0){
                JOptionPane.showMessageDialog(null, "Thuốc không tồn tại");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String medid = medidt.getText();
        String medname = mednamet.getText();
        String provider = providert.getText();
        String quantity = quantityt.getText();
        String unit = unitt.getText();
        String unitprice = unitpricet.getText();
        String ingre = ingret.getText();
        String effect = effectt.getText();
        String addquantity = addquantityt.getText();
        
        int totalquantity = 0;
        if(addquantity.equals("")){
            totalquantity = Integer.parseInt(quantity);
        }
        else{
            totalquantity = Integer.parseInt(quantity)+ Integer.parseInt(addquantity);
        }
        
        if(medid.equals("")){
            JOptionPane.showMessageDialog(null, "vui lòng nhập mã thuốc");
        }
        else if(medname.equals("")){
            JOptionPane.showMessageDialog(null, "Tên thuốc là bắt buộc");
        }
        else if(provider.equals("")){
            JOptionPane.showMessageDialog(null, "Nhà cung cấp là bắt buộc");
        }
        else if(quantity.equals("")){
            JOptionPane.showMessageDialog(null, "Số lượng là bắt buộc");
        }
        else if(unit.equals("")){
            JOptionPane.showMessageDialog(null, "Đơn vị là bắt buộc");
        }
        else if(unitprice.equals("")){
            JOptionPane.showMessageDialog(null, "Đơn giá là bắt buộc");
        }
        else if(ingre.equals("")){
            JOptionPane.showMessageDialog(null, "Thành phần là bắt buộc");
        }
        else if(effect.equals("")){
            JOptionPane.showMessageDialog(null, "Công dụng là bắt buộc");
        }
        else if(!addquantity.matches(numberParttern)){
            JOptionPane.showMessageDialog(null, "Số lượng thuốc thêm phải là 1 số nguyên dương");
        }
        else if(!unitprice.matches(numberParttern)){
            JOptionPane.showMessageDialog(null, "Đơn giá phải là 1 số nguyên dương");
        }
        else{
            try{
            Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update medicine set medname=?, provider=?, quantity=?,unit=?,unitprice=?,ingre=?,effect=? where medid_pk =?");
                ps.setString(1, medname);
                ps.setString(2, provider);
                ps.setInt(3, totalquantity);
                ps.setString(4, unit);
                ps.setString(5, unitprice);
                ps.setString(6, ingre);
                ps.setString(7, effect);
                ps.setInt(8, Integer.parseInt(medid));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Thông tin thuốc đã được cập nhật");
                setVisible(false);
                new UpdateMedicine().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addquantityt;
    private javax.swing.JTextField effectt;
    private javax.swing.JTextField ingret;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField medidt;
    private javax.swing.JTextField mednamet;
    private javax.swing.JTextField providert;
    private javax.swing.JTextField quantityt;
    private javax.swing.JTextField unitpricet;
    private javax.swing.JTextField unitt;
    // End of variables declaration//GEN-END:variables
}

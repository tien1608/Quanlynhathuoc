/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhathuoc;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPdf;
import dao.ConnectionProvider;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.management.modelmbean.ModelMBean;
import javax.swing.table.TableModel;
import java.util.Date;
import dao.PharmacyUtils;
/**
 *
 * @author Tien
 */
public class SellMedicine extends javax.swing.JFrame {

    /**
     * Creates new form SellMedicine
     */
    public String numberParttern = "^[0-9]*$";
    private int finaltotalPrice = 0;
    private String billId = "";
    private String username = "";

    public SellMedicine() {
        initComponents();
    }

    public SellMedicine(String tempUsername) {
        initComponents();
        username = tempUsername;
        setLocationRelativeTo(null);
    }

    private void medicineName(String mednameORmedid) {
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
        model.setRowCount(0);
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medicine WHERE medname LIKE '" + mednameORmedid + "%' OR medid_pk LIKE '" + mednameORmedid + "%'");
  
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("medid_pk")+"- " + rs.getString("medname")});
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearMedicineFields(){
        medidt.setText("");
        mednamet.setText("");
        totalpricet.setText("");
        unitt.setText("");
        unitpricet.setText("");
        quantityt.setText("");
        
    }
    public String getMedid(String prefix){
        return prefix + System.nanoTime();
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
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        searcht = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        medidt = new javax.swing.JTextField();
        mednamet = new javax.swing.JTextField();
        unitpricet = new javax.swing.JTextField();
        unitt = new javax.swing.JTextField();
        quantityt = new javax.swing.JTextField();
        totalpricet = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        btnAddToCard = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customerNamet = new javax.swing.JTextField();
        mobileNumbert = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addresst = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bán thuốc");

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Tìm kiếm");

        searcht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtActionPerformed(evt);
            }
        });
        searcht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtKeyReleased(evt);
            }
        });

        medicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Medicines"
            }
        ));
        medicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicineTable);

        jLabel10.setText("Mã thuốc");

        jLabel11.setText("Tên thuốc");

        jLabel13.setText("đơn giá");

        jLabel14.setText("Đơn vị");

        jLabel15.setText("số lượng");

        jLabel17.setText("Thành tiền");

        quantityt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantitytKeyReleased(evt);
            }
        });

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thuốc", "Tên thuốc", "Đơn giá", "Đơn vị", "Số lượng", "Thành tiền"
            }
        ));
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        btnAddToCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add to cart.png"))); // NOI18N
        btnAddToCard.setText("Thêm vào giỏ hàng");
        btnAddToCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCardActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save.png"))); // NOI18N
        jButton1.setText("Xuất hóa đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tổng");

        lbltotal.setText("00");

        jLabel2.setText("Tên khách hàng");

        jLabel4.setText("Số điện thoại khách hàng");

        jLabel5.setText("địa chỉ");

        addresst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searcht, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addresst, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(customerNamet)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(medidt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mednamet)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quantityt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                                .addGap(222, 222, 222)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(totalpricet)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(unitpricet, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(unitt)
                                    .addComponent(mobileNumbert)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addGap(80, 80, 80)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton1)
                .addGap(304, 304, 304)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddToCard)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searcht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(unitpricet)
                            .addComponent(medidt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mednamet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalpricet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerNamet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNumbert, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addresst, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCard))
                .addGap(216, 216, 216))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        medicineName("");
        medidt.setEditable(false);
        mednamet.setEditable(false);
        unitpricet.setEditable(false);
        unitt.setEditable(false);
        totalpricet.setEditable(false);
        
    }//GEN-LAST:event_formComponentShown

    private void searchtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtActionPerformed

    private void searchtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtKeyReleased
        // TODO add your handling code here:
        String search = searcht.getText();
        medicineName(search);
    }//GEN-LAST:event_searchtKeyReleased

    private void medicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineTableMouseClicked
        // TODO add your handling code here:
        int index = medicineTable.getSelectedRow();
        TableModel model = medicineTable.getModel();
        String mednameORmedid = model.getValueAt(index, 0).toString();
        String medid[] = mednameORmedid.split("-",0);
        try{
            Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from medicine where medid_pk ="+medid[0]+"");
        
        while(rs.next()){
            medidt.setText(medid[0]);
            mednamet.setText(rs.getString("medname"));
            unitpricet.setText(rs.getString("unitprice"));
            unitt.setText(rs.getString("unit"));
            quantityt.setText("");
            totalpricet.setText("");
        }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_medicineTableMouseClicked

    private void quantitytKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantitytKeyReleased
        // TODO add your handling code here:
        String quantityString = quantityt.getText();
    if (!quantityString.equals("")) {
        String priceString = unitpricet.getText();
        if (!quantityString.matches(numberParttern)) {
            JOptionPane.showMessageDialog(null, "Số lượng không hợp lệ");
        } else {
            int quantity = Integer.parseInt(quantityString);
            int price = Integer.parseInt(priceString);
            int totalPrice = quantity * price;
            totalpricet.setText(String.valueOf(totalPrice));
        }
    } else {
        totalpricet.setText("");
    }
    }//GEN-LAST:event_quantitytKeyReleased

    private void btnAddToCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCardActionPerformed
        // TODO add your handling code here:
        String quantity = quantityt.getText();
        String medid = medidt.getText();
        
        if(!quantity.equals("")&&!medid.equals("")){
            String medname = mednamet.getText();
            String unit = unitt.getText();
            String unitprice = unitpricet.getText();
            String totalPice = totalpricet.getText();
            int checkStock = 0;
            int checkMedExistInCart = 0;
            
            try{
                Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from medicine where medid_pk ="+medid+"");
            while(rs.next()){
                if(rs.getInt("quantity")>= Integer.parseInt(quantity)){
                    checkStock = 1;
                }
                else{
                    JOptionPane.showMessageDialog(null,"không đủ lượng thuốc trong kho" );
                }
            }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            if (checkStock==1){
                DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
                if(cartTable.getRowCount()!=0){
                    for(int i=0;i<cartTable.getRowCount();i++){
                        if(Integer.parseInt(dtm.getValueAt(i, 0).toString())==Integer.parseInt(medid)){
                            checkMedExistInCart =1;
                            JOptionPane.showMessageDialog(null, "thuốc đã có trong giỏ hàng");
                        }
                    }
                }
                if(checkMedExistInCart==0){
                    dtm.addRow(new Object[]{medid, medname , unitprice, unit, quantity, totalPice});
                    finaltotalPrice = finaltotalPrice + Integer.parseInt(totalPice);
                    lbltotal.setText(String.valueOf(finaltotalPrice));
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                }
                clearMedicineFields();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
        
    }//GEN-LAST:event_btnAddToCardActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:
        int index = cartTable.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa đơn hàng này", "Chọn",JOptionPane.YES_NO_OPTION);
        if(a==0){
           TableModel model = cartTable.getModel();
           String total = model.getValueAt(index, 5).toString();
           finaltotalPrice = finaltotalPrice - Integer.parseInt(total);
           lbltotal.setText(String.valueOf(finaltotalPrice));
           ((DefaultTableModel) cartTable.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_cartTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(finaltotalPrice != 0){
        billId = getMedid("bill-");
        DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
        if(cartTable.getRowCount() != 0){
            for(int i = 0; i < cartTable.getRowCount(); i++){
                try{
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();
                    st.executeUpdate("UPDATE medicine SET quantity = quantity - " + Integer.parseInt(dtm.getValueAt(i, 4).toString()) + " WHERE medid_pk = " + Integer.parseInt(dtm.getValueAt(i, 0).toString()));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        try{
            SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
            Calendar cal = Calendar.getInstance();
            Connection con = ConnectionProvider.getCon();
            String customerName = customerNamet.getText();
            String mobileNumber = mobileNumbert.getText();
            String address = addresst.getText();
            PreparedStatement ps = con.prepareStatement("INSERT INTO bills(billid,date,totalpaid,billcreator,customerName,mobileNumber,address) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, billId);
            ps.setString(2, myFormat.format(cal.getTime()));
            ps.setInt(3, finaltotalPrice);
            ps.setString(4, username);
            ps.setString(5, customerName);
            ps.setString(6, mobileNumber);
            ps.setString(7, address);
            ps.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(PharmacyUtils.billPath + billId + ".pdf"));
            doc.open();
            Paragraph pharmacyName = new Paragraph("Quan ly nha thuoc demo\n");
            doc.add(pharmacyName);
            Paragraph starLine = new Paragraph("**************************************");
            doc.add(starLine);
            Paragraph details = new Paragraph("\tMa bill: " + billId + "\nNgay lap: " + new Date() + "\nTong tien: " + finaltotalPrice +"\nKhach hang: " + customerNamet.getText() + "\nSo dien thoai: "+ mobileNumbert.getText() + "\nDia chi KH: " + addresst.getText()+"\nNguoi lap bill: "+ username);
            doc.add(details);
            doc.add(starLine);
            PdfPTable tbl = new PdfPTable(6);
            tbl.addCell("Ma thuoc");
            tbl.addCell("Ten thuoc");
            tbl.addCell("Don vi");
            tbl.addCell("Don gia");
            tbl.addCell("So luong");
            tbl.addCell("Tong tien");
            for(int i = 0; i < cartTable.getRowCount(); i++){
                String a = cartTable.getValueAt(i, 0).toString();
                String b = cartTable.getValueAt(i, 1).toString();
                String c = cartTable.getValueAt(i, 2).toString();
                String d = cartTable.getValueAt(i, 3).toString();
                String e = cartTable.getValueAt(i, 4).toString();
                String f = cartTable.getValueAt(i, 5).toString();
                tbl.addCell(a);
                tbl.addCell(b);
                tbl.addCell(c);
                tbl.addCell(d);
                tbl.addCell(e);
                tbl.addCell(f);
            }
            doc.add(tbl);
            doc.add(starLine); 
            OpenPdf.openById(billId);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        doc.close();
        setVisible(false);
        new SellMedicine(username).setVisible(true);
    }
    else {
        JOptionPane.showMessageDialog(null, "Vui lòng thêm thuốc vào giỏ");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addresstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstActionPerformed

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
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresst;
    private javax.swing.JButton btnAddToCard;
    private javax.swing.JTable cartTable;
    private javax.swing.JTextField customerNamet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable medicineTable;
    private javax.swing.JTextField medidt;
    private javax.swing.JTextField mednamet;
    private javax.swing.JTextField mobileNumbert;
    private javax.swing.JTextField quantityt;
    private javax.swing.JTextField searcht;
    private javax.swing.JTextField totalpricet;
    private javax.swing.JTextField unitpricet;
    private javax.swing.JTextField unitt;
    // End of variables declaration//GEN-END:variables
}

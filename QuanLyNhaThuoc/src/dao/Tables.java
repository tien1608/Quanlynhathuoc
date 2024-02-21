package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Tien
 */
public class Tables {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
//            String createTableSql = "CREATE TABLE bills (" +
//                         "bill_pk int AUTO_INCREMENT PRIMARY KEY, " +
//                         "billid VARCHAR(200), " +
//                         "date VARCHAR(200), " +
//                         "totalpaid VARCHAR(200), " +
//                         "billcreator VARCHAR(200), " +
//                         "customerName VARCHAR(200), " +
//                         "mobileNumber VARCHAR(50), " +
//                         "address VARCHAR(200))";
//            st.executeUpdate(createTableSql);
            
//            String insertSql = "INSERT INTO appuser (userRole, name, dob, mobileNumber, email, username, password, address) " +
//                               "VALUES ('Admin', 'Admin', '2002-08-16', '0978706634', 'admin@email.com', 'admin', '1', 'Ha Noi')";
//            st.executeUpdate(insertSql);
            JOptionPane.showMessageDialog(null, "Thêm dữ liệu thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

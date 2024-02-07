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
            
            // Uncomment the following lines if the table 'appuser' hasn't been created yet
//            String createTableSql = "CREATE TABLE appuser (" +
//                         "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, " +
//                         "userRole VARCHAR(200), " +
//                         "name VARCHAR(200), " +
//                         "dob VARCHAR(50), " +
//                         "mobileNumber VARCHAR(50), " +
//                         "email VARCHAR(200), " +
//                         "username VARCHAR(200), " +
//                         "password VARCHAR(50), " +
//                         "address VARCHAR(200))";
//            st.executeUpdate(createTableSql);
            
            String insertSql = "INSERT INTO appuser (userRole, name, dob, mobileNumber, email, username, password, address) " +
                               "VALUES ('Admin', 'Admin', '2002-08-16', '0978706634', 'admin@email.com', 'admin', '1', 'Ha Noi')";
            st.executeUpdate(insertSql);
            JOptionPane.showMessageDialog(null, "Thêm dữ liệu thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

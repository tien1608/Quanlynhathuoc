/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import dao.PharmacyUtils;
import javax.swing.JOptionPane;
import java.io.File;

/**
 * A class to open PDF files based on their IDs.
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            // Kiểm tra xem tệp PDF có tồn tại không
            File pdfFile = new File(PharmacyUtils.billPath + id + ".pdf");
            if (pdfFile.exists()) {
                // Mở tệp PDF bằng cách sử dụng ứng dụng mặc định của hệ thống
                Process p = Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + pdfFile.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "File không tồn tại");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}


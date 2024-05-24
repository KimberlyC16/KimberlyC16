/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.dbconnector;
import java.awt.Component;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import myApp.logBoard;
import myApp.printAppForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hariell
 */
public class studentRep extends javax.swing.JInternalFrame {

    /**
     * Creates new form April10
     */
    public studentRep() {
        initComponents();
        displayData();
    }
    public String ad = "";

    public void displayData() {

        try {
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT table_student.student_id, \n"
                    + "                    table_student.gmail, \n"
                    + "                    table_student.name, \n"
                    + "                    table_student.student_course, \n"
                    + "                    table_scholarship.scholarship_status ,\n"
                    + "                    table_scholarship.scholarship_name \n"
                    + "                    FROM application_table \n"
                    + "                    LEFT JOIN table_student ON application_table.student_id = table_student.student_id \n"
                    + "                    LEFT JOIN table_scholarship ON application_table.scholarship_id = table_scholarship.scholarship_id");
            rep.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            System.out.println("Error Message" + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rep = new javax.swing.JTable();
        inf = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(null);

        rep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(rep);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 122, 690, 380);

        inf.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        inf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-print-30.png"))); // NOI18N
        inf.setText("Information");
        inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infActionPerformed(evt);
            }
        });
        jPanel1.add(inf);
        inf.setBounds(480, 80, 130, 30);

        print.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        print.setText("Table");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(620, 80, 110, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-log-out-30.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(700, 10, 30, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void repMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repMouseClicked

    }//GEN-LAST:event_repMouseClicked

    private void infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infActionPerformed
        printAppForm rp = new printAppForm();
        int selectedRow = rep.getSelectedRow();

        if (selectedRow != -1) {
            try {
                DefaultTableModel model = (DefaultTableModel) rep.getModel();
                int columnCount = model.getColumnCount();
                StringBuilder rowData = new StringBuilder();

                String[] columnHeaders = {"\tStudent ID", "\tGmail", "\tName", "\tStudent Course", "\tScholarship Status", "\tScholarship Name"};
                String[] rowDataValues = new String[columnCount];

                for (int column = 0; column < columnCount; column++) {
                    rowDataValues[column] = model.getValueAt(selectedRow, column).toString();
                }

                String header = "\n\tReport Page\n\n";

                String details = "\tApplication Details:\n\n\n";
                rowData.append(header);
                rowData.append(details);

                for (int i = 0; i < columnHeaders.length; i++) {
                    rowData.append(columnHeaders[i]).append(": ").append(rowDataValues[i]).append("\n");
                    rowData.append("\n");
                }
                rp.setVisible(true);
                rp.print.setText(rowData.toString());
                rp.print.setAlignmentX(Component.CENTER_ALIGNMENT);
                rp.print.setAlignmentY(Component.CENTER_ALIGNMENT);
                rp.ads = ad;
                Font font = new Font("Tahoma", Font.BOLD, 15);

                rep.print();
                JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                mainFrame.dispose();
                this.dispose();
            } catch (Exception e) {
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select an Item");
        }
    }//GEN-LAST:event_infActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("SCHOLAR REPORT");
        MessageFormat footer = new MessageFormat("Scholarship");
        try {
            rep.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Cannot be print!" + e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        JFrame mainJFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainJFrame.dispose();
        logBoard lb = new logBoard();
        lb.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel12MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inf;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton print;
    public javax.swing.JTable rep;
    // End of variables declaration//GEN-END:variables
}

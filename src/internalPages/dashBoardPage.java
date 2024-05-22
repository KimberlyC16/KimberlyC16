/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import myApp.logBoard;
import static myApp.studentPage.images;
import myApp.userPage;

/**
 *
 * @author Hariell
 */
public class dashBoardPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashBoardPage
     */
    public String name = "";
    public String ads = "";
    public static String images;

    public dashBoardPage() {

        initComponents();

        //dash.setBackground(new Color(50, 5, 5, 50));
        dash1.setBackground(new Color(50, 5, 5, 50));
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }

    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    Color navcolor = new Color(255, 255, 255);
    Color headercolor = new Color(240, 240, 240);
    Color bodycolor = new Color(240, 240, 240);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardPage6 = new javax.swing.JPanel();
        dash1 = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        applicationForm = new javax.swing.JPanel();
        man1 = new javax.swing.JLabel();
        userInfo = new javax.swing.JPanel();
        man2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(630, 580));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boardPage6.setBackground(new java.awt.Color(153, 204, 255));
        boardPage6.setPreferredSize(new java.awt.Dimension(630, 580));
        boardPage6.setRequestFocusEnabled(false);

        dash1.setBackground(new java.awt.Color(51, 153, 255));
        dash1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        settings.setBackground(new java.awt.Color(255, 255, 255));
        settings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-administrator-male-100.png"))); // NOI18N

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        applicationForm.setBackground(new java.awt.Color(255, 255, 255));
        applicationForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        applicationForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicationFormMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applicationFormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applicationFormMouseExited(evt);
            }
        });

        man1.setBackground(new java.awt.Color(255, 255, 255));
        man1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        man1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        man1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-business-report-100.png"))); // NOI18N

        javax.swing.GroupLayout applicationFormLayout = new javax.swing.GroupLayout(applicationForm);
        applicationForm.setLayout(applicationFormLayout);
        applicationFormLayout.setHorizontalGroup(
            applicationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applicationFormLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(man1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        applicationFormLayout.setVerticalGroup(
            applicationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applicationFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(man1))
        );

        userInfo.setBackground(new java.awt.Color(255, 255, 255));
        userInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userInfoMouseExited(evt);
            }
        });

        man2.setBackground(new java.awt.Color(153, 204, 255));
        man2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        man2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        man2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-folder-100.png"))); // NOI18N

        javax.swing.GroupLayout userInfoLayout = new javax.swing.GroupLayout(userInfo);
        userInfo.setLayout(userInfoLayout);
        userInfoLayout.setHorizontalGroup(
            userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(man2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userInfoLayout.setVerticalGroup(
            userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(man2)
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ched_header.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dash1Layout = new javax.swing.GroupLayout(dash1);
        dash1.setLayout(dash1Layout);
        dash1Layout.setHorizontalGroup(
            dash1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dash1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(applicationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        dash1Layout.setVerticalGroup(
            dash1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(dash1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(applicationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(dash1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout boardPage6Layout = new javax.swing.GroupLayout(boardPage6);
        boardPage6.setLayout(boardPage6Layout);
        boardPage6Layout.setHorizontalGroup(
            boardPage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        boardPage6Layout.setVerticalGroup(
            boardPage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(boardPage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userInfoMouseExited
        userInfo.setBackground(bodycolor);
    }//GEN-LAST:event_userInfoMouseExited

    private void userInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userInfoMouseEntered
        userInfo.setBackground(navcolor);
    }//GEN-LAST:event_userInfoMouseEntered

    private void userInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userInfoMouseClicked
        JFrame mainJFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainJFrame.dispose();
        userPage ap = new userPage();
        ap.setVisible(true);
        this.hide();
        ap.ads = ads;
    }//GEN-LAST:event_userInfoMouseClicked

    private void applicationFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationFormMouseExited
        applicationForm.setBackground(bodycolor);
    }//GEN-LAST:event_applicationFormMouseExited

    private void applicationFormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationFormMouseEntered
        applicationForm.setBackground(navcolor);
    }//GEN-LAST:event_applicationFormMouseEntered

    private void applicationFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationFormMouseClicked
        JFrame mainJFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainJFrame.dispose();
        report rb = new report();
        rb.setVisible(true);
        this.hide();
        rb.ad = ads;
    }//GEN-LAST:event_applicationFormMouseClicked

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setBackground(bodycolor);
    }//GEN-LAST:event_settingsMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setBackground(navcolor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked

        logBoard lb = new logBoard();
        admin ad = new admin();
        String email = lb.email;
        Connection conn = null;
        String newImage = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scholarshipsystem", "root", "");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM user_table WHERE email = ?");
            statement.setString(1, email);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                ad.studentId.setText(rs.getString("user_id"));
                ad.user.setText(rs.getString("username"));
                ad.num.setText(rs.getString("contact"));
                newImage = rs.getString("image");
                ad.uname = name;
            }

            if (newImage != null && !newImage.isEmpty()) {
                Image icon = Toolkit.getDefaultToolkit().createImage(newImage);
                icon = icon.getScaledInstance(100, 140, Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(icon);
                ad.image.setIcon(imageIcon);
            } else {
                // Handle the case when the image path is null or empty
                // For example, display a default image or show an error message
                ad.image.setIcon(new ImageIcon("path/to/default/image.jpg"));
                System.err.println("Image URL is null or empty.");
            }

            JFrame mainJFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            mainJFrame.dispose();
            ad.setVisible(true);
            this.hide();
            ad.ads = ads;
            ad.uname = name;
        } catch (SQLException | HeadlessException e) {
            System.out.println("Connection Error: " + e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error closing connection: " + ex);
            }
        }
    }//GEN-LAST:event_settingsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel applicationForm;
    private javax.swing.JPanel boardPage6;
    private javax.swing.JPanel dash1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel man1;
    private javax.swing.JLabel man2;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel userInfo;
    // End of variables declaration//GEN-END:variables
}

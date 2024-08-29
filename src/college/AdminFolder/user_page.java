/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package college.AdminFolder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ibrahim
 */
public class user_page extends javax.swing.JFrame {

    /**
     * Creates new form user_page
     */
    public user_page() {
        initComponents();
        viewActionPerformed(null);
        view.setVisible(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Ensure only this window is closed

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
        usertable = new javax.swing.JTable();
        view = new javax.swing.JButton();
        view1 = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        deletefield = new javax.swing.JTextField();
        adduser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        usertable.setBackground(new java.awt.Color(153, 255, 255));
        usertable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usertable.setForeground(new java.awt.Color(0, 51, 51));
        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "name", "email", "phone"
            }
        ));
        jScrollPane2.setViewportView(usertable);

        view.setBackground(new java.awt.Color(153, 255, 255));
        view.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        view.setForeground(new java.awt.Color(0, 51, 51));
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        view1.setBackground(new java.awt.Color(153, 255, 255));
        view1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        view1.setForeground(new java.awt.Color(0, 51, 51));
        view1.setText("go back home");
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1ActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(153, 255, 255));
        deletebutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(0, 51, 51));
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        deletefield.setBackground(new java.awt.Color(255, 255, 255));
        deletefield.setForeground(new java.awt.Color(0, 51, 51));
        deletefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletefieldActionPerformed(evt);
            }
        });

        adduser.setBackground(new java.awt.Color(153, 255, 255));
        adduser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adduser.setForeground(new java.awt.Color(0, 51, 51));
        adduser.setText("Add user");
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(view1)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deletefield, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(view1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletefield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
                 Connection connect = null;
		Statement s = null;
		Boolean status = false;
        try {  
            Class.forName("com.mysql.jdbc.Driver");
            String myUrl = "jdbc:mysql://localhost:3305/universityproject";
            connect = DriverManager.getConnection(myUrl, "root", "");
            s = connect.createStatement();
       
    String query = "SELECT * FROM user;";
    ResultSet rs = s.executeQuery(query);
    
    // Clear table before populating
    DefaultTableModel model = (DefaultTableModel) usertable.getModel();
    model.setRowCount(0); // Clearing the existing rows
    
    // Populating table from ResultSet
    while (rs.next()) {
        String id = rs.getString("user_id");
        String name = rs.getString("user_name");
        String email = rs.getString("user_email");
        String phone = rs.getString("user_phone");

       
        
        model.addRow(new Object[] { id,  name, email, phone  });
    } 
    rs.close();
    connect.close();
} catch (SQLException ex) {
     JOptionPane.showMessageDialog(this, "Could Not add");

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error In Connectivity");
}
    }//GEN-LAST:event_viewActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
                Connection connect = null;
		Statement s = null;
		Boolean status = false;
        try {  
            Class.forName("com.mysql.jdbc.Driver");
            String myUrl = "jdbc:mysql://localhost:3305/universityproject";
            connect = DriverManager.getConnection(myUrl, "root", "");
            s = connect.createStatement();

        // Check if the roll number exists
        String rollNumber = deletefield.getText();
        String checkQuery = "SELECT * FROM user WHERE user_id = ?";
        PreparedStatement checkStmt = connect.prepareStatement(checkQuery);
        checkStmt.setString(1, rollNumber);
        ResultSet rs = checkStmt.executeQuery();
        
        if (rs.next()) {
            // Roll number found, proceed with delete
            String deleteQuery = "DELETE FROM user WHERE user_id = ?";
            PreparedStatement deleteStmt = connect.prepareStatement(deleteQuery);
            deleteStmt.setString(1, rollNumber);
            deleteStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            deletefield.setText("");
            deleteStmt.close();
            viewActionPerformed(evt);

        } else {
            // Roll number not found
            JOptionPane.showMessageDialog(null, "Cannot delete user, user id does not exist.");
        }
        
        // Close the ResultSet, PreparedStatement, and Connection
        rs.close();
        checkStmt.close();
        connect.close();  
    } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);  
    } 
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void deletefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletefieldActionPerformed

    private void view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_view1ActionPerformed

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserActionPerformed
        add_user new_user = new add_user();
        new_user.setLocationRelativeTo(this);
        new_user.setVisible(true);
        
    }//GEN-LAST:event_adduserActionPerformed

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
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adduser;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField deletefield;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable usertable;
    private javax.swing.JButton view;
    private javax.swing.JButton view1;
    // End of variables declaration//GEN-END:variables
}

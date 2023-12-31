/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.memorygame;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/modul4";
    static final String USER = "root";
    static final String PASS = "";
    protected String user;

    /**
     * Creates new form Login1
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginBtn = new javax.swing.JButton();
        registerLable = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JButton();
        plsEnterDtlLable = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        enterUser = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        enterPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginBtn.setBackground(new java.awt.Color(0, 102, 255));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        registerLable.setText("Don't have an account?");

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 102, 255));
        loginLabel.setText("Login");
        loginLabel.setMaximumSize(new java.awt.Dimension(50, 36));
        loginLabel.setMinimumSize(new java.awt.Dimension(50, 36));
        loginLabel.setPreferredSize(new java.awt.Dimension(50, 36));

        RegisterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(0, 102, 255));
        RegisterBtn.setText("register here");
        RegisterBtn.setBorder(null);
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        plsEnterDtlLable.setText("Please. enter your detail");

        UserLabel.setText("Username");

        enterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterUserActionPerformed(evt);
            }
        });

        passLabel.setText("Password");

        enterPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passLabel)
                                        .addComponent(enterPass, javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UserLabel)
                                        .addComponent(plsEnterDtlLable)
                                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(registerLable)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(RegisterBtn)))
                                .addContainerGap(114, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plsEnterDtlLable)
                                .addGap(18, 18, 18)
                                .addComponent(UserLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterUser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterPass, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LoginBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(registerLable)
                                        .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(35, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterPassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_enterPassActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_enterPassActionPerformed

    private void enterUserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_enterUserActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_enterUserActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RegisterBtnActionPerformed
        new Register().setVisible(true);
    }// GEN-LAST:event_RegisterBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LoginBtnActionPerformed
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "SELECT * FROM userid WHERE username = ? AND pass = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, enterUser.getText());
            statement.setString(2, enterPass.getText());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                JOptionPane.showMessageDialog(new JFrame(), "Login Berhasil", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                user = enterUser.getText();
                System.out.println(user);

                // new GameFrame(user).setVisible(true);
            } else if (!resultSet.next()) {
                JOptionPane.showMessageDialog(new JFrame(), "Login Gagal", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            } else if (enterUser.equals(null) || enterPass.equals(null)) {
                JOptionPane.showMessageDialog(new JFrame(), "Username dan Password harus diisi", "Error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

    }// GEN-LAST:event_LoginBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JTextField enterPass;
    private javax.swing.JTextField enterUser;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel plsEnterDtlLable;
    private javax.swing.JLabel registerLable;
    // End of variables declaration//GEN-END:variables
}

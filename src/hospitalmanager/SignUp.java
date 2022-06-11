/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package hospitalmanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author guest123
 */
public class SignUp extends javax.swing.JFrame {

    /** Creates new form SignUp */
    public SignUp() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LastN = new javax.swing.JTextField();
        PhoneN = new javax.swing.JTextField();
        EmailA = new javax.swing.JTextField();
        FirstN = new javax.swing.JTextField();
        DateOB = new javax.swing.JTextField();
        HomeA = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Gender = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Patient Sign Up");

        LastN.setText("Last Name");
        LastN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LastNFocusGained(evt);
            }
        });
        LastN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNActionPerformed(evt);
            }
        });

        PhoneN.setText("Phone Number");
        PhoneN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneNFocusGained(evt);
            }
        });
        PhoneN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNActionPerformed(evt);
            }
        });

        EmailA.setText("Email Address");
        EmailA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailAFocusGained(evt);
            }
        });
        EmailA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAActionPerformed(evt);
            }
        });

        FirstN.setText("First Name");
        FirstN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstNFocusGained(evt);
            }
        });
        FirstN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNActionPerformed(evt);
            }
        });

        DateOB.setText("Date of Birth");
        DateOB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DateOBFocusGained(evt);
            }
        });
        DateOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateOBActionPerformed(evt);
            }
        });

        HomeA.setText("Home Address");
        HomeA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HomeAFocusGained(evt);
            }
        });
        HomeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeAActionPerformed(evt);
            }
        });

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Return to Log In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Gender.setText("Gender");
        Gender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GenderFocusGained(evt);
            }
        });
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeA, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOB, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstN, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailA, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneN, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastN, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(113, 113, 113))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LastN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PhoneN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmailA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DateOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LastNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNActionPerformed
    }//GEN-LAST:event_LastNActionPerformed

    private void PhoneNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNActionPerformed

    private void EmailAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAActionPerformed

    private void FirstNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNActionPerformed

    private void DateOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateOBActionPerformed

    private void HomeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeAActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginStartupUI logIn = new LoginStartupUI();
        logIn.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FirstNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstNFocusGained
        if(FirstN.getText().equals("First Name"))FirstN.setText("");
        if(LastN.getText().equals(""))LastN.setText("Last Name");
        if(PhoneN.getText().equals(""))PhoneN.setText("Phone Number");
        if(EmailA.getText().equals(""))EmailA.setText("Email Address");
        if(DateOB.getText().equals(""))DateOB.setText("Date of Birth");
        if(HomeA.getText().equals(""))HomeA.setText("Home Address");
        if(Gender.getText().equals(""))Gender.setText("Gender");

    }//GEN-LAST:event_FirstNFocusGained

    private void LastNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastNFocusGained
        if(LastN.getText().equals("Last Name"))LastN.setText("");
        if(FirstN.getText().equals(""))FirstN.setText("First Name");
        if(PhoneN.getText().equals(""))PhoneN.setText("Phone Number");
        if(EmailA.getText().equals(""))EmailA.setText("Email Address");
        if(DateOB.getText().equals(""))DateOB.setText("Date of Birth");
        if(HomeA.getText().equals(""))HomeA.setText("Home Address");
        if(Gender.getText().equals(""))Gender.setText("Gender");
    }//GEN-LAST:event_LastNFocusGained

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void PhoneNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneNFocusGained
        if(PhoneN.getText().equals("Phone Number"))PhoneN.setText("");
        if(FirstN.getText().equals(""))FirstN.setText("First Name");
        if(LastN.getText().equals(""))LastN.setText("Last Name");
        if(EmailA.getText().equals(""))EmailA.setText("Email Address");
        if(DateOB.getText().equals(""))DateOB.setText("Date of Birth");
        if(HomeA.getText().equals(""))HomeA.setText("Home Address");
        if(Gender.getText().equals(""))Gender.setText("Gender");

    }//GEN-LAST:event_PhoneNFocusGained

    private void EmailAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailAFocusGained
        if(EmailA.getText().equals("Email Address"))EmailA.setText("");
        if(FirstN.getText().equals(""))FirstN.setText("First Name");
        if(PhoneN.getText().equals(""))PhoneN.setText("Phone Number");
        if(LastN.getText().equals(""))LastN.setText("Last Name");
        if(DateOB.getText().equals(""))DateOB.setText("Date of Birth");
        if(HomeA.getText().equals(""))HomeA.setText("Home Address");
        if(Gender.getText().equals(""))Gender.setText("Gender");

    }//GEN-LAST:event_EmailAFocusGained

    private void DateOBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateOBFocusGained
        if(DateOB.getText().equals("Date of Birth"))DateOB.setText("");
        if(FirstN.getText().equals(""))FirstN.setText("First Name");
        if(PhoneN.getText().equals(""))PhoneN.setText("Phone Number");
        if(EmailA.getText().equals(""))EmailA.setText("Email Address");
        if(LastN.getText().equals(""))LastN.setText("Last Name");
        if(HomeA.getText().equals(""))HomeA.setText("Home Address");
        if(Gender.getText().equals(""))Gender.setText("Gender");

    }//GEN-LAST:event_DateOBFocusGained

    private void HomeAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HomeAFocusGained
        if(HomeA.getText().equals("Home Address"))HomeA.setText("");
        if(FirstN.getText().equals(""))FirstN.setText("First Name");
        if(PhoneN.getText().equals(""))PhoneN.setText("Phone Number");
        if(EmailA.getText().equals(""))EmailA.setText("Email Address");
        if(DateOB.getText().equals(""))DateOB.setText("Date of Birth");
        if(LastN.getText().equals(""))LastN.setText("Last Name");
        if(Gender.getText().equals(""))Gender.setText("Gender");

    }//GEN-LAST:event_HomeAFocusGained

    private void GenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenderFocusGained
        if(Gender.getText().equals("Gender"))Gender.setText("");
        if(FirstN.getText().equals(""))FirstN.setText("First Name");
        if(PhoneN.getText().equals(""))PhoneN.setText("Phone Number");
        if(EmailA.getText().equals(""))EmailA.setText("Email Address");
        if(DateOB.getText().equals(""))DateOB.setText("Date of Birth");
        if(HomeA.getText().equals(""))HomeA.setText("Home Address");
        if(LastN.getText().equals(""))LastN.setText("Last Name");

    }//GEN-LAST:event_GenderFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filepath = "src\\hospitalmanager\\UserDatabase.csv";
        String username = LastN.getText() + FirstN.getText() + "@patient.com";
        int password = ((int) (Math.random()*(100000 - 9999))) + 9999;

        
        try
        {
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(username+','+password+','+FirstN.getText()+','+LastN.getText()+','+PhoneN.getText()+','+
                       EmailA.getText()+','+DateOB.getText()+','+HomeA.getText()+','+Gender.getText()+"na");
            pw.flush();
            pw.close();
            
            JOptionPane.showMessageDialog(null, "record saved");
            
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateOB;
    private javax.swing.JTextField EmailA;
    private javax.swing.JTextField FirstN;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField HomeA;
    private javax.swing.JTextField LastN;
    private javax.swing.JTextField PhoneN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}

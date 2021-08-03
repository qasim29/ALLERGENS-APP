package package_main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClientMedicalProfileJFrame extends JFrame {

    ProfileUpdateForm p1;
    UserAllergyForm a1;

    public ClientMedicalProfileJFrame() {
        this.initComponents();
        this.setVisibiltyFalse();
        this.setLoginPanel();
        BorderLayout layout = new BorderLayout();
        DynamicPanel.setLayout(layout);
        p1 = new ProfileUpdateForm(this);
        a1 = new UserAllergyForm(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DynamicPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlmain = new javax.swing.JPanel();
        btnEditProfile = new javax.swing.JButton();
        btnSetAllergy = new javax.swing.JButton();
        btnCeckProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DynamicPanel.setBackground(new java.awt.Color(255, 255, 255));
        DynamicPanel.setFocusable(false);
        DynamicPanel.setMaximumSize(new java.awt.Dimension(650, 600));
        DynamicPanel.setMinimumSize(new java.awt.Dimension(650, 600));
        DynamicPanel.setPreferredSize(new java.awt.Dimension(650, 600));
        DynamicPanel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(71, 77, 122));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        DynamicPanel.add(jPanel2);
        jPanel2.setBounds(0, 0, 710, 10);

        getContentPane().add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 600));

        pnlmain.setBackground(new java.awt.Color(52, 59, 127));

        btnEditProfile.setBackground(new java.awt.Color(71, 77, 122));
        btnEditProfile.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnEditProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProfile.setText("Edit Profile");
        btnEditProfile.setAutoscrolls(true);
        btnEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProfileActionPerformed(evt);
            }
        });

        btnSetAllergy.setBackground(new java.awt.Color(71, 77, 122));
        btnSetAllergy.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnSetAllergy.setForeground(new java.awt.Color(255, 255, 255));
        btnSetAllergy.setText("Set Allergy");
        btnSetAllergy.setAutoscrolls(true);
        btnSetAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetAllergyActionPerformed(evt);
            }
        });

        btnCeckProduct.setBackground(new java.awt.Color(71, 77, 122));
        btnCeckProduct.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnCeckProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnCeckProduct.setText("Check Product");
        btnCeckProduct.setToolTipText("");
        btnCeckProduct.setAutoscrolls(true);

        javax.swing.GroupLayout pnlmainLayout = new javax.swing.GroupLayout(pnlmain);
        pnlmain.setLayout(pnlmainLayout);
        pnlmainLayout.setHorizontalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCeckProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlmainLayout.setVerticalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnSetAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnCeckProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );

        getContentPane().add(pnlmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProfileActionPerformed
        this.setProfileUpdateForm();
    }//GEN-LAST:event_btnEditProfileActionPerformed

    private void btnSetAllergyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetAllergyActionPerformed
        this.setUserAllergyForm();
    }//GEN-LAST:event_btnSetAllergyActionPerformed

    public void addComponent(JPanel component) {
        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof LoginForm
                    || c instanceof RegisterForm) {
                this.getContentPane().remove(c);
            }
        }
        this.getContentPane().add(component, BorderLayout.CENTER);
        this.pack();
        setLocationRelativeTo(null);
    }

    private void removePanels() {
        for (Component c : this.DynamicPanel.getComponents()) {
            if (c instanceof ProfileUpdateForm || c instanceof ProfileUpdateForm2)
            {
                this.DynamicPanel.remove(c);
            }
        }
    }

    public void setMainPanel() {
        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof LoginForm
                    || c instanceof RegisterForm) {
                this.getContentPane().remove(c);
            }
        }
        this.initComponents();
    }

    private void setLoginPanel() {
        BorderLayout layout = new BorderLayout();
        this.getContentPane().setLayout(layout);
        LoginForm login = new LoginForm(this);
        this.getContentPane().add(login);
    }

    private void setVisibiltyFalse() {
        pnlmain.setVisible(false);
        btnCeckProduct.setVisible(false);
        btnEditProfile.setVisible(false);
        btnSetAllergy.setVisible(false);
        DynamicPanel.setVisible(false);

    }

    private void setProfileUpdateForm() {
        this.removePanels();
        BorderLayout layout = new BorderLayout();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        p1= new ProfileUpdateForm(this);
        DynamicPanel.add(p1,BorderLayout.CENTER);
        p1.setVisible(true);
    }

    private void setUserAllergyForm() {
        this.removePanels();
        BorderLayout layout = new BorderLayout();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        ProfileUpdateForm2 b1 = new ProfileUpdateForm2(this);
        DynamicPanel.add(b1, BorderLayout.CENTER);
        b1.setVisible(true);
    }

    public boolean isDouble(String txtAge) {
        try {
            double doub = Double.parseDouble(txtAge);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean isInt(String txtAge) {
        try {
            int integernum = Integer.parseInt(txtAge);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(ClientMedicalProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMedicalProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMedicalProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMedicalProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientMedicalProfileJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton btnCeckProduct;
    private javax.swing.JButton btnEditProfile;
    private javax.swing.JButton btnSetAllergy;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlmain;
    // End of variables declaration//GEN-END:variables
}

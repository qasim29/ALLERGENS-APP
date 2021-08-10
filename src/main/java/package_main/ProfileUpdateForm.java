/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_main;

import App_Classes.ClientMedicalProfile;
import app_dao.MysqlCon;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Qasim.29
 */
public class ProfileUpdateForm extends javax.swing.JPanel {

    /**
     * Creates new form
     */
    private ClientMedicalProfileJFrame jf;
    public ClientMedicalProfile c1;

    public ProfileUpdateForm(ClientMedicalProfileJFrame aThis) {
        initComponents();
        this.jf = aThis;
        incorrect1.setVisible(false);
        incorrect2.setVisible(false);
        incorrect3.setVisible(false);
        this.setValues(LoginForm.email);
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
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jComGender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        jComBloodGroup = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        incorrect3 = new javax.swing.JLabel();
        incorrect2 = new javax.swing.JLabel();
        incorrect1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(650, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 600));
        jPanel1.setLayout(null);

        btnUpdate.setBackground(new java.awt.Color(71, 77, 122));
        btnUpdate.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setAutoscrolls(true);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(460, 510, 150, 46);

        btnDelete.setBackground(new java.awt.Color(71, 77, 122));
        btnDelete.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setAutoscrolls(true);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(70, 510, 150, 46);

        jComGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(jComGender);
        jComGender.setBounds(430, 310, 100, 20);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setText("Gender :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(360, 310, 57, 19);

        txtHeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHeightFocusLost(evt);
            }
        });
        jPanel1.add(txtHeight);
        txtHeight.setBounds(360, 250, 253, 33);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setText(" Height :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(360, 230, 57, 19);

        txtWeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWeightFocusLost(evt);
            }
        });
        jPanel1.add(txtWeight);
        txtWeight.setBounds(360, 180, 253, 33);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel12.setText("Weight :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(360, 160, 56, 19);

        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgeFocusLost(evt);
            }
        });
        jPanel1.add(txtAge);
        txtAge.setBounds(360, 110, 253, 33);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setText("Age :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(360, 90, 35, 19);
        jPanel1.add(txtPhoneNo);
        txtPhoneNo.setBounds(70, 250, 253, 33);

        jComBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A RhD positive (A+)", "A RhD negative (A-)", "B RhD positive (B+)", "B RhD negative (B-)", "O RhD positive (O+)", "O RhD negative (O-)", "AB RhD positive (AB+)", "AB RhD negative (AB-)" }));
        jComBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComBloodGroupActionPerformed(evt);
            }
        });
        jPanel1.add(jComBloodGroup);
        jComBloodGroup.setBounds(170, 310, 135, 20);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setText("Blood Group :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 310, 94, 19);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel13.setText("Phone No. :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(70, 230, 78, 19);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setText("Password :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 160, 72, 19);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(70, 180, 253, 33);

        txtName.setToolTipText("enter you name");
        jPanel1.add(txtName);
        txtName.setBounds(70, 110, 253, 33);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setText("Name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 90, 48, 19);

        jPanel3.setBackground(new java.awt.Color(71, 77, 122));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Profile");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" User Email : ");

        txtEmail.setBackground(new java.awt.Color(71, 77, 122));
        txtEmail.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setDisabledTextColor(new java.awt.Color(71, 77, 122));
        txtEmail.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 650, 59);

        incorrect3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        incorrect3.setForeground(new java.awt.Color(255, 0, 0));
        incorrect3.setText("Incorrect Input");
        jPanel1.add(incorrect3);
        incorrect3.setBounds(360, 280, 80, 13);

        incorrect2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        incorrect2.setForeground(new java.awt.Color(255, 0, 0));
        incorrect2.setText("Incorrect Input");
        jPanel1.add(incorrect2);
        incorrect2.setBounds(360, 210, 80, 13);

        incorrect1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        incorrect1.setForeground(new java.awt.Color(255, 0, 0));
        incorrect1.setText("Incorrect Input");
        jPanel1.add(incorrect1);
        incorrect1.setBounds(360, 140, 80, 13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int result = JOptionPane.showConfirmDialog(ProfileUpdateForm.this, "Sure? You want to exit?", "Swing Tester",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            MysqlCon.deleteClientProfile(c1.getEmail());
            MysqlCon.deleteFromLoginTable(LoginForm.lc);
            JOptionPane.showMessageDialog(ProfileUpdateForm.this, "Account Deleted ");
            jf.setLoginAgain();
        } else if (result == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(ProfileUpdateForm.this, "Deleted request cancelled ");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (this.checkBadInput()) {
            JOptionPane.showMessageDialog(ProfileUpdateForm.this, "Please provide correct information! ");
        } else {
            c1.setName((String) txtName.getText());
            c1.setPhone((String) txtPhoneNo.getText());
            c1.setWeight(Double.parseDouble(txtWeight.getText()));
            c1.setHeight(Double.parseDouble(txtHeight.getText()));
            c1.setAge(Integer.parseInt(txtAge.getText()));
            c1.setGender((String) jComGender.getSelectedItem());
            c1.setBlood_group((String) jComBloodGroup.getSelectedItem());
            MysqlCon.updateClientProfile(c1);
            LoginForm.lc.setPassword((String) txtPassword.getText());
            MysqlCon.updatePassword(LoginForm.lc);
            JOptionPane.showMessageDialog(ProfileUpdateForm.this, "Profile Updated Successfully");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private boolean checkBadInput() {
        if (txtAge.getText().trim().isEmpty()
                || txtEmail.getText().trim().isEmpty()
                || txtName.getText().trim().isEmpty()
                || txtPhoneNo.getText().trim().isEmpty()
                || txtPassword.getText().trim().isEmpty()
                || txtWeight.getText().trim().isEmpty()
                || txtHeight.getText().trim().isEmpty()) {
            return true;
        } else if (!jf.isDouble(txtWeight.getText())
                || !jf.isInt(txtAge.getText())
                || !jf.isDouble(txtHeight.getText())) {
            return true;
        }
        return false;
    }

    private void txtHeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeightFocusLost
        if (jf.isDouble(txtHeight.getText()) != true) {
            txtHeight.setBorder(new LineBorder(Color.red, 1));
            incorrect3.setVisible(true);
        } else {
            txtHeight.setBorder(new LineBorder(Color.black, 1));
            incorrect3.setVisible(false);
        }
    }//GEN-LAST:event_txtHeightFocusLost

    private void txtWeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWeightFocusLost
        if (jf.isDouble(txtWeight.getText()) != true) {
            txtWeight.setBorder(new LineBorder(Color.red, 1));
            incorrect2.setVisible(true);
        } else {
            txtWeight.setBorder(new LineBorder(Color.black, 1));
            incorrect2.setVisible(false);
        }
    }//GEN-LAST:event_txtWeightFocusLost

    private void txtAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusLost
        if (jf.isInt(txtAge.getText()) != true) {
            txtAge.setBorder(new LineBorder(Color.red, 1));
            incorrect1.setVisible(true);
        } else {
            txtAge.setBorder(new LineBorder(Color.black, 1));
            incorrect1.setVisible(false);
        }
    }//GEN-LAST:event_txtAgeFocusLost

    private void jComBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComBloodGroupActionPerformed

    private void setValues(String email) {
        c1 = MysqlCon.readClientProfile(email);
        txtEmail.setText(email);
        txtAge.setText("" + c1.getAge());
        txtHeight.setText("" + c1.getHeight());
        txtWeight.setText("" + c1.getWeight());
        txtName.setText(c1.getName());
        txtPhoneNo.setText(c1.getPhone());
        jComBloodGroup.setSelectedItem(c1.getBlood_group());
        jComGender.setSelectedItem(c1.getGender());
        txtPassword.setText(MysqlCon.getPassword(email));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel incorrect1;
    private javax.swing.JLabel incorrect2;
    private javax.swing.JLabel incorrect3;
    private javax.swing.JComboBox<String> jComBloodGroup;
    private javax.swing.JComboBox<String> jComGender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}

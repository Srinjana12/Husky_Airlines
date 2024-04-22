/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishisehgal
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        popOrganizationComboBox();
        // employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        comboxOrganization.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            comboxOrganization.addItem(organization);
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        jComboBoxEmployee.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            jComboBoxEmployee.addItem(employee);
        }
    }

    private void populateRoleComboBox(Organization organization) {
        jComboBoxRole.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            jComboBoxRole.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
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

        createUserJButton = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxEmployee = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboxOrganization = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        deleteJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(223, 190, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createUserJButton.setBackground(new java.awt.Color(181, 189, 137));
        createUserJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 518, 250, 50));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 201, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 438, -1, -1));

        userJTable.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 143, 1225, 142));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 478, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 201, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 351, -1, -1));

        jComboBoxEmployee.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jComboBoxEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBoxEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 198, -1));

        backjButton1.setBackground(new java.awt.Color(181, 189, 137));
        backjButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        backjButton1.setText("< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 50));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 306, -1, -1));

        comboxOrganization.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comboxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboxOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxOrganizationActionPerformed(evt);
            }
        });
        add(comboxOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 198, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 396, -1, -1));

        jComboBoxRole.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRoleActionPerformed(evt);
            }
        });
        add(jComboBoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 198, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(114, 158, 161));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage User Accounts");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1586, -1));

        deleteJButton.setBackground(new java.awt.Color(181, 189, 137));
        deleteJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        add(deleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 250, 50));

        updateJButton.setBackground(new java.awt.Color(181, 189, 137));
        updateJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        updateJButton.setText("Update ");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });
        add(updateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        Organization organization = (Organization) comboxOrganization.getSelectedItem();
        Employee employee = (Employee) jComboBoxEmployee.getSelectedItem();
        Role role = (Role) jComboBoxRole.getSelectedItem();

        if (organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName) == true) {
            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        } else {
            JOptionPane.showMessageDialog(null, "Username already exists, choose other username");
        }

        popData();
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void comboxOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxOrganizationActionPerformed
        Organization organization = (Organization) comboxOrganization.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_comboxOrganizationActionPerformed

    private void jComboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRoleActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = userJTable.getSelectedRow();

        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String userName =  userJTable.getValueAt(selectedRow, 0).toString();
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername() == userName)
                        {
                            organization.getUserAccountDirectory().deleteUserAccount(ua);

                            popData();
                            return;
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select employee to delete!");
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = userJTable.getSelectedRow();
        String userNameUpdated = txtUserName.getText();
        String passwordUpdated = txtPassword.getText();
        if(userNameUpdated.isEmpty() && passwordUpdated.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select enter the name, password to update!");
            return;
        }
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String userName =  userJTable.getValueAt(selectedRow, 0).toString();
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername() == userName)
                        {
                            organization.getUserAccountDirectory().updateUserAccount(ua, userNameUpdated, passwordUpdated);
                            popData();
                            return;
                        }
                    }
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select user to update!");
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JComboBox comboxOrganization;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JComboBox jComboBoxEmployee;
    private javax.swing.JComboBox jComboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}

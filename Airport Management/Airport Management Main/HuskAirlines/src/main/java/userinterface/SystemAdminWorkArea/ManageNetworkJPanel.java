/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(223, 190, 153));
        setLayout(null);

        networkJTable.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 913, 139);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1);
        jLabel1.setBounds(6, 305, 50, 22);

        submitJButton.setBackground(new java.awt.Color(181, 189, 137));
        submitJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(6, 359, 250, 50);
        add(nameJTextField);
        nameJTextField.setBounds(116, 307, 257, 23);

        backJButton.setBackground(new java.awt.Color(181, 189, 137));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(6, 24, 100, 50);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(114, 158, 161));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Network");
        add(jLabel6);
        jLabel6.setBounds(112, 31, 807, 43);

        deleteButton.setBackground(new java.awt.Color(181, 189, 137));
        deleteButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtondeleteNetworkPerformed(evt);
            }
        });
        add(deleteButton);
        deleteButton.setBounds(270, 360, 260, 50);

        updateButton.setBackground(new java.awt.Color(181, 189, 137));
        updateButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtondeleteNetworkPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(540, 360, 260, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String name = nameJTextField.getText();

        Network network = system.createAndAddNetwork();
        network.setName(name);

        populateNetworkTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deleteButtondeleteNetworkPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtondeleteNetworkPerformed
        // TODO add your handling code here:
        int selectedRow = networkJTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String network =  networkJTable.getValueAt(selectedRow, 0).toString();
                for (Network selectedNetwork: system.getNetworkList()){
                    if(selectedNetwork.getName() == network)
                    {
                        system.deleteNetwork(selectedNetwork);
                        populateNetworkTable();
                        return;
                    }

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select network to delete!");
        }
    }//GEN-LAST:event_deleteButtondeleteNetworkPerformed

    private void updateButtondeleteNetworkPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtondeleteNetworkPerformed
        // TODO add your handling code here:
        String name = nameJTextField.getText();
        if(name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select enter to name to update!");
            return;
        }
        int selectedRow = networkJTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the name?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String network =  networkJTable.getValueAt(selectedRow, 0).toString();
                for (Network selectedNetwork: system.getNetworkList()){
                    if(selectedNetwork.getName() == network)
                    {
                        system.updateNetwork(selectedNetwork, name);
                        populateNetworkTable();
                        return;
                    }

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select network to update!");
        }
    }//GEN-LAST:event_updateButtondeleteNetworkPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
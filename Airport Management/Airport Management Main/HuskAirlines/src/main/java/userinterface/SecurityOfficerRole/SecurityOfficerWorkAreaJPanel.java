/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SecurityOfficerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SecurityCheckin;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TicketVerificationWorkRequest;
import Business.WorkQueue.SecurityCheckWorkRequest;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class SecurityOfficerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecurityOfficerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private SecurityCheckin hospitalOrganization;
    private Enterprise enterprise;

    public SecurityOfficerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SecurityCheckin hospitalOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.hospitalOrganization = hospitalOrganization;

        populateReceiveTable();
        populateSentTable();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SentWorkReqJTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(223, 190, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passenger", "Sender", "Receiver", "Status", "Date Received"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 129, 1135, 151));

        btnRefresh.setBackground(new java.awt.Color(181, 189, 137));
        btnRefresh.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 298, 250, 50));

        btnAssign.setBackground(new java.awt.Color(181, 189, 137));
        btnAssign.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 298, 250, 50));

        btnProcess.setBackground(new java.awt.Color(181, 189, 137));
        btnProcess.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 298, 250, 50));

        SentWorkReqJTable.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        SentWorkReqJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passenger", "Receiver", "Status", "Date Sent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(SentWorkReqJTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 412, 1117, 151));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(114, 158, 161));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Security Officer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1135, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("List of Requests received from Ticket Portal Manager:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, 481, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("List of Requests sent by you to Ticket Verification Officer:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 366, 530, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateReceiveTable();
        populateSentTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void populateReceiveTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : hospitalOrganization.getWorkQueue().getWorkRequestList()) {
            SecurityCheckWorkRequest wr = (SecurityCheckWorkRequest) request;
            Object[] row = new Object[5];
            row[0] = wr;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            row[4] = request.getRequestDate();

            model.addRow(row);
        }
    }

    public void populateSentTable() {
        DefaultTableModel model = (DefaultTableModel) SentWorkReqJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            TicketVerificationWorkRequest wr = (TicketVerificationWorkRequest) request;
            Object[] row = new Object[4];
            row[0] = wr;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((LabTestWorkRequest) request).getTestResult();
            row[3] = request.getRequestDate(); //result == null ? "Waiting" : result;

            model.addRow(row);
        }
    }

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Enter a row to assign!");
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == null) {
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateReceiveTable();
        } else {
            JOptionPane.showMessageDialog(null, "Either this request does not belong to your account or it has already been assigned to you.");
            return;

        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table to proceed!");
            return;
        }

        SecurityCheckWorkRequest request = (SecurityCheckWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == userAccount) {
            if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "This request has already been completed! Choose another request");
                return;

            }
            request.setStatus("Processing");
            SecurityOfficerWorkRequestJPanel processWorkRequestJPanel = new SecurityOfficerWorkRequestJPanel(userProcessContainer, request, userAccount, business);
            userProcessContainer.add("HospitalrAllocatorWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "This request doesnt belong to your account!");
            return;
        }

    }//GEN-LAST:event_btnProcessActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SentWorkReqJTable;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.TicketVerificationRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.TicketVerification;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TicketVerificationWorkRequest;
import Business.WorkQueue.SeatAllocationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class TicketVerificationWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TicketVerificationWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private TicketVerification departmentFacilitationOrganization;
    private Enterprise enterprise;

    public TicketVerificationWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, TicketVerification departmentFacilitationOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.departmentFacilitationOrganization = departmentFacilitationOrganization;

        populateReceiveTable();
        populateSentTable();
    }

    public void populateReceiveTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : departmentFacilitationOrganization.getWorkQueue().getWorkRequestList()) {
            TicketVerificationWorkRequest wr = (TicketVerificationWorkRequest) request;
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
            SeatAllocationWorkRequest wr = (SeatAllocationWorkRequest) request;
            Object[] row = new Object[4];
            row[0] = wr.getPassengerPerson() != null ? wr.getPassengerPerson().getName() : "No name";
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            row[3] = request.getRequestDate();

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

        jPanel1 = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        SentWorkReqJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 190, 153));

        jPanel1.setBackground(new java.awt.Color(223, 190, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefresh.setBackground(new java.awt.Color(181, 189, 137));
        btnRefresh.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 280, 250, 50));

        btnAssign.setBackground(new java.awt.Color(181, 189, 137));
        btnAssign.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 280, 250, 50));

        btnProcess.setBackground(new java.awt.Color(181, 189, 137));
        btnProcess.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 280, 250, 50));

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
                false, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 107, 1132, 150));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 388, 1132, 150));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("List of Request received from Security Checkin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 67, 562, -1));

        enterpriseLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(114, 158, 161));
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("Ticket Verification");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1152, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("List of Request sent by you to Seat Allocation");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 348, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1164, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
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

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request to proceed!");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        TicketVerificationWorkRequest request1 = (TicketVerificationWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == null) {
            request1.getSecurityCheckWorkRequest().setReceiver(userAccount);
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
        TicketVerificationWorkRequest request = (TicketVerificationWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == userAccount) {
            if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "This request has already been completed!Choose another request");
                return;
            }
            request.setStatus("Processing");
            TicketVerificationWorkRequestJPanel processWorkRequestJPanel = new TicketVerificationWorkRequestJPanel(userProcessContainer, request, userAccount, business);
            userProcessContainer.add("TicketVerificationWorkRequestJPanel", processWorkRequestJPanel);
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
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

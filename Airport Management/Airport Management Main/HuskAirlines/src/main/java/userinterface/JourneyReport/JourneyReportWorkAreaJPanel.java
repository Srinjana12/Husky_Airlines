/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.JourneyReport;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.JourneyReport;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JourneyReportGenerationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class JourneyReportWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private JourneyReport organization;
    private Enterprise enterprise;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public JourneyReportWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, JourneyReport organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization = organization;

        populateReceiveTable();

    }

    public void populateReceiveTable() {
        DefaultTableModel model = (DefaultTableModel) reportrequeststable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            JourneyReportGenerationWorkRequest wr = (JourneyReportGenerationWorkRequest) request;
            Object[] row = new Object[5];
            row[0] = wr;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            row[4] = request.getRequestDate();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportrequeststable = new javax.swing.JTable();
        assignJButton1 = new javax.swing.JButton();
        processJButton1 = new javax.swing.JButton();
        refreshJButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Homeless Person", "Sender", "Receiver", "Status", "Date Received"
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

        assignJButton.setBackground(new java.awt.Color(0, 102, 255));
        assignJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(0, 102, 255));
        processJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(0, 102, 255));
        refreshJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HOUSE AGREEMENT");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("List of Requests received from Shelter Facilitator:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(223, 190, 153));

        reportrequeststable.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        reportrequeststable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(reportrequeststable);

        assignJButton1.setBackground(new java.awt.Color(181, 189, 137));
        assignJButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        assignJButton1.setText("Assign to me");
        assignJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton1ActionPerformed(evt);
            }
        });

        processJButton1.setBackground(new java.awt.Color(181, 189, 137));
        processJButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        processJButton1.setText("Process");
        processJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButton1ActionPerformed(evt);
            }
        });

        refreshJButton1.setBackground(new java.awt.Color(181, 189, 137));
        refreshJButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        refreshJButton1.setText("Refresh");
        refreshJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Journey Report Creator Work Area");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("List of Requests received from Transportation Security Administrator:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(assignJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(processJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(refreshJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = reportrequeststable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Enter a row to assign!");
            return;
        }
        WorkRequest request = (WorkRequest) reportrequeststable.getValueAt(selectedRow, 0);
        JourneyReportGenerationWorkRequest request1 = (JourneyReportGenerationWorkRequest) reportrequeststable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == null) {
            request1.getsecurityCheckWorkRequest().setReceiver(userAccount);
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateReceiveTable();
        } else {
            JOptionPane.showMessageDialog(null, "Either this request does not belong to your account or it has already been assigned to you.");
            return;
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = reportrequeststable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table to proceed!");
            return;
        }
        JourneyReportGenerationWorkRequest request = (JourneyReportGenerationWorkRequest) reportrequeststable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == userAccount) {
            if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "This request has already been completed!Choose another request");
                return;
            }
            request.setStatus("Processing");
            JourneyReportWorkRequestJPanel processWorkRequestJPanel = new JourneyReportWorkRequestJPanel(userProcessContainer, request, userAccount, business);
            userProcessContainer.add("HealthReport", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "This request doesnt belong to your account!");
            return;
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateReceiveTable();

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton1ActionPerformed
        int selectedRow = reportrequeststable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Enter a row to assign!");
            return;
        }
        WorkRequest request = (WorkRequest) reportrequeststable.getValueAt(selectedRow, 0);
        JourneyReportGenerationWorkRequest request1 = (JourneyReportGenerationWorkRequest) reportrequeststable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == null) {
            request1.getsecurityCheckWorkRequest().setReceiver(userAccount);
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateReceiveTable();
        } else {
            JOptionPane.showMessageDialog(null, "Either this request does not belong to your account or it has already been assigned to you.");
            return;
        }

    }//GEN-LAST:event_assignJButton1ActionPerformed

    private void processJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButton1ActionPerformed
        int selectedRow = reportrequeststable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table to proceed!");
            return;
        }
        JourneyReportGenerationWorkRequest request = (JourneyReportGenerationWorkRequest) reportrequeststable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == userAccount) {
            if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "This request has already been completed!Choose another request");
                return;
            }
            request.setStatus("Processing");
            JourneyReportWorkRequestJPanel processWorkRequestJPanel = new JourneyReportWorkRequestJPanel(userProcessContainer, request, userAccount, business);
            userProcessContainer.add("ReportWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "This request doesnt belong to your account!");
            return;
        }

    }//GEN-LAST:event_processJButton1ActionPerformed

    private void refreshJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButton1ActionPerformed
        populateReceiveTable();

    }//GEN-LAST:event_refreshJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton assignJButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton processJButton1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton refreshJButton1;
    private javax.swing.JTable reportrequeststable;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

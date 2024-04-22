/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.JourneyReport;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JourneyReportGenerationWorkRequest;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class JourneyReportWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    JourneyReportGenerationWorkRequest request;
    private UserAccount userAccount;
    private EcoSystem business;
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
    private int counter = 0;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public JourneyReportWorkRequestJPanel(JPanel userProcessContainer, JourneyReportGenerationWorkRequest request, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.business = business;
        downloadPdfBtn.setEnabled(false);
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) tblPassenger.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblImmigrationDetails.getModel();
        model1.setRowCount(0);
        model2.setRowCount(0);
        if (request.getPassengerPerson() != null) {
            Object[] row = new Object[4];
            row[0] = request.getPassengerPerson().getName();
            row[1] = request.getPassengerPerson().getEmergencyNo();
            row[2] = request.getPassengerPerson().getPassportExpiry();
            row[3] = request.getPassengerPerson().getContactNo();
            model1.addRow(row);
        }
        Object[] row = new Object[2];
        row[0] = request.getsecurityCheckWorkRequest().getImmigrationDetails().get(0);
        row[1] = request.getNumberOfLuggage();
        model2.addRow(row);

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
        btnSubmit = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPassenger = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblImmigrationDetails = new javax.swing.JTable();
        downloadPdfBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(223, 190, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmit.setBackground(new java.awt.Color(181, 189, 137));
        btnSubmit.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnSubmit.setText("Submit Result");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 603, 250, 50));

        backJButton.setBackground(new java.awt.Color(181, 189, 137));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jLabel2.setBackground(new java.awt.Color(223, 190, 153));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Journey Report");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1296, 51));

        tblPassenger.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblPassenger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Emergency Contact No", "Passport Expiry Date", "Contact Number"
            }
        ));
        jScrollPane1.setViewportView(tblPassenger);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 200, 1302, 150));

        tblImmigrationDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblImmigrationDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Immigration Details", "No. of Luggage"
            }
        ));
        jScrollPane2.setViewportView(tblImmigrationDetails);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 435, 1296, 150));

        downloadPdfBtn.setBackground(new java.awt.Color(0, 102, 255));
        downloadPdfBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        downloadPdfBtn.setText("Download Report");
        downloadPdfBtn.setEnabled(false);
        downloadPdfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadPdfBtnActionPerformed(evt);
            }
        });
        jPanel1.add(downloadPdfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 603, 250, 50));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Journey Report will be generated of");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 133, 538, 49));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Journey Report Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 368, 538, 49));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1308, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //request.setTestResult("Send to Housing Agreement");
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }
        request.setStatus("Completed");
        request.getsecurityCheckWorkRequest().setTestResult("Completed and Journey Report is generated!");
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.getsecurityCheckWorkRequest().setReceiver(account);
        downloadPdfBtn.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Journey Report is generated successfully.");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        JourneyReportWorkAreaJPanel dwjp = (JourneyReportWorkAreaJPanel) component;
        dwjp.populateReceiveTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void downloadPdfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadPdfBtnActionPerformed


        String name = request.getPassengerPerson().getName();
        String contact = request.getPassengerPerson().getContactNo();
        String emegencyContactNumber = request.getPassengerPerson().getEmergencyNo();
        String dob = request.getPassengerPerson().getDob();
        String Destinationcity = request.getPassengerPerson().getDestinationCity();
        String passportNumber = request.getPassengerPerson().getPassportNumber();
        String contactNo = request.getPassengerPerson().getContactNo();
        String emailAddress = request.getPassengerPerson().getEmailAddress();
        String seatPreference = request.getPassengerPerson().getSeatPreference();  
        String gender = request.getPassengerPerson().getGender();
        String address = request.getPassengerPerson().getAddress();
        boolean accomodationReq = request.getPassengerPerson().isAccomodationReq();
        boolean preExtingDisease = request.getPassengerPerson().isPreConditions();
        boolean anyMedication = request.getPassengerPerson().isMedication();
        boolean hasCriminalRecord = request.getPassengerPerson().isHasCriminalRecord();
        String passortExpiryDate = request.getPassengerPerson().getPassportExpiry();
        String foodPreference = request.getPassengerPerson().getFoodPreference();
        String emergencyName = request.getPassengerPerson().getEmergencyName();
        String departureLocation = request.getPassengerPerson().getSourceLocation();
        String terminalPassengerReported = request.getsecurityCheckWorkRequest().getTerminalReported();
        String gateNumber = request.getsecurityCheckWorkRequest().getDepartmentDetais();
        String numberOfLuggage = request.getNumberOfLuggage();
        String immigrationDetails = request.getsecurityCheckWorkRequest().getImmigrationDetails().get(0);
        ArrayList<String> seatDetails = request.getsecurityCheckWorkRequest().getAllocatedSeat();
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("JourneyReport_" + counter + ".pdf"));
            document.open();
            addMetaData(document);
            addTitlePage(document, name, contact, emegencyContactNumber, dob, Destinationcity, passportNumber, contactNo, emailAddress, seatPreference, gender, address, accomodationReq, preExtingDisease, anyMedication, hasCriminalRecord, passortExpiryDate, foodPreference, emergencyName, departureLocation, terminalPassengerReported, gateNumber, numberOfLuggage, immigrationDetails, seatDetails);
            document.close();
            counter++;
            JOptionPane.showMessageDialog(null, "Journey Report file has been downloaded");

        } catch (Exception e) {
            //            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Pdf generator error");
        }
    }

    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    // Reader
    // under File -> Properties
    private static void addMetaData(Document document) {
        document.addTitle("Journey Report PDF");
        document.addSubject("");
        document.addKeywords("");
        document.addAuthor("Husky Air");
        document.addCreator("Husky Air");
    }

    private static void addTitlePage(Document document, String name, String contact, String emegencyContactNumber, String dob, String Destinationcity, String passportNumber, String contactNo, String emailAddress, String seatPreference, String gender, String address, boolean accomodationReq, boolean preExtingDisease, boolean anyMedication, boolean hasCriminalRecord, String passortExpiryDate, String foodPreference, String emergencyName, String departureLocation, String terminalPassengerReported, String gateNumber, String numberOfLuggage, String immigrationDetails, ArrayList<String> seatDetails)
            throws DocumentException {

        Paragraph preface = new Paragraph();

        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Husky Air", catFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Journey REPORT", catFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Journey Report generated by: " + System.getProperty("user.name") + ", " + new Date(), subFont));
        addEmptyLine(preface, 3);

        String paragraph = "Journey report is generated for " + name.toUpperCase() + "\n" +
                            "Date of Birth: " + dob + "\n" +
                            "Passport Number: " + passportNumber + "\n" +
                            "Destination City: " + Destinationcity + "\n" +
                            "Contact No: " + contactNo + "\n" +
                            "Email Address: " + emailAddress + "\n" +
                            "Seat Preference: " + seatPreference + "\n" +
                            "Gender: " + gender + "\n" +
                            "Street Address: " + address + "\n" +
                            "Has Criminal Record: " + hasCriminalRecord + "\n" +
                            "Passenger's Passport Expiry Date: " + passortExpiryDate + "\n" +
                            "Food Served: " + foodPreference + "\n" +
                            "Emergency Contact Name: " + emergencyName + "\n" +
                            "Emergency Contact Number:" + emegencyContactNumber + "\n" +
                            "Departure Location: " + departureLocation + "\n" +
                            "Reported Terminal: " + terminalPassengerReported + "\n" +
                            "Reported Gate Number: " + gateNumber + "\n" +
                            "Passenger's Seat Details: " + seatDetails.toString() + "\n" +
                            "Immigration Notes: " + immigrationDetails + "\n" +
                            "Number of Luggages: " + numberOfLuggage + "\n" +
                            "Do the passenger recieved any  special requirements or accommodations needed during the flight, such as wheelchair assistance or dietary restrictions? : " + accomodationReq + "\n" +
                            "Do the passenger had any pre-existing medical conditions or disabilities that may require assistance during the flight?: " + preExtingDisease + "\n" +
                            "Is passenger currently taking any medications that we should be aware of in case of an emergency?: " + anyMedication + "\n" +
                            "Thank you for flying with Husky Air!"+ "\n";

        preface.add(new Paragraph(paragraph, smallBold));

        addEmptyLine(preface, 1);

        preface.add(new Paragraph(
                "Please Fly with us again!",
                smallBold));

        document.add(preface);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_downloadPdfBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton downloadPdfBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblImmigrationDetails;
    private javax.swing.JTable tblPassenger;
    // End of variables declaration//GEN-END:variables
}

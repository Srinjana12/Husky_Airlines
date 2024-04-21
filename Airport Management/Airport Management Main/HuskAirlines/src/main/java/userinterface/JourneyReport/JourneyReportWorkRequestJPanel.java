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
        DefaultTableModel model1 = (DefaultTableModel) tblPersonRecords.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblHousingDetails.getModel();
        model1.setRowCount(0);
        model2.setRowCount(0);
        if (request.getPassengerPerson() != null) {
            Object[] row = new Object[4];
            row[0] = request.getPassengerPerson().getName();
            row[1] = request.getPassengerPerson().getIncome();
            row[2] = request.getPassengerPerson().getDependents();
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
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonRecords = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHousingDetails = new javax.swing.JTable();
        downloadPdfBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(223, 190, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(181, 189, 137));
        submitJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 603, 250, 50));

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

        tblPersonRecords.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblPersonRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Emergency Contact No", "Passport Expiry Date", "Contact Number"
            }
        ));
        jScrollPane1.setViewportView(tblPersonRecords);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 200, 1302, 150));

        tblHousingDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblHousingDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Immigration Details", "No. of Luggage"
            }
        ));
        jScrollPane2.setViewportView(tblHousingDetails);

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

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
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
    }//GEN-LAST:event_submitJButtonActionPerformed

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
//        String name = request.getHomelessPerson().getName();
//        String houseAddress = request.getHomelessPerson().getCurrentAddress();
//        String department = request.gethospitalAllocationWorkRequest().getDepartment();
//        String finalmedicines = request.getFinalmedicines();
//        String diseasedetails = request.gethospitalAllocationWorkRequest().getDiseasesForHomeless().get(0);
//        ArrayList<String> symptoms = request.gethospitalAllocationWorkRequest().getSymptoms();
//        String hospitaltobeplaced = request.gethospitalAllocationWorkRequest().gethospitalToBePlaced();
//        try {
//            Document document = new Document();
//            PdfWriter.getInstance(document, new FileOutputStream("HealthReport_" + counter + ".pdf"));
//            document.open();
//            addMetaData(document);
//            addTitlePage(document, name, houseAddress, hospitaltobeplaced, department, diseasedetails, finalmedicines, symptoms);
//            document.close();
//            counter++;
//            JOptionPane.showMessageDialog(null, "Health Report file has been downloaded");
//
//        } catch (Exception e) {
//            //            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Pdf generator error");
//        }
//    }

        String name = request.getPassengerPerson().getName();
        String contact = request.getPassengerPerson().getContactNo();
        int income = request.getPassengerPerson().getIncome();
        String dob = request.getPassengerPerson().getDob();
        String city = request.getPassengerPerson().getCity();
        String ssn = request.getPassengerPerson().getSSNNo();
        String contactNo = request.getPassengerPerson().getContactNo();
        String emailAddress = request.getPassengerPerson().getEmailAddress();
        String qualifications = request.getPassengerPerson().getQualifications();  
        int income1 = request.getPassengerPerson().getIncome();
        String gender = request.getPassengerPerson().getGender();
        String preferredLocation = request.getPassengerPerson().getPreferredLocation();
        boolean geneticDisease = request.getPassengerPerson().isGeneticDisease();
        boolean majorIllness = request.getPassengerPerson().isMajorIllness();
        boolean carrierDisease = request.getPassengerPerson().isCarrierDisease();
        boolean hasCriminalRecord = request.getPassengerPerson().isHasCriminalRecord();
        int dependents = request.getPassengerPerson().getDependents();
        String accomplishments = request.getPassengerPerson().getAccomplishments();
        String employmentStatus = request.getPassengerPerson().getEmploymentStatus();
        String houseAddress = request.getPassengerPerson().getCurrentAddress();
        String hospital = request.getsecurityCheckWorkRequest().getTerminalReported();
        String department = request.getsecurityCheckWorkRequest().getDepartmentDetais();
        String finalmedicines = request.getNumberOfLuggage();
        String diseasedetails = request.getsecurityCheckWorkRequest().getImmigrationDetails().get(0);
        ArrayList<String> symptoms = request.getsecurityCheckWorkRequest().getAllocatedSeat();
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("HealthReport_" + counter + ".pdf"));
            document.open();
            addMetaData(document);
            addTitlePage(document, name, contact, income, dob, city, ssn, contactNo, emailAddress, qualifications, income1, gender, preferredLocation, geneticDisease, majorIllness, carrierDisease, hasCriminalRecord, dependents, accomplishments, employmentStatus, houseAddress, hospital, department, finalmedicines, diseasedetails, symptoms);
            document.close();
            counter++;
            JOptionPane.showMessageDialog(null, "Health Report file has been downloaded");

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

    private static void addTitlePage(Document document, String name, String contact, int income, String dob, String city, String ssn, String contactNo, String emailAddress, String qualifications, int income1, String gender, String preferredLocation, boolean geneticDisease, boolean majorIllness, boolean carrierDisease, boolean hasCriminalRecord, int dependents, String accomplishments, String employmentStatus, String houseAddress, String hospital, String department, String finalmedicines, String diseasedetails, ArrayList<String> symptoms)
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
                            "Income: " + income + "\n" +
                            "Date of Birth: " + dob + "\n" +
                            "City: " + city + "\n" +
                            "SSN: " + ssn + "\n" +
                            "Contact No: " + contactNo + "\n" +
                            "Email Address: " + emailAddress + "\n" +
                            "Qualifications: " + qualifications + "\n" +
                            "Gender: " + gender + "\n" +
                            "Preferred Location: " + preferredLocation + "\n" +
                            "Genetic Disease: " + geneticDisease + "\n" +
                            "Major Illness: " + majorIllness + "\n" +
                            "Carrier Disease: " + carrierDisease + "\n" +
                            "Has Criminal Record: " + hasCriminalRecord + "\n" +
                            "Dependents: " + dependents + "\n" +
                            "Accomplishments: " + accomplishments + "\n" +
                            "Employment Status: " + employmentStatus + "\n" +
                            "House Address: " + houseAddress + "\n" +
                            "Was the person placed at selected Hospital?: YES" + "\n" +
                            "Pass/Fail Symptoms Check: YES" + "\n" +
                            "Went to Hospital: " + hospital + "\n" +
                            "Went to department: " + department + "\n" +
                            "Facing Symptoms: " + symptoms.toString() + "\n" +
                            "COVID Negative/Positive: Positive" + "\n" +
                            "Disease & Recommended Medicines Details: " + diseasedetails + "\n" +
                            "The final medicines are: " + finalmedicines + "\n" +
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
    private javax.swing.JButton downloadPdfBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTable tblHousingDetails;
    private javax.swing.JTable tblPersonRecords;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TicketPortalManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.AirportCheckinEnterprise;
import Business.Passenger;
import Business.Network.Network;
import Business.Organization.SecurityCheckin;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SecurityCheckWorkRequest;
import Email.SendGridEmail;
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sri15
 */
public class PassengerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PassengerJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
//    JScrollPane scrollPane = new JScrollPane(PassengerJPanel);
//    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
//    scrollPane.setBounds(50, 30, 300, 50);

    public PassengerJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
    }

    private boolean emailPatternCorrect() {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtEmailAddress.getText());
        boolean b = m.matches();
        return b;
    }
    public String convertFakerTimestammpIntoMMDDYY(String fakerDate){
       System.out.print
        ("date is " + fakerDate);
        String formattedDdateInDDMMYY = "";
            try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        Date formattedBirthday = dateFormat.parse(fakerDate);
        SimpleDateFormat newFormat = new SimpleDateFormat("MM/dd/yyyy");
        formattedDdateInDDMMYY = newFormat.format(formattedBirthday);
        
        } catch (Exception e) {
            formattedDdateInDDMMYY = "12/12/2000";
            e.printStackTrace(); // handle exception
        }
        return formattedDdateInDDMMYY;
    }
     public boolean validateDate(String dateString) {
        Pattern pattern;
        Matcher matcher;

        // Regex pattern for MM/dd/yyyy
        pattern = Pattern.compile("(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)");

        matcher = pattern.matcher(dateString);

        if (matcher.matches()) {
            matcher.reset();

            if (matcher.find()) {
                String month = matcher.group(1);
                String day = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if (day.equals("31")) {
                    // April, June, September, November cannot have 31 days
                    if (month.equals("4") || month.equals("6") || month.equals("9") || month.equals("11")) {
                        return false;
                    }
                }

                // Check February for leap year rules
                if (month.equals("2") || month.equals("02")) {
                    boolean isLeapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

                    if (day.equals("30") || day.equals("31")) {
                        return false;
                    }

                    if (day.equals("29") && !isLeapYear) {
                        return false;
                    }
                }

                return true;
            }
        }

        return false;
    }


    public boolean Datevalidate() {
        
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");

        matcher = pattern.matcher(txtFieldDOB.getText());

        if (matcher.matches()) {

            matcher.reset();

            if (matcher.find()) {

                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if (day.equals("31")
                        && (month.equals("4") || month.equals("6") || month.equals("9")
                        || month.equals("11") || month.equals("04") || month.equals("06")
                        || month.equals("09"))) {
                    return false; // only 1,3,5,7,8,10,12 has 31 days
                } else if (month.equals("2") || month.equals("02")) {
                    //leap year
                    if (year % 4 == 0) {
                        if (day.equals("30") || day.equals("31")) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        if (day.equals("29") || day.equals("30") || day.equals("31")) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
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
        jLabel30 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSeatPreference = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFoodPreference = new javax.swing.JTextField();
        BtnInsertMulPass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtFieldName = new javax.swing.JTextField();
        txtFieldDOB = new javax.swing.JTextField();
        txtPassportExpiryDate = new javax.swing.JTextField();
        txtFieldCity = new javax.swing.JTextField();
        txtFieldAddress = new javax.swing.JTextField();
        txtPassportNo = new javax.swing.JTextField();
        txtFieldContactNo = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        radioBtnFemaleGender = new javax.swing.JRadioButton();
        radioBtnMaleGender = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmergencyContactName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtEmergencyContactNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        radioBtnCriminalCheckYes = new javax.swing.JRadioButton();
        radioBtnCriminalCheckNo = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        radioBtnPreIllnessYes = new javax.swing.JRadioButton();
        radioBtnPreIllnessNo = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        radioBtnAnyMedYes = new javax.swing.JRadioButton();
        radioBtnAnyMedNo = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        radioBtnAccommodationYes = new javax.swing.JRadioButton();
        radioBtnAccommodationNo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        textAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnFakerFill = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnInsertPass = new javax.swing.JButton();

        setBackground(new java.awt.Color(223, 190, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(67, 67, 67))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 963, -1, 0));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setText("Food Preference:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 171, 28));

        txtSeatPreference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatPreferenceActionPerformed(evt);
            }
        });
        add(txtSeatPreference, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 259, 29));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel11.setText("Date of Birth:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 30));
        add(txtFoodPreference, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 259, 29));

        BtnInsertMulPass.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        BtnInsertMulPass.setText("Preferences:");
        add(BtnInsertMulPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 590, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setText("Seat Preference:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 171, 29));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel6.setText("Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel12.setText("Gender:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel13.setText("Passport expiry date:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel15.setText("Departure Location:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        jLabel31.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel31.setText("Destination City:");
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 30));

        txtFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNameActionPerformed(evt);
            }
        });
        add(txtFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 86, 259, 29));
        add(txtFieldDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 259, 29));

        txtPassportExpiryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportExpiryDateActionPerformed(evt);
            }
        });
        add(txtPassportExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 259, 29));

        txtFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCityActionPerformed(evt);
            }
        });
        add(txtFieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 259, 29));

        txtFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAddressActionPerformed(evt);
            }
        });
        add(txtFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 259, 29));

        txtPassportNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportNoActionPerformed(evt);
            }
        });
        add(txtPassportNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 259, 29));

        txtFieldContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldContactNoActionPerformed(evt);
            }
        });
        add(txtFieldContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 259, 29));

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });
        add(txtEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 259, 29));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel14.setText("Passport Number:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 120, 30));

        jLabel32.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel32.setText("Email Address:");
        add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 99, 30));

        jLabel34.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel34.setText("Contact Number:");
        add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 30));

        radioBtnFemaleGender.setText("Female");
        radioBtnFemaleGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleGenderActionPerformed(evt);
            }
        });
        add(radioBtnFemaleGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 179, -1, -1));

        radioBtnMaleGender.setText("Male");
        radioBtnMaleGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleGenderActionPerformed(evt);
            }
        });
        add(radioBtnMaleGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 179, -1, -1));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel25.setText("Emergency Contact Information:");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 510, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel7.setText("Name of emergency contact information:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 260, 34));

        txtEmergencyContactName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmergencyContactNameActionPerformed(evt);
            }
        });
        add(txtEmergencyContactName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 240, 29));

        jLabel29.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel29.setText("Contact number of emergency contact:");
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 300, 29));

        txtEmergencyContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmergencyContactNoActionPerformed(evt);
            }
        });
        add(txtEmergencyContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 240, 29));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setText(" Information for Criminal Check ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 430, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel18.setText("Have you ever pled guilty OR being convicted OR found guilty of misdemeanor in any U.S.?");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 630, 30));

        radioBtnCriminalCheckYes.setText("Yes");
        radioBtnCriminalCheckYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnCriminalCheckYesActionPerformed(evt);
            }
        });
        add(radioBtnCriminalCheckYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        radioBtnCriminalCheckNo.setText("No");
        radioBtnCriminalCheckNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnCriminalCheckNoActionPerformed(evt);
            }
        });
        add(radioBtnCriminalCheckNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setText("Medical and Special Requirements Confirmation Details:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 570, 30));

        btnSubmit.setBackground(new java.awt.Color(114, 158, 161));
        btnSubmit.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 250, 50));

        btnBack.setBackground(new java.awt.Color(114, 158, 161));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnBack.setText("< ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jLabel27.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel27.setText("Do you have any pre-existing medical conditions or disabilities that may require assistance during the flight?");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 700, 20));

        radioBtnPreIllnessYes.setText("Yes");
        radioBtnPreIllnessYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnPreIllnessYesActionPerformed(evt);
            }
        });
        add(radioBtnPreIllnessYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, -1, -1));

        radioBtnPreIllnessNo.setText("No");
        radioBtnPreIllnessNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnPreIllnessNoActionPerformed(evt);
            }
        });
        add(radioBtnPreIllnessNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, -1));

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel26.setText("Are you currently taking any medications that we should be aware of in case of an emergency?");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 610, 20));

        radioBtnAnyMedYes.setText("Yes");
        radioBtnAnyMedYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAnyMedYesActionPerformed(evt);
            }
        });
        add(radioBtnAnyMedYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, -1, -1));

        radioBtnAnyMedNo.setText("No");
        radioBtnAnyMedNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAnyMedNoActionPerformed(evt);
            }
        });
        add(radioBtnAnyMedNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        jLabel28.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel28.setText("Do you have any special requirements or accommodations needed during the flight, such as wheelchair assistance or dietary restrictions? ");
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 880, -1));

        radioBtnAccommodationYes.setText("Yes");
        radioBtnAccommodationYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAccommodationYesActionPerformed(evt);
            }
        });
        add(radioBtnAccommodationYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, -1, -1));

        radioBtnAccommodationNo.setText("No");
        radioBtnAccommodationNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAccommodationNoActionPerformed(evt);
            }
        });
        add(radioBtnAccommodationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Address:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 120, 30));

        textAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddressActionPerformed(evt);
            }
        });
        add(textAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 259, 29));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(104, 144, 146));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTER A PASSENGER");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 450, -1));

        jLabel17.setToolTipText("");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 220, 210));

        btnFakerFill.setBackground(new java.awt.Color(114, 158, 161));
        btnFakerFill.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnFakerFill.setText("Scan ID ");
        btnFakerFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFakerFillActionPerformed(evt);
            }
        });
        add(btnFakerFill, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 180, 50));

        btnClear.setBackground(new java.awt.Color(114, 158, 161));
        btnClear.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnClear.setText("Clear Fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 180, 50));

        btnInsertPass.setBackground(new java.awt.Color(114, 158, 161));
        btnInsertPass.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnInsertPass.setText("Insert 10 Passenger");
        btnInsertPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertPassActionPerformed(evt);
            }
        });
        add(btnInsertPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnCriminalCheckYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnCriminalCheckYesActionPerformed
        // TODO add your handling code here:
        radioBtnCriminalCheckNo.setSelected(false);
    }//GEN-LAST:event_radioBtnCriminalCheckYesActionPerformed

    private void radioBtnPreIllnessYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnPreIllnessYesActionPerformed
        // TODO add your handling code here:
        radioBtnPreIllnessNo.setSelected(false);
    }//GEN-LAST:event_radioBtnPreIllnessYesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TicketingPortalManagerAreaJPanel dwjp = (TicketingPortalManagerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (txtFieldName.getText().equals("") || txtFieldDOB.getText().equals("")
                || txtFieldCity.getText().equals("")
                || txtFieldAddress.getText().equals("")
                || txtPassportNo.getText().equals("")
                || txtEmailAddress.getText().equals("")
                || txtPassportExpiryDate.getText().equals("")
                || txtSeatPreference.getText().equals("")
                || txtFoodPreference.getText().equals("")
                || txtEmergencyContactName.getText().equals("")
                || txtEmergencyContactNo.getText().equals("")
                || textAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter all the Required Fields!");
            return;
        }

        if (!validateDate(txtFieldDOB.getText())) {
            JOptionPane.showMessageDialog(null, "Date of Birth should be in the format: MM/DD/YYYY");
            return;
        }

        if (!emailPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Email should be in the format: <name>@<company>.<domain>");
            return;
        }

        try {
            Long.parseLong(txtFieldContactNo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please type in a number for Contact No");
            return;
        }

        if (txtFieldContactNo.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Contact No should be exactly 10 digits");
            return;
        }

        if (txtPassportNo.getText().length() != 9) {
            JOptionPane.showMessageDialog(null, "Enter only 9 digits of passport (without '-')");
            return;
        }

        try {
            Integer.parseInt(txtPassportExpiryDate.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please type in a date format for Passporst Expiry Date");
            return;
        }
        try {
            Integer.parseInt(txtEmergencyContactNo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please type in a number for Emergency Contact Number");
            return;
        }

        if (Integer.parseInt(txtEmergencyContactNo.getText()) > 1500) {
            JOptionPane.showMessageDialog(null, "!");
            return;
        }
        if (!radioBtnMaleGender.isSelected() && !radioBtnFemaleGender.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select the Gender!");
            return;
        }
        if (!radioBtnCriminalCheckYes.isSelected() && !radioBtnCriminalCheckNo.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select a yes or no for criminal record!");
            return;
        }
        if (!radioBtnPreIllnessYes.isSelected() && !radioBtnPreIllnessNo.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select a yes or no for pre-existing medical conditions or disabilities!");
            return;
        }
        if (!radioBtnAnyMedYes.isSelected() && !radioBtnAnyMedNo.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select a yes or no for taking any medications!");
            return;
        }
        if (!radioBtnAccommodationYes.isSelected() && !radioBtnAccommodationNo.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select a yes or no for any special requirements or accommodations ");
            return;
        }

        String name = txtFieldName.getText();
        String dob = txtFieldDOB.getText();
        String Destinationcity = txtFieldCity.getText();
        String SourceLoc = txtFieldAddress.getText();
        String passportNo = txtPassportNo.getText();
        String contactNo = txtFieldContactNo.getText();
        String emailAddress = txtEmailAddress.getText();
        String passportExpiry = txtPassportExpiryDate.getText();
        String seatPreference = txtSeatPreference.getText();
        String foodPreference = txtFoodPreference.getText();
        String emergencyName = txtEmergencyContactName.getText();
        String emergencyNo = txtEmergencyContactNo.getText();
        String address = textAddress.getText();
        String gender = "Male";
        if (radioBtnFemaleGender.isSelected()) {
            gender = "Female";
        }
        boolean criminalRecord = false;
        if (radioBtnCriminalCheckYes.isSelected()) {
            criminalRecord = true;
        }
        boolean preconditions = false;
        if (radioBtnPreIllnessYes.isSelected()) {
            preconditions = true;
        }
        boolean anyMedication = false;
        if (radioBtnAnyMedYes.isSelected()) {
            anyMedication = true;
        }
        boolean accomodationRequired = false;
        if (radioBtnAccommodationYes.isSelected()) {
            accomodationRequired = true;
        }

        Passenger person = new Passenger(name, dob, Destinationcity, SourceLoc, passportNo, contactNo, emailAddress, passportExpiry, seatPreference, foodPreference, emergencyName, emergencyNo, gender, criminalRecord, preconditions, anyMedication, accomodationRequired, address);

        SecurityCheckWorkRequest allocationWorkRequest = new SecurityCheckWorkRequest();
        allocationWorkRequest.setPassengerPerson(person);
        allocationWorkRequest.setMessage("Security Check Request");
        allocationWorkRequest.setSender(userAccount);
        allocationWorkRequest.setStatus("Sent");
        Date date = new Date();
        allocationWorkRequest.setRequestDate(date);
        Organization hospitalAllocationOganization = null;

        for (Network network : business.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof AirportCheckinEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof SecurityCheckin) {
                            hospitalAllocationOganization = organization;
                            break;
                        }
                    }
                }
            }
        }
        if (hospitalAllocationOganization != null) {
            hospitalAllocationOganization.getWorkQueue().getWorkRequestList().add(allocationWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(allocationWorkRequest);
        }
        JOptionPane.showMessageDialog(this, "Request Sent to Security Check-in!");

        clearFields();
    }//GEN-LAST:event_btnSubmitActionPerformed

    public void clearFields() {
        txtFieldName.setText("");
        txtFieldDOB.setText("");
        txtFieldCity.setText("");
        txtFieldAddress.setText("");
        txtPassportNo.setText("");
        txtFieldContactNo.setText("");
        txtEmailAddress.setText("");
        txtPassportExpiryDate.setText("");
        txtSeatPreference.setText("");
        txtFoodPreference.setText("");
        txtEmergencyContactName.setText("");
        txtEmergencyContactNo.setText("");
        textAddress.setText("");
        radioBtnMaleGender.setSelected(false);
        radioBtnFemaleGender.setSelected(false);
        radioBtnCriminalCheckYes.setSelected(false);
        radioBtnCriminalCheckNo.setSelected(false);
        radioBtnPreIllnessYes.setSelected(false);
        radioBtnPreIllnessNo.setSelected(false);
        radioBtnAnyMedYes.setSelected(false);
        radioBtnAnyMedNo.setSelected(false);
        radioBtnAccommodationYes.setSelected(false);
        radioBtnAccommodationNo.setSelected(false);

    }
    private void radioBtnMaleGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleGenderActionPerformed
        radioBtnFemaleGender.setSelected(false);
    }//GEN-LAST:event_radioBtnMaleGenderActionPerformed

    private void radioBtnFemaleGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleGenderActionPerformed
        // TODO add your handling code here:
        radioBtnMaleGender.setSelected(false);
    }//GEN-LAST:event_radioBtnFemaleGenderActionPerformed

    private void radioBtnCriminalCheckNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnCriminalCheckNoActionPerformed
        // TODO add your handling code here:
        radioBtnCriminalCheckYes.setSelected(false);
    }//GEN-LAST:event_radioBtnCriminalCheckNoActionPerformed

    private void radioBtnPreIllnessNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnPreIllnessNoActionPerformed
        // TODO add your handling code here:
        radioBtnPreIllnessYes.setSelected(false);
    }//GEN-LAST:event_radioBtnPreIllnessNoActionPerformed

    private void radioBtnAnyMedYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAnyMedYesActionPerformed
        // TODO add your handling code here:
        radioBtnAnyMedNo.setSelected(false);
    }//GEN-LAST:event_radioBtnAnyMedYesActionPerformed

    private void radioBtnAnyMedNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAnyMedNoActionPerformed
        // TODO add your handling code here:
        radioBtnAnyMedYes.setSelected(false);
    }//GEN-LAST:event_radioBtnAnyMedNoActionPerformed

    private void radioBtnAccommodationYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAccommodationYesActionPerformed
        // TODO add your handling code here:
        radioBtnAccommodationNo.setSelected(false);
    }//GEN-LAST:event_radioBtnAccommodationYesActionPerformed

    private void radioBtnAccommodationNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAccommodationNoActionPerformed
        // TODO add your handling code here:
        radioBtnAccommodationYes.setSelected(false);
    }//GEN-LAST:event_radioBtnAccommodationNoActionPerformed

    private void txtFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAddressActionPerformed

    private void txtPassportExpiryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportExpiryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportExpiryDateActionPerformed

    private void txtFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNameActionPerformed

    private void txtFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCityActionPerformed

    private void txtFieldContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldContactNoActionPerformed

    private void txtPassportNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportNoActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void textAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAddressActionPerformed

    private void txtEmergencyContactNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyContactNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNameActionPerformed

    private void txtSeatPreferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatPreferenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatPreferenceActionPerformed

    private void txtEmergencyContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNoActionPerformed

    private void btnFakerFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFakerFillActionPerformed
        // TODO add your handling code here:
        fillDataInFormFieldsViaFakerAPI();
    }//GEN-LAST:event_btnFakerFillActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnInsertPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertPassActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < 10; i++) {
            fillDataInFormFieldsViaFakerAPI();
            btnSubmitActionPerformed(evt);
        }
    }//GEN-LAST:event_btnInsertPassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnInsertMulPass;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFakerFill;
    private javax.swing.JButton btnInsertPass;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioBtnAccommodationNo;
    private javax.swing.JRadioButton radioBtnAccommodationYes;
    private javax.swing.JRadioButton radioBtnAnyMedNo;
    private javax.swing.JRadioButton radioBtnAnyMedYes;
    private javax.swing.JRadioButton radioBtnCriminalCheckNo;
    private javax.swing.JRadioButton radioBtnCriminalCheckYes;
    private javax.swing.JRadioButton radioBtnFemaleGender;
    private javax.swing.JRadioButton radioBtnMaleGender;
    private javax.swing.JRadioButton radioBtnPreIllnessNo;
    private javax.swing.JRadioButton radioBtnPreIllnessYes;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmergencyContactName;
    private javax.swing.JTextField txtEmergencyContactNo;
    private javax.swing.JTextField txtFieldAddress;
    private javax.swing.JTextField txtFieldCity;
    private javax.swing.JTextField txtFieldContactNo;
    private javax.swing.JTextField txtFieldDOB;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFoodPreference;
    private javax.swing.JTextField txtPassportExpiryDate;
    private javax.swing.JTextField txtPassportNo;
    private javax.swing.JTextField txtSeatPreference;
    // End of variables declaration//GEN-END:variables

    private void fillDataInFormFieldsViaFakerAPI() {
        Faker faker = new Faker();
        String name = faker.name().fullName(); // Miss Samanta Schmidt
        txtFieldName.setText(name);
        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        textAddress.setText(streetAddress);
        String destinationCity = faker.address().city(); // New Amieshire
        txtFieldCity.setText(destinationCity);
        String tempdob = faker.date().birthday().toString();
        
        String dob =convertFakerTimestammpIntoMMDDYY(tempdob);         
        txtFieldDOB.setText(dob);
        String email = faker.internet().emailAddress(); //abc@bs.com
        txtEmailAddress.setText(email);
        String phone = faker.phoneNumber().subscriberNumber(10); // 1234567890
        txtFieldContactNo.setText(phone);
        String passport = faker.phoneNumber().subscriberNumber(9); // 123456789
        txtPassportNo.setText(passport);
        String sourceLocation = faker.address().city(); // New Amieshire`
        txtFieldAddress.setText(sourceLocation);
        String passportExpiry = convertFakerTimestammpIntoMMDDYY(faker.date().future(10000, TimeUnit.DAYS).toString()); // 12/12/2020
        txtPassportExpiryDate.setText(passportExpiry);
        String emergencyContactName = faker.name().fullName(); // Miss Samanta Schmidt
        txtEmergencyContactName.setText(emergencyContactName);
        String emergencyContactNo = faker.phoneNumber().subscriberNumber(10); // 1234567890
        txtEmergencyContactNo.setText(emergencyContactNo);

        String[] seatPreferences = {"Window", "Middle", "Aisle"};
        String seatPreference = seatPreferences[faker.random().nextInt(seatPreferences.length)];
        txtSeatPreference.setText(seatPreference);

        String[] foodPreferences = {"Veg", "Non-Veg", "Vegan"};
        String foodPreference = foodPreferences[faker.random().nextInt(foodPreferences.length)];
        txtFoodPreference.setText(foodPreference);

        if (faker.bool().bool()) {
            radioBtnMaleGender.setSelected(true);
            radioBtnFemaleGender.setSelected(false);
        } else {
            radioBtnMaleGender.setSelected(false);
            radioBtnFemaleGender.setSelected(true);
        }

        if (faker.bool().bool()) {
            radioBtnCriminalCheckYes.setSelected(true);
            radioBtnCriminalCheckNo.setSelected(false);
        } else {
            radioBtnCriminalCheckYes.setSelected(false);
            radioBtnCriminalCheckNo.setSelected(true);
        }

        if (faker.bool().bool()) {
            radioBtnPreIllnessYes.setSelected(true);
            radioBtnPreIllnessNo.setSelected(false);
        } else {
            radioBtnPreIllnessYes.setSelected(false);
            radioBtnPreIllnessNo.setSelected(true);
        }

        if (faker.bool().bool()) {
            radioBtnAnyMedYes.setSelected(true);
            radioBtnAnyMedNo.setSelected(false);
        } else {
            radioBtnAnyMedYes.setSelected(false);
            radioBtnAnyMedNo.setSelected(true);
        }

        if (faker.bool().bool()) {
            radioBtnAccommodationYes.setSelected(true);
            radioBtnAccommodationNo.setSelected(false);
        } else {
            radioBtnAccommodationYes.setSelected(false);
            radioBtnAccommodationNo.setSelected(true);
        }

    }
}

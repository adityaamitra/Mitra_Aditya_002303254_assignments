/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManagePerson;

import java.awt.CardLayout;


/**
 *
 * @author mitra
 */
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

public class CreatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonJPanel
     */
    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    
    public CreatePersonJPanel(JPanel container, PersonDirectory directory) {
        initComponents();
        userProcessContainer = container;
        personDirectory = directory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSsn = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblHome = new javax.swing.JLabel();
        lblStreet1 = new javax.swing.JLabel();
        txtStreet1 = new javax.swing.JTextField();
        lblUnit1 = new javax.swing.JLabel();
        txtUnit1 = new javax.swing.JTextField();
        lblStreet2 = new javax.swing.JLabel();
        lblCity1 = new javax.swing.JLabel();
        txtStreet2 = new javax.swing.JTextField();
        txtCity1 = new javax.swing.JTextField();
        lblUnit2 = new javax.swing.JLabel();
        lblState1 = new javax.swing.JLabel();
        txtUnit2 = new javax.swing.JTextField();
        txtState1 = new javax.swing.JTextField();
        lblCity2 = new javax.swing.JLabel();
        lblZip1 = new javax.swing.JLabel();
        txtCity2 = new javax.swing.JTextField();
        txtZip1 = new javax.swing.JTextField();
        lblState2 = new javax.swing.JLabel();
        lblPhone1 = new javax.swing.JLabel();
        txtPhone1 = new javax.swing.JTextField();
        lblAddPerson = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtState2 = new javax.swing.JTextField();
        lblZip2 = new javax.swing.JLabel();
        lblWork = new javax.swing.JLabel();
        txtZip2 = new javax.swing.JTextField();
        lblPhone2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtPhone2 = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblSsn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        lblAge.setText("Age");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblHome.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("Home Address");

        lblStreet1.setText("Street Address");

        txtStreet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreet1ActionPerformed(evt);
            }
        });

        lblUnit1.setText("Unit Number");

        lblStreet2.setText("Street Address");

        lblCity1.setText("City");

        txtCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCity1ActionPerformed(evt);
            }
        });

        lblUnit2.setText("Unit Number");

        lblState1.setText("State");

        lblCity2.setText("City");

        lblZip1.setText("Zip Code");

        lblState2.setText("State");

        lblPhone1.setText("Phone Number");

        lblAddPerson.setBackground(new java.awt.Color(204, 255, 255));
        lblAddPerson.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lblAddPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddPerson.setText("Add Person");

        lblFirstName.setText("First Name");

        lblZip2.setText("Zip Code");

        lblWork.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblWork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWork.setText("Work Address");

        lblPhone2.setText("Phone Number");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setText("Last Name");

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblSsn.setText("SSN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblZip1)
                    .addComponent(lblCity1)
                    .addComponent(lblStreet1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtZip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreet1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblUnit1)
                            .addGap(56, 56, 56))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblState1)
                            .addGap(22, 22, 22)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhone1)
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPhone1)
                    .addComponent(txtState1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUnit1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblFirstName)
                            .addComponent(lblSsn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLastName)
                                .addGap(18, 18, 18)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAge)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE))
                    .addComponent(lblWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblStreet2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCity2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblZip2)
                                        .addGap(39, 39, 39)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtZip2)
                                    .addComponent(txtCity2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStreet2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblUnit2)
                                            .addGap(56, 56, 56))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblState2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPhone2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUnit2)
                                    .addComponent(txtState2)
                                    .addComponent(txtPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(btnSave)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCity1, txtStreet1, txtZip1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCity1, lblStreet1, lblZip1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblFirstName, lblSsn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblLastName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtLastName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSsn)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(lblHome)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStreet1)
                            .addComponent(txtStreet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity1)
                            .addComponent(txtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblZip1)
                            .addComponent(txtZip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnit1)
                            .addComponent(txtUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblState1)
                            .addComponent(txtState1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone1)
                            .addComponent(txtPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWork)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet2)
                    .addComponent(txtStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnit2)
                    .addComponent(txtUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity2)
                    .addComponent(txtCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState2)
                    .addComponent(txtState2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip2)
                    .addComponent(txtZip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone2)
                    .addComponent(txtPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtStreet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreet1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreet1ActionPerformed

    private void txtCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCity1ActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int Ssn, Age, hphone, wphone, hzip, wzip, hunit, wunit;
        
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String ssn = txtSsn.getText();
        String age = txtAge.getText();
        String street1 = txtStreet1.getText();
        String city1 = txtCity1.getText();
        String state1 = txtState1.getText();
        String unit1 = txtUnit1.getText();
        String zip1 = txtZip1.getText();
        String phone1 = txtPhone1.getText();
        String street2 = txtStreet2.getText();
        String city2 = txtCity2.getText();
        String state2 = txtState2.getText();
        String unit2 = txtUnit2.getText();
        String zip2 = txtZip2.getText();
        String phone2 = txtPhone2.getText();

        if ("".equals(firstName) || "".equals(lastName) || "".equals(age) || "".equals(ssn)
            || "".equals(street1) || "".equals(unit1) || "".equals(city1) || "".equals(state1) || "".equals(zip1)
            || "".equals(street2) || "".equals(unit2) || "".equals(city2) || "".equals(state2) || "".equals(zip2)) {
            JOptionPane.showMessageDialog(null, "Please enter all the details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
            
        
        }
        else {
                    try{
                        Ssn = Integer.parseInt(ssn);
                    }catch (Exception e){
                    JOptionPane.showMessageDialog(this,"Enter Numeric value for SSN", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                    try{
                        Age = Integer.parseInt(age);
                    }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Age Should be a numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                    try{
                       hphone = Integer.parseInt(phone1); 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Work Phone Number Should be a numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    try{
                       wphone = Integer.parseInt(phone2); 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Home Phone Number Should be a numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    try{
                       hzip = Integer.parseInt(zip1); 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Work zip code Should be a numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    try{
                       wzip = Integer.parseInt(zip2); 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Home zip code Should be a numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    try{
                       hunit = Integer.parseInt(unit1); 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Home Unit Should be a numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    try{
                       wunit = Integer.parseInt(unit2); 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Work Unit Should be a numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    }
        Person person = personDirectory.addPerson();
        Address homeAddress = new Address();
        Address workAddress = new Address();
        
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setSsn(Ssn);
        person.setAge(Age);
        
        homeAddress.setStreetAddress(street1);
        homeAddress.setUnit(hunit);
        homeAddress.setCity(city1);
        homeAddress.setState(state1);
        homeAddress.setZipCode(hzip);
        homeAddress.setPhoneNumber(phone1);
        
        person.setHomeAddress(homeAddress);
        
        workAddress.setStreetAddress(street2);
        workAddress.setUnit(wunit);
        workAddress.setCity(city2);
        workAddress.setZipCode(wzip);
        workAddress.setPhoneNumber(phone2);
        
        person.setWorkAddress(workAddress);
        
        JOptionPane.showMessageDialog(this, "Person Added Successfully!!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtSsn.setText("");
        txtAge.setText("");
        txtStreet1.setText("");
        txtStreet2.setText("");
        txtUnit1.setText("");
        txtUnit2.setText("");
        txtCity1.setText("");
        txtCity2.setText("");
        txtState1.setText("");
        txtState2.setText("");
        txtZip1.setText("");
        txtZip2.setText("");
        txtPhone1.setText("");
        txtPhone2.setText("");
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddPerson;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCity2;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone1;
    private javax.swing.JLabel lblPhone2;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState1;
    private javax.swing.JLabel lblState2;
    private javax.swing.JLabel lblStreet1;
    private javax.swing.JLabel lblStreet2;
    private javax.swing.JLabel lblUnit1;
    private javax.swing.JLabel lblUnit2;
    private javax.swing.JLabel lblWork;
    private javax.swing.JLabel lblZip1;
    private javax.swing.JLabel lblZip2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity1;
    private javax.swing.JTextField txtCity2;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone1;
    private javax.swing.JTextField txtPhone2;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtState1;
    private javax.swing.JTextField txtState2;
    private javax.swing.JTextField txtStreet1;
    private javax.swing.JTextField txtStreet2;
    private javax.swing.JTextField txtUnit1;
    private javax.swing.JTextField txtUnit2;
    private javax.swing.JTextField txtZip1;
    private javax.swing.JTextField txtZip2;
    // End of variables declaration//GEN-END:variables
}

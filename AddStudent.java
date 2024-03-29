/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDir;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.coobird.thumbnailator.Thumbnails;

/**
 *
 * @author ash
 */
public class AddStudent extends javax.swing.JInternalFrame {
    private Component frame;

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        
        studno.setDocument(new JTextFieldLimit(8));
        lastname.setDocument(new JTextFieldLimit(20));
        firstname.setDocument(new JTextFieldLimit(20));
        middlename.setDocument(new JTextFieldLimit(2));
        age.setDocument(new JTextFieldLimit(2));
        section.setDocument(new JTextFieldLimit(4));
        guardian.setDocument(new JTextFieldLimit(30));
        contactno.setDocument(new JTextFieldLimit(11));
        address.setDocument(new JTextFieldLimit(100));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        studno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        birthday = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        section = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        guardian = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        contactno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        SaveCmd = new javax.swing.JButton();
        ClearCmd = new javax.swing.JButton();
        CancelCmd = new javax.swing.JButton();
        AddPicCMd = new javax.swing.JButton();
        ImageFrame = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Add Student"));
        setTitle("Add Student Info");

        jLabel1.setText("Student Number");

        studno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                studnoKeyTyped(evt);
            }
        });

        jLabel2.setText("Name");

        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastnameKeyTyped(evt);
            }
        });

        firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstnameKeyTyped(evt);
            }
        });

        middlename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                middlenameKeyTyped(evt);
            }
        });

        jLabel3.setText("Last Name");

        jLabel4.setText("First Name");

        jLabel5.setText("MI");

        jLabel6.setText("Age");

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });

        jLabel7.setText("Birthday(mm-dd-yyyy)");

        try {
            birthday.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        birthday.setText("mm/dd/yyyy");

        jLabel8.setText("Gender");

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel9.setText("Course");

        course.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BSCS", "BSN", "BSEd", "HRM" }));

        jLabel10.setText("Section");

        jLabel11.setText("Guardian");

        guardian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                guardianKeyTyped(evt);
            }
        });

        jLabel12.setText("Contact #");

        contactno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactnoKeyTyped(evt);
            }
        });

        jLabel13.setText("Address");

        SaveCmd.setText("Save");
        SaveCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCmdActionPerformed(evt);
            }
        });

        ClearCmd.setText("Clear");
        ClearCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCmdActionPerformed(evt);
            }
        });

        CancelCmd.setText("Cancel");
        CancelCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelCmdActionPerformed(evt);
            }
        });

        AddPicCMd.setText("Add Photo");
        AddPicCMd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPicCMdActionPerformed(evt);
            }
        });

        ImageFrame.setBackground(java.awt.Color.white);
        ImageFrame.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ImageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddPicCMd)
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(studno)
                                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(58, 58, 58)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(section)
                                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(guardian)
                                .addComponent(contactno)
                                .addComponent(address))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SaveCmd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ClearCmd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelCmd)))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddPicCMd))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(studno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel6))
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(guardian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SaveCmd)
                                    .addComponent(ClearCmd)
                                    .addComponent(CancelCmd)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        setBounds(200, 30, 732, 506);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelCmdActionPerformed

        this.dispose();
    }//GEN-LAST:event_CancelCmdActionPerformed

    private void ClearCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCmdActionPerformed

        studno.setText("");
        lastname.setText("");
        firstname.setText("");
        middlename.setText("");
        age.setText("");
        birthday.setText("");
        gender.setSelectedItem("Male");
        course.setSelectedItem("BSCS");
        section.setText("");
        guardian.setText("");
        contactno.setText("");
        address.setText("");
        ImageFrame.setIcon(null);
        studno.requestFocusInWindow();
        studno.selectAll();
    }//GEN-LAST:event_ClearCmdActionPerformed

    private void SaveCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCmdActionPerformed
        
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "students_dbs";
        Statement stmt = null;
        ResultSet res = null;
        ResultSet result = null;
        String driver = "com.mysql.jdbc.Driver";
        String databaseUserName = "user1";
        String databasePassword = "test";
        
        if(studno.getText().equals("") || lastname.getText().equals("") || firstname.getText().equals("") || middlename.getText().equals("") || age.getText().equals("") || birthday.getText().equals("") || section.getText().equals("") || guardian.getText().equals("") || contactno.getText().equals("") || address.getText().equals("")){
             JOptionPane.showMessageDialog(frame, "Please fill in empty fields!");
        }else{
            if(ImageFrame.getIcon() == null){
                JOptionPane.showMessageDialog(frame, "You need to upload an image!");
            }
            else{
            String sno = studno.getText();
            String lname = lastname.getText();
            String fname = firstname.getText();
            String mname = middlename.getText();
            String agee = age.getText();
            String bday = birthday.getText();
            String gend = gender.getSelectedItem() + "";
            String crs = course.getSelectedItem() + "";
            String sect = section.getText();
            String guard = guardian.getText();
            String cont = contactno.getText();
            String addr = address.getText();
            
           try {
                conn = DriverManager.getConnection(url + dbName, databaseUserName, databasePassword);
                stmt = conn.createStatement();
                result = null;
                System.out.println("Connection Passed!");

                } catch (Exception e) {
                        e.printStackTrace();
                }
           //end connection database testing
           
           //start check if studentno exists in archive
           try{
           String sql = "SELECT * FROM archive WHERE studentno = ?";
           PreparedStatement st = conn.prepareStatement(sql);    
            
           st=conn.prepareStatement(sql);
           st.setString(1, studno.getText());
           
           result=st.executeQuery();
            if(result.next()){
                JOptionPane.showMessageDialog(null, "Student Number already exists in Archive!");
                studno.requestFocusInWindow();
                studno.selectAll();
            }else{
            try {

            String sql1 = "INSERT INTO student (studentno, lastname, firstname, middlename, age, birthday, gender, course, section, guardian, contactno, address, image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st1 = conn.prepareStatement(sql1);

            st1.setString(1, sno);
            st1.setString(2, lname);
            st1.setString(3, fname);
            st1.setString(4, mname);
            st1.setString(5, agee);
            st1.setString(6, bday);
            st1.setString(7, gend);
            st1.setString(8, crs);
            st1.setString(9, sect);
            st1.setString(10, guard);
            st1.setString(11, cont);
            st1.setString(12, addr);
            st1.setBytes(13, person_name);
            
            st1.executeUpdate();
            
            
            JOptionPane.showMessageDialog(frame, "Student Info Successfully Added!");
            conn.close();

            studno.setText("");
            lastname.setText("");
            firstname.setText("");
            middlename.setText("");
            age.setText("");
            birthday.setText("");
            gender.setSelectedItem("Male");
            course.setSelectedItem("BSCS");
            section.setText("");
            guardian.setText("");
            contactno.setText("");
            address.setText("");
            ImageFrame.setIcon(null);
            studno.requestFocusInWindow();
            studno.selectAll();
            
                       }catch(Exception e){
                           JOptionPane.showMessageDialog(frame, "Student Number already exist!");
                           studno.requestFocusInWindow();
                           studno.selectAll();
                           System.out.println("SQL Error for main data insertion.");
                       }
           //end try-catch for database main insertion
            }
           }catch(Exception e){
               System.out.println("SQL Error in checking Archive before adding record.");
               
           }
           //end check if studentno exists in archive
                        
     
            }
}//else end if no empty fields
      
        
        //savecmd end--
    }//GEN-LAST:event_SaveCmdActionPerformed

    private void studnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studnoKeyTyped
        
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
            evt.consume();
        } 
    }//GEN-LAST:event_studnoKeyTyped

    private void lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyTyped

        char c = evt.getKeyChar();
        if(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
        
    }//GEN-LAST:event_lastnameKeyTyped

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped

        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
            evt.consume();
        } 
    }//GEN-LAST:event_ageKeyTyped

    private void contactnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactnoKeyTyped

        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
            evt.consume();
        } 
    }//GEN-LAST:event_contactnoKeyTyped

    private void firstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstnameKeyTyped

        char c = evt.getKeyChar();
        if(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
        
    }//GEN-LAST:event_firstnameKeyTyped

    private void middlenameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_middlenameKeyTyped

        char c = evt.getKeyChar();
        if(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
        
    }//GEN-LAST:event_middlenameKeyTyped

    private void guardianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardianKeyTyped

        char c = evt.getKeyChar();
        if(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
    }//GEN-LAST:event_guardianKeyTyped

    private void AddPicCMdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPicCMdActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();

        try{
            File image = new File(filename);
            BufferedImage bufferedimage = ImageIO.read(image);
            BufferedImage thumbnail = Thumbnails.of(bufferedimage)
        	.size(150, 150)
        	.asBufferedImage();

            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(thumbnail, "jpeg", os);

            InputStream is = new ByteArrayInputStream(os.toByteArray());

            // FileInputStream fis = new FileInputStream(image);

            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            byte[] buff = new byte[1024];
            
            try{
                for(int readNum; (readNum = is.read(buff)) != -1;){
                bos.write(buff,0,readNum);
                System.out.println("Read " +readNum+ " bytes ,");
                    }
                }catch(IOException ex){
                    System.out.println("Error resizing image.");
                 }

                    person_name = bos.toByteArray();
                    format = new ImageIcon(thumbnail);
                    ImageFrame.setIcon(format);

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Select an Image");
            }
    }//GEN-LAST:event_AddPicCMdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPicCMd;
    private javax.swing.JButton CancelCmd;
    private javax.swing.JButton ClearCmd;
    private javax.swing.JLabel ImageFrame;
    private javax.swing.JButton SaveCmd;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JFormattedTextField birthday;
    private javax.swing.JTextField contactno;
    private javax.swing.JComboBox course;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JTextField guardian;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middlename;
    private javax.swing.JTextField section;
    private javax.swing.JTextField studno;
    // End of variables declaration//GEN-END:variables
    String filename = null;
    private ImageIcon format = null;
    byte[] person_name = null;
    
}

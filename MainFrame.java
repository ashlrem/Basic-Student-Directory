/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDir;
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



/**
 *
 * @author ash
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("icon.jpg")).getImage());
        Check_Adtbl();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopMain = new javax.swing.JDesktopPane();
        excelsiorjet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        AddAdmin = new javax.swing.JMenu();
        AdminItem = new javax.swing.JMenuItem();
        Level1Item = new javax.swing.JMenuItem();
        Level2Item = new javax.swing.JMenuItem();
        Login = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        ExitCmd = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AddStudItem = new javax.swing.JMenuItem();
        UpdateStudItem = new javax.swing.JMenuItem();
        DelStudentItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        SearchItem = new javax.swing.JMenuItem();
        ArchiveItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basic Student Directory");
        setMaximumSize(new java.awt.Dimension(1080, 600));
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setResizable(false);

        excelsiorjet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentDir/jetbadge.png"))); // NOI18N
        excelsiorjet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excelsiorjetMouseClicked(evt);
            }
        });
        excelsiorjet.setBounds(950, 500, 125, 50);
        DesktopMain.add(excelsiorjet, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Logged in as: Guest");

        FileMenu.setText("Main");

        AddAdmin.setText("Add Account");
        AddAdmin.setEnabled(false);

        AdminItem.setText("Administrator");
        AdminItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminItemActionPerformed(evt);
            }
        });
        AddAdmin.add(AdminItem);

        Level1Item.setText("Level One");
        Level1Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level1ItemActionPerformed(evt);
            }
        });
        AddAdmin.add(Level1Item);

        Level2Item.setText("Level Two");
        Level2Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level2ItemActionPerformed(evt);
            }
        });
        AddAdmin.add(Level2Item);

        FileMenu.add(AddAdmin);

        Login.setText("Login");
        Login.setEnabled(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        FileMenu.add(Login);

        Logout.setText("Logout");
        Logout.setEnabled(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        FileMenu.add(Logout);

        ExitCmd.setText("Exit");
        ExitCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitCmdActionPerformed(evt);
            }
        });
        FileMenu.add(ExitCmd);

        jMenuBar1.add(FileMenu);

        jMenu2.setText("Student");
        jMenu2.setEnabled(false);

        AddStudItem.setText("Add Student Info");
        AddStudItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudItemActionPerformed(evt);
            }
        });
        jMenu2.add(AddStudItem);

        UpdateStudItem.setText("Update Student Info");
        UpdateStudItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudItemActionPerformed(evt);
            }
        });
        jMenu2.add(UpdateStudItem);

        DelStudentItem.setText("Delete Student Info");
        DelStudentItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelStudentItemActionPerformed(evt);
            }
        });
        jMenu2.add(DelStudentItem);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Search");
        jMenu1.setEnabled(false);

        SearchItem.setText("Search Student Info");
        SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchItemActionPerformed(evt);
            }
        });
        jMenu1.add(SearchItem);

        ArchiveItem.setText("Search Archive");
        ArchiveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchiveItemActionPerformed(evt);
            }
        });
        jMenu1.add(ArchiveItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopMain, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 919, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(DesktopMain, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        
    }//GEN-LAST:event_LogoutActionPerformed

    private void ExitCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitCmdActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitCmdActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        LoginForm lf = new LoginForm();
        DesktopMain.add(lf);
        lf.show();
    }//GEN-LAST:event_LoginActionPerformed

    private void AdminItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminItemActionPerformed

        AdminForm af = new AdminForm();
        DesktopMain.add(af);
        af.show();
    }//GEN-LAST:event_AdminItemActionPerformed

    private void Level1ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level1ItemActionPerformed

        LevelOneForm l1f = new LevelOneForm();
        DesktopMain.add(l1f);
        l1f.show();
    }//GEN-LAST:event_Level1ItemActionPerformed

    private void Level2ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level2ItemActionPerformed

        LevelTwoForm l2f = new LevelTwoForm();
        DesktopMain.add(l2f);
        l2f.show();
    }//GEN-LAST:event_Level2ItemActionPerformed

    private void AddStudItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudItemActionPerformed

        AddStudent as = new AddStudent();
        DesktopMain.add(as);
        as.show();
    }//GEN-LAST:event_AddStudItemActionPerformed

    private void DelStudentItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelStudentItemActionPerformed

        DelStudent ds = new DelStudent();
        DesktopMain.add(ds);
        ds.show();
    }//GEN-LAST:event_DelStudentItemActionPerformed

    private void SearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchItemActionPerformed

        SearchStud ss = new SearchStud();
        DesktopMain.add(ss);
        ss.show();
    }//GEN-LAST:event_SearchItemActionPerformed

    private void UpdateStudItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudItemActionPerformed

        UpdStudent us = new UpdStudent();
        DesktopMain.add(us);
        us.show();
    }//GEN-LAST:event_UpdateStudItemActionPerformed

    private void ArchiveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchiveItemActionPerformed

        SearchArchive sa = new SearchArchive();
        DesktopMain.add(sa);
        sa.show();
    }//GEN-LAST:event_ArchiveItemActionPerformed

    private void excelsiorjetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelsiorjetMouseClicked

    }//GEN-LAST:event_excelsiorjetMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try{
                    Thread.sleep(4500);
                    }catch(Exception e){
                        }
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddAdmin;
    private javax.swing.JMenuItem AddStudItem;
    private javax.swing.JMenuItem AdminItem;
    private javax.swing.JMenuItem ArchiveItem;
    private javax.swing.JMenuItem DelStudentItem;
    private javax.swing.JDesktopPane DesktopMain;
    private javax.swing.JMenuItem ExitCmd;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem Level1Item;
    private javax.swing.JMenuItem Level2Item;
    private javax.swing.JMenuItem Login;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenuItem SearchItem;
    private javax.swing.JMenuItem UpdateStudItem;
    private javax.swing.JLabel excelsiorjet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void Check_Adtbl() {
        
        
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "admin_dbs";
        Statement stmt = null;
        ResultSet result = null;
        String driver = "com.mysql.jdbc.Driver";
        String databaseUserName = "user1";
        String databasePassword = "test";
        
        try {
                conn = DriverManager.getConnection(url + dbName, databaseUserName, databasePassword);
                stmt = conn.createStatement();
                System.out.println("Connection Passed!");
                String sql = "SELECT username from allusers LIMIT 1";
                PreparedStatement st = conn.prepareStatement(sql);
                result = st.executeQuery();
                
                
                boolean empty = true;
                while( result.next() ) {
                empty = false;
                }
                if( empty ) {
            
                    System.out.println("Database is Empty");
                    AdminFormSignUp afsu = new AdminFormSignUp();
                    DesktopMain.add(afsu);
                    afsu.show();
                
                }
                else{
                    
                    System.out.println("Database not Empty!");
                    
                    LoginForm lf = new LoginForm();
                    DesktopMain.add(lf);
                    lf.show();
                    
                }
               
                } catch (Exception e) {
                        System.out.println("Failed to connect to the database. MainFrame");
                }
        
    }
}



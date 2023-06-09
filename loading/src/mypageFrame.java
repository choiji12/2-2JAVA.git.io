
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rnals
 */
public class mypageFrame extends javax.swing.JFrame {
    
    DB_MAN DBM =new DB_MAN();
    String strSQL="select userpoint from Point.user where userid = '" + ID.useridd + "'";
    String userpoint = "";
    /**
     * Creates new form mypage
     */
    public mypageFrame() {
        
        initComponents();
        mypageFrame.super.setSize(700, 500);
        mypageFrame.super.setLocation(500, 120);
        try{
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            while(DBM.DB_rs.next()){
            
            userpoint = (DBM.DB_rs.getString("userpoint"));}
                     
        DBM.DB_rs.close();
        DBM.dbClose();   
        }
        
        catch(Exception e){
            System.out.println("SQLException:" + e.getMessage());
        }     
        txtPoint.setText(userpoint);
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
        lblMyInfoTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        pnpassword = new javax.swing.JPanel();
        lblPasswordChange = new javax.swing.JLabel();
        txtPasswordChange = new javax.swing.JPasswordField();
        txtPasswordChangeCheck = new javax.swing.JPasswordField();
        btnPasswordChange = new javax.swing.JButton();
        lblPasswordcheke = new javax.swing.JLabel();
        pnPoint = new javax.swing.JPanel();
        lblPoint = new javax.swing.JLabel();
        txtPoint = new javax.swing.JTextField();
        txtPointChange = new javax.swing.JTextField();
        btnCharge = new javax.swing.JButton();
        btnExchange = new javax.swing.JButton();
        btnFire = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMyInfoTitle.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblMyInfoTitle.setText("마이페이지");

        btnBack.setFont(new java.awt.Font("맑은 고딕", 0, 16)); // NOI18N
        btnBack.setText("돌아가기");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        pnpassword.setBackground(new java.awt.Color(255, 255, 204));

        lblPasswordChange.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPasswordChange.setText("비밀번호 변경 :");

        txtPasswordChange.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        txtPasswordChangeCheck.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        btnPasswordChange.setFont(new java.awt.Font("맑은 고딕", 0, 16)); // NOI18N
        btnPasswordChange.setText("변경하기");
        btnPasswordChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasswordChangeActionPerformed(evt);
            }
        });

        lblPasswordcheke.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPasswordcheke.setText("비밀번호 확인 :");

        javax.swing.GroupLayout pnpasswordLayout = new javax.swing.GroupLayout(pnpassword);
        pnpassword.setLayout(pnpasswordLayout);
        pnpasswordLayout.setHorizontalGroup(
            pnpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpasswordLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(pnpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnpasswordLayout.createSequentialGroup()
                        .addComponent(lblPasswordChange)
                        .addGap(29, 29, 29)
                        .addComponent(txtPasswordChange, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnpasswordLayout.createSequentialGroup()
                        .addComponent(lblPasswordcheke)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPasswordChangeCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnpasswordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPasswordChange)
                .addGap(53, 53, 53))
        );
        pnpasswordLayout.setVerticalGroup(
            pnpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpasswordLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordChange)
                    .addComponent(txtPasswordChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordcheke)
                    .addComponent(txtPasswordChangeCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPasswordChange)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnPoint.setBackground(new java.awt.Color(204, 255, 255));

        lblPoint.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPoint.setText("현재 포인트 : ");

        txtPoint.setEditable(false);
        txtPoint.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        txtPointChange.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        btnCharge.setFont(new java.awt.Font("맑은 고딕", 0, 16)); // NOI18N
        btnCharge.setText("충전하기");
        btnCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeActionPerformed(evt);
            }
        });

        btnExchange.setFont(new java.awt.Font("맑은 고딕", 0, 16)); // NOI18N
        btnExchange.setText("환전하기");
        btnExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExchangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPointLayout = new javax.swing.GroupLayout(pnPoint);
        pnPoint.setLayout(pnPointLayout);
        pnPointLayout.setHorizontalGroup(
            pnPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPointLayout.createSequentialGroup()
                .addGroup(pnPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPointLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExchange))
                    .addGroup(pnPointLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblPoint)
                        .addGap(29, 29, 29)
                        .addGroup(pnPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPointChange, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtPoint))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCharge)))
                .addGap(48, 48, 48))
        );
        pnPointLayout.setVerticalGroup(
            pnPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPointLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPoint)
                    .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPointChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCharge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExchange)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnFire.setFont(new java.awt.Font("맑은 고딕", 0, 16)); // NOI18N
        btnFire.setText("탈퇴하기");
        btnFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnPoint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(lblMyInfoTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFire)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyInfoTitle)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(pnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFire)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame tf = new mainFrame();
        tf.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExchangeActionPerformed
        String pointck =txtPointChange.getText();
        if(pointck.equals("0") || pointck.equals("")){
            JOptionPane.showMessageDialog(null, "포인트를 넣어주세요.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            txtPasswordChangeCheck.setText(null);
            return;
        }
        int pointint = Integer.parseInt(txtPointChange.getText());
        if( pointint < 0 )
        {
            JOptionPane.showMessageDialog(null, "포인트를 맞게 넣어주세요", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            
            txtPointChange.setText(null);
            return;    
        }
        
        int check = (Integer.parseInt(txtPoint.getText())-Integer.parseInt(txtPointChange.getText()));
        
        if(check<0){
         JOptionPane.showMessageDialog(null, "포인트가 부족합니다.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
         txtPointChange.setText(null);
            return;                    
        }

        txtPoint.setText(Integer.toString(Integer.parseInt(txtPoint.getText())-Integer.parseInt(txtPointChange.getText())));
        strSQL ="update user set userpoint = '";
        strSQL += txtPoint.getText()+"' where userid = '" + ID.useridd +"'";
        
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            DBM.dbClose();
            
        } catch(Exception e){
            System.out.println("SQLException" + e.getMessage());            
        }
         
         txtPointChange.setText(null);
         JOptionPane.showMessageDialog(null, "환전 되었습니다.");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExchangeActionPerformed

    private void btnChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeActionPerformed
        String pointck =txtPointChange.getText();
        if(pointck.equals("0") || pointck.equals("")){
            JOptionPane.showMessageDialog(null, "포인트를 넣어주세요.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            txtPasswordChangeCheck.setText(null);
            return;
        }
        int pointint = Integer.parseInt(txtPointChange.getText());
        if( pointint < 0 )
        {
            JOptionPane.showMessageDialog(null, "포인트를 맞게 넣어주세요", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            
            txtPointChange.setText(null);
            return;    
        }
        
       
        
        txtPoint.setText(Integer.toString(Integer.parseInt(txtPoint.getText())+ Integer.parseInt(txtPointChange.getText())));
        strSQL ="update user set userpoint = '";
        strSQL += txtPoint.getText()+"' where userid = '" + ID.useridd +"'";
        
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            DBM.dbClose();
            
        } catch(Exception e){
            System.out.println("SQLException" + e.getMessage());            
        }
         
         txtPointChange.setText(null);
         JOptionPane.showMessageDialog(null, "충전 되었습니다.");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnChargeActionPerformed

    private void btnPasswordChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasswordChangeActionPerformed
        if(txtPasswordChange.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "패스워드를 입력하세요.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }if(!Arrays.equals(txtPasswordChange.getPassword(),txtPasswordChangeCheck.getPassword())){
            JOptionPane.showMessageDialog(null, "비밀번호가 맞지 않습니다.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;}
        
        strSQL ="update user set userpwd = ";      
        strSQL += "hex(aes_encrypt('"+txtPasswordChange.getText()+"','a')) "+"where userid = '" + ID.useridd +"'";
        
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            DBM.dbClose();
            
        } catch(Exception e){
            System.out.println("SQLException" + e.getMessage());            
        }
        JOptionPane.showMessageDialog(null, "비밀번호 변경이 완료 되었습니다.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        txtPasswordChangeCheck.setText(null);
        txtPasswordChange.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPasswordChangeActionPerformed

    private void btnFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFireActionPerformed
        // TODO add your handling code here:
        String useridd = null;
       strSQL = "delete from Point.user where userid = '" + ID.useridd + "'" ;                    
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            DBM.dbClose(); 
        
        
        }
        catch(Exception e){
            System.out.println("SQLException:" + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "탈퇴가 완료되었습니다.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        
        loginFrame mf = new loginFrame();
        mf.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_btnFireActionPerformed

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
            java.util.logging.Logger.getLogger(mypageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mypageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mypageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mypageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mypageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCharge;
    private javax.swing.JButton btnExchange;
    private javax.swing.JButton btnFire;
    private javax.swing.JButton btnPasswordChange;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMyInfoTitle;
    private javax.swing.JLabel lblPasswordChange;
    private javax.swing.JLabel lblPasswordcheke;
    private javax.swing.JLabel lblPoint;
    private javax.swing.JPanel pnPoint;
    private javax.swing.JPanel pnpassword;
    private javax.swing.JPasswordField txtPasswordChange;
    private javax.swing.JPasswordField txtPasswordChangeCheck;
    private javax.swing.JTextField txtPoint;
    private javax.swing.JTextField txtPointChange;
    // End of variables declaration//GEN-END:variables
}

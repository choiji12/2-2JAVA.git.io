/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rnals
 */

import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
public class mainFrame extends javax.swing.JFrame {
    DB_MAN DBM =new DB_MAN();
    String strSQL="select userpoint from Point.user where userid = '" + ID.useridd + "'";
    String userpoint = "";
    
    
    
    /**
     * Creates new form PointFrame
     */
                                  
    public mainFrame() {
        initComponents();
        mainFrame.super.setSize(700, 500);
        mainFrame.super.setLocation(500, 120);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnMyinfo = new javax.swing.JButton();
        lblPoint = new javax.swing.JLabel();
        txtPoint = new javax.swing.JTextField();
        txtBattingPoint = new javax.swing.JTextField();
        lblBattingPoint = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pbOneGage = new javax.swing.JProgressBar();
        pbTwoGage = new javax.swing.JProgressBar();
        pbThreeGage = new javax.swing.JProgressBar();
        RadioOneGage = new javax.swing.JRadioButton();
        RadioThreeGage = new javax.swing.JRadioButton();
        btnStart = new javax.swing.JButton();
        RadioTwoGage = new javax.swing.JRadioButton();
        lblGameResult = new javax.swing.JLabel();
        txtGameResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnMyinfo.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        btnMyinfo.setText("MYINFO");
        btnMyinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyinfoActionPerformed(evt);
            }
        });

        lblPoint.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPoint.setText("현재포인트 : ");

        txtPoint.setEditable(false);
        txtPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPointActionPerformed(evt);
            }
        });

        txtBattingPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBattingPointActionPerformed(evt);
            }
        });

        lblBattingPoint.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblBattingPoint.setText("배팅금액 :");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        pbOneGage.setMaximum(10);

        pbTwoGage.setMaximum(10);

        buttonGroup1.add(RadioOneGage);
        RadioOneGage.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        RadioOneGage.setText("1번 게이지");
        RadioOneGage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioOneGageActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioThreeGage);
        RadioThreeGage.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        RadioThreeGage.setText("3번 게이지");

        btnStart.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        btnStart.setText("게임시작");
        btnStart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioTwoGage);
        RadioTwoGage.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        RadioTwoGage.setText("2번 게이지");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RadioOneGage, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioTwoGage)
                            .addComponent(RadioThreeGage, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pbOneGage, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(pbTwoGage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbThreeGage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(158, 158, 158))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pbOneGage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadioOneGage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioTwoGage)
                    .addComponent(pbTwoGage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbThreeGage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioThreeGage))
                .addGap(32, 32, 32)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        lblGameResult.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblGameResult.setText("게임 결과 :");

        txtGameResult.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPoint)
                    .addComponent(lblBattingPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBattingPoint, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(txtPoint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMyinfo)
                .addGap(141, 141, 141))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblGameResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGameResult, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPoint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBattingPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBattingPoint)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnMyinfo)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGameResult)
                    .addComponent(txtGameResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        btnMyinfo.getAccessibleContext().setAccessibleName("MY INFO");
        txtPoint.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMyinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyinfoActionPerformed
        mypageFrame mp = new mypageFrame();
        mp.setVisible(true);
        this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_btnMyinfoActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        String pointck =txtBattingPoint.getText();
        if(pointck.equals("0") || pointck.equals("")){
            JOptionPane.showMessageDialog(null, "포인트를 넣어주세요.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pointint = Integer.parseInt(txtBattingPoint.getText());
        if( pointint < 0 )
        {
            JOptionPane.showMessageDialog(null, "포인트를 맞게 넣어주세요", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            txtBattingPoint.setText(null);
            return;    
        }
        
        int check = (Integer.parseInt(txtPoint.getText())-Integer.parseInt(txtBattingPoint.getText()));
        
        if(check<0){
         JOptionPane.showMessageDialog(null, "포인트가 부족합니다.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
         txtBattingPoint.setText(null);
            return;                    
        }
        
        pbOneGage.setValue(0);
        pbTwoGage.setValue(0);
        pbThreeGage.setValue(0);

        int re =0;

        int d[] = new int [3];
        Random r = new Random();
        
        for(int i =0; i<3; i++){
          
            d[i] = r.nextInt(10)+1;
            for(int j=0; j<i; j++){
                if(d[i]==d[j]){
                 i--;
                }
                
            }
        }
        
        pbOneGage.setMaximum(d[0]);
        pbTwoGage.setMaximum(d[1]);
        pbThreeGage.setMaximum(d[2]);
        
        
        int max=0;
        
        if (d[0] <= d[1] && d[0] <= d[2]) {
            max = d[0];
            txtGameResult.setText("1번 게이지");
        } else if (d[1] <= d[0] && d[1] <= d[2]) {
            max = d[1];
            txtGameResult.setText("2번 게이지");
        } else {
            max = d[2];
            txtGameResult.setText("3번 게이지");
        }
        
        Thread objThread1 = new PBarThread(pbOneGage);
        Thread objThread2 = new PBarThread(pbTwoGage);
        Thread objThread3 = new PBarThread(pbThreeGage);
        objThread1.start();
        objThread2.start();
        objThread3.start();
        
        if(RadioOneGage.isSelected())
        {
            re = pbOneGage.getMaximum();
        
        }
        
        if(RadioTwoGage.isSelected())
        {
            re = pbTwoGage.getMaximum();
        
        }
        if(RadioThreeGage.isSelected())
        {
            re = pbThreeGage.getMaximum();
        
        }
        if (max == re)
        {
            txtPoint.setText(Integer.toString(Integer.parseInt(txtPoint.getText())+Integer.parseInt(txtBattingPoint.getText())*2));
        }
        else
        {
            txtPoint.setText(Integer.toString(Integer.parseInt(txtPoint.getText())-Integer.parseInt(txtBattingPoint.getText())));
        }
         strSQL ="update user set userpoint = '";
   
        strSQL += txtPoint.getText()+"' where userid = '" + ID.useridd +"'";
        
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            DBM.dbClose();
            
        } catch(Exception e){
            System.out.println("SQLException" + e.getMessage());            
        }
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void RadioOneGageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioOneGageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioOneGageActionPerformed

    private void txtBattingPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBattingPointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBattingPointActionPerformed

    private void txtPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPointActionPerformed

    
    
    public class PBarThread extends Thread{
        final static int DELAY = 500;
        JProgressBar objProgressBar;
        
        public PBarThread(JProgressBar objPB){
        objProgressBar = objPB;
        objProgressBar.setStringPainted(false);
        
        }

        public void run(){
         
         int maxValue = objProgressBar.getMaximum();
         int minValue = objProgressBar.getMinimum();
         
         for(int idx = minValue; idx<maxValue; idx++){
            try{
                int iValue = objProgressBar.getValue();
                objProgressBar.setValue(iValue+1);
                Thread.sleep(DELAY);
            
            }catch(InterruptedException ignoredException){
            
            }
         }       
        }             
    }
    
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioOneGage;
    private javax.swing.JRadioButton RadioThreeGage;
    private javax.swing.JRadioButton RadioTwoGage;
    private javax.swing.JButton btnMyinfo;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBattingPoint;
    private javax.swing.JLabel lblGameResult;
    private javax.swing.JLabel lblPoint;
    private javax.swing.JProgressBar pbOneGage;
    private javax.swing.JProgressBar pbThreeGage;
    private javax.swing.JProgressBar pbTwoGage;
    private javax.swing.JTextField txtBattingPoint;
    private javax.swing.JTextField txtGameResult;
    private javax.swing.JTextField txtPoint;
    // End of variables declaration//GEN-END:variables
}

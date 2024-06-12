/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToeGame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class TicTacToeGame extends javax.swing.JFrame {

   private String start="X";
   private int xcount=0;
   private int ocount=0;
   boolean check;
   
    public TicTacToeGame() {
        initComponents();
    }
    private void score()
    {
        jlblPlayerX.setText(String.valueOf(xcount));
        jblPlayerO.setText(String.valueOf(ocount));
        
    }
     private void pickAPlayer()
    {
        if(start.equalsIgnoreCase("X"))
        {
            start="O";
        }
        else{
            start="X";
        }
        
    }
     private void win(){
     String b1=jButton4.getText();
     String b2= jButton9.getText();
     String b3=jButton5.getText();
     String b4=jButton6.getText();
     String b5=jButton7.getText();
     String b6=jButton8.getText();
     String b7=jButton12.getText();
     String b8=jButton10.getText();
     String b9=jButton11.getText();
     
     if(b1==("X") && b2==("X") && b3 == ("X"))
       {
          JOptionPane.showMessageDialog(this,"Player X Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton4.setBackground(Color.red);
          jButton9.setBackground(Color.red);
          jButton5.setBackground(Color.red);
          xcount++;
          score();
       }
      if(b4==("X") && b5==("X") && b6 == ("X"))
       {
          JOptionPane.showMessageDialog(this,"Player X Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton6.setBackground(Color.yellow);
          jButton7.setBackground(Color.yellow);
          jButton8.setBackground(Color.yellow);
          xcount++;
          score();
       }
      if(b7==("X") && b8==("X") && b9 == ("X"))
       {
          JOptionPane.showMessageDialog(this,"Player X Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton12.setBackground(Color.CYAN);
          jButton10.setBackground(Color.CYAN);
          jButton11.setBackground(Color.CYAN);
          xcount++;
          score();
       }
      if(b1==("X") && b4==("X") && b7 == ("X"))
       {
          JOptionPane.showMessageDialog(this,"Player X Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton4.setBackground(Color.pink);
          jButton6.setBackground(Color.pink);
          jButton12.setBackground(Color.pink);
          xcount++;
          score();
       }
      if(b2==("X") && b5==("X") && b8 == ("X"))
       {
          JOptionPane.showMessageDialog(this,"Player X Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton9.setBackground(Color.red);
          jButton7.setBackground(Color.red);
          jButton10.setBackground(Color.red);
          xcount++;
          score();
       }
      if(b3==("X") && b6==("X") && b9 == ("X"))
       {
          JOptionPane.showMessageDialog(this,"Player X Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton5.setBackground(Color.red);
          jButton8.setBackground(Color.red);
          jButton11.setBackground(Color.red);
          xcount++;
          score();
       }
      
      if(b1==("X") && b5==("X") && b9 == ("X"))
       {
          JOptionPane.showMessageDialog(this,"Player X Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton4.setBackground(Color.red);
          jButton7.setBackground(Color.red);
          jButton11.setBackground(Color.red);
          xcount++;
          score();
       }
      if(b3==("X") && b5==("X") && b7 == ("X"))
       {
          JOptionPane.showMessageDialog(this,"Player X Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton5.setBackground(Color.red);
          jButton7.setBackground(Color.red);
          jButton12.setBackground(Color.red);
          xcount++;
          score();
       }
      if(b1==("O") && b2==("O") && b3 == ("O"))
       {
          JOptionPane.showMessageDialog(this,"Player O Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton4.setBackground(Color.red);
          jButton9.setBackground(Color.red);
          jButton5.setBackground(Color.red);
          ocount++;
          score();
       }
      if(b4==("O") && b5==("O") && b6 == ("O"))
       {
          JOptionPane.showMessageDialog(this,"Player O Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton6.setBackground(Color.red);
          jButton7.setBackground(Color.red);
          jButton8.setBackground(Color.red);
          ocount++;
          score();
       }
      if(b7==("O") && b8==("O") && b9 == ("O"))
       {
          JOptionPane.showMessageDialog(this,"Player O Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton12.setBackground(Color.red);
          jButton10.setBackground(Color.red);
          jButton11.setBackground(Color.red);
          ocount++;
          score();
       }
      if(b1==("O") && b4==("O") && b7 == ("O"))
       {
          JOptionPane.showMessageDialog(this,"Player O Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton4.setBackground(Color.red);
          jButton6.setBackground(Color.red);
          jButton12.setBackground(Color.red);
          ocount++;
          score();
       }
      if(b2==("O") && b5==("O") && b8 == ("O"))
       {
          JOptionPane.showMessageDialog(this,"Player O Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton9.setBackground(Color.cyan);
          jButton7.setBackground(Color.cyan);
          jButton10.setBackground(Color.cyan);
          ocount++;
          score();
       }
      if(b3==("O") && b6==("O") && b9 == ("O"))
       {
          JOptionPane.showMessageDialog(this,"Player O Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton5.setBackground(Color.yellow);
          jButton8.setBackground(Color.yellow);
          jButton11.setBackground(Color.yellow);
          ocount++;
          score();
       }
      if(b1==("O") && b5==("O") && b9 == ("O"))
       {
          JOptionPane.showMessageDialog(this,"Player O Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton4.setBackground(Color.red);
          jButton7.setBackground(Color.red);
          jButton11.setBackground(Color.red);
          ocount++;
          score();
       }
      if(b3==("O") && b5==("O") && b7 == ("O"))
       {
          JOptionPane.showMessageDialog(this,"Player O Wins!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          jButton5.setBackground(Color.pink);
          jButton7.setBackground(Color.pink);
          jButton12.setBackground(Color.pink);
          ocount++;
          score();
       }
      
     
     
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private JFrame frame;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jblPlayerO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 490, 430));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 4, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 4));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLAYER O");

        jlblPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");

        jblPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("0");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLAYER X:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 210));

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton2.setText("New Game");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 255), 4));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 350, 90));

        jButton3.setBackground(new java.awt.Color(255, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton3.setText("Reset");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 255), 4));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 170, 80));

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 255), 4));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 170, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 820, 260));

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TAC");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 80));

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TOE");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, -1));

        jLabel7.setBackground(new java.awt.Color(255, 153, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GAME");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, -1));

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TIC");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnTic1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1
        jButton4.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jbtnTic1

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         jButton7.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         jButton8.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setText(start);
        if(start.equalsIgnoreCase("X"))
        {
            check=false;
        }
        else
        { check=true;
        }
        pickAPlayer();
        win();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       frame=new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"Really want to Quit the Game?", "Tic Tac Toe",JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION){
           System.exit(0);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jButton4.setEnabled(true);
       jButton5.setEnabled(true);
       jButton6.setEnabled(true);
       jButton7.setEnabled(true);
       jButton8.setEnabled(true);
       jButton9.setEnabled(true);
       jButton10.setEnabled(true);
       jButton11.setEnabled(true);
       jButton12.setEnabled(true);
       
       jButton4.setText("");
       jButton5.setText("");
       jButton6.setText("");
       jButton7.setText("");
       jButton8.setText("");
       jButton9.setText("");
       jButton10.setText("");
       jButton11.setText("");
       jButton12.setText("");
       
       
       jButton4.setBackground(Color.lightGray);
       jButton5.setBackground(Color.lightGray);
       jButton6.setBackground(Color.lightGray);
       jButton7.setBackground(Color.lightGray);
       jButton8.setBackground(Color.lightGray);
       jButton9.setBackground(Color.lightGray);
       jButton10.setBackground(Color.lightGray);
       jButton11.setBackground(Color.lightGray);
       jButton12.setBackground(Color.lightGray);
       
       
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton4.setEnabled(true);
       jButton5.setEnabled(true);
       jButton6.setEnabled(true);
       jButton7.setEnabled(true);
       jButton8.setEnabled(true);
       jButton9.setEnabled(true);
       jButton10.setEnabled(true);
       jButton11.setEnabled(true);
       jButton12.setEnabled(true);
       
       jlblPlayerX.setText("0");
       jblPlayerO.setText("0");
               
       jButton4.setText("");
       jButton5.setText("");
       jButton6.setText("");
       jButton7.setText("");
       jButton8.setText("");
       jButton9.setText("");
       jButton10.setText("");
       jButton11.setText("");
       jButton12.setText("");
       
       
       jButton4.setBackground(Color.lightGray);
       jButton5.setBackground(Color.lightGray);
       jButton6.setBackground(Color.lightGray);
       jButton7.setBackground(Color.lightGray);
       jButton8.setBackground(Color.lightGray);
       jButton9.setBackground(Color.lightGray);
       jButton10.setBackground(Color.lightGray);
       jButton11.setBackground(Color.lightGray);
       jButton12.setBackground(Color.lightGray);
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}

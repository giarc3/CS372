/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.io.*;

/**
 *
 * @author ccolegrove17
 */
public class Interface extends javax.swing.JFrame {

    User user = new User("", 0);
    RollDice dice = new RollDice();

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        moneyLabel = new javax.swing.JLabel();
        betField = new javax.swing.JTextField();
        underSevenButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        overSevenButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Over Under");

        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        moneyLabel.setText("Funds Available:");

        underSevenButton.setText("Under 7: pays 1-to-1");
        underSevenButton.setEnabled(false);
        underSevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underSevenButtonActionPerformed(evt);
            }
        });

        sevenButton.setText("7: pays 4-to-1");
        sevenButton.setEnabled(false);
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        overSevenButton.setText("Over 7: pays 1-to-1");
        overSevenButton.setEnabled(false);
        overSevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overSevenButtonActionPerformed(evt);
            }
        });

        infoLabel.setText("Information: ");

        jLabel1.setText("Amount to Bet: $");

        jLabel2.setText("Username:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(moneyLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(betField))
                            .addComponent(underSevenButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sevenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overSevenButton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(moneyLabel)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(betField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(underSevenButton)
                    .addComponent(sevenButton)
                    .addComponent(overSevenButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * For when the user presses the button to login
     *
     * @param evt
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameField.getText().toLowerCase();//reads the login textField and converts it to lowercase
        if ("".equals(username)) {//if the login textfield was left blank
            username = "anonymous";//sets username to Anonymouse
            usernameField.setText("Anonymous");//updates the textfield
        }
        String filename = username + ".txt"; //filename is a text file named their username
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(filename)); //tries to open the file with their username as the filename
            String line = rdr.readLine();//reads the first line of the file
            int money = Integer.parseInt(line);//converts the line to an integer
            rdr.close();//closes the file
            user.setName(username);//sets the user's username to what was in the text field
            user.setMoney(money);//sets the user's money to what was in the file
            infoLabel.setText("Information: Welcome back!");//greets the returning user
            moneyLabel.setText("Funds Available: $" + user.getMoney());//tells the user how much money he/she has
        } catch (Exception ex) {//if the file did not exist
            user.setName(username);//sets the user's username to what was in the text field
            user.setMoney(500);//gives the user $500 to start out
            infoLabel.setText("Information: New user. Added $500.");//tells the user they were added
            moneyLabel.setText("Funds Available: $" + user.getMoney());//tells the user how much money he/she has
        } finally {
            overSevenButton.setEnabled(true);//enables the betting buttons
            underSevenButton.setEnabled(true);//enables the betting buttons
            sevenButton.setEnabled(true);//enables the betting buttons
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * For when the user presses the button to bet for Under 7
     *
     * @param evt
     */
    private void underSevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underSevenButtonActionPerformed
        try {
            int bet = Integer.parseInt(betField.getText());//tries to turn the betting amount to an integer
            int roll = dice.Roll();//rolls the dice
            String result = user.placeBet(bet, roll, 2, 6, 1);//places the bet, passing in how much was bet, what the roll was, what the victory parameters are, and the betting multiplier
            moneyLabel.setText("Funds Available: $" + user.getMoney());//tells the user how much money he/she has
            infoLabel.setText("Information: You rolled " + roll + ". " + result);//tells them if they won and how much they earned
        } catch (IllegalArgumentException ex) {
            infoLabel.setText("Information: Please input a valid number.\n");//tells the user their input is invalid
        } catch (Exception ex) {
            infoLabel.setText("Information: Not enough money to make that bet.\n");//tells the user they don't have enough money
        }

    }//GEN-LAST:event_underSevenButtonActionPerformed

    /**
     * For when the user presses the button to bet for 7
     *
     * @param evt
     */
    //This button is the same as the UnderSeven button, but passes in different victory conditions and betting multiplier.
    //With so much copy/paste from above, I wanted to put all of this into my placeBet function
    //However, I don't know how to interact with the GUI from the User class
    //So I put what I could into the placeBet function and left the rest here
    //Comments for this section explain why it's here and not in the placeBet function
    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        try {
            int bet = Integer.parseInt(betField.getText());//reads in from the textField
            int roll = dice.Roll();//I want to output this later
            String result = user.placeBet(bet, roll, 7, 7, 4);//calls my function
            moneyLabel.setText("Funds Available: $" + user.getMoney());//sets the label
            infoLabel.setText("Information: You rolled " + roll + ". " + result);//sets the label
        } catch (IllegalArgumentException ex) {
            infoLabel.setText("Information: Please input a valid number.\n");//sets the label
        } catch (Exception ex) {
            infoLabel.setText("Information: Not enough money to make that bet.\n");//sets the label
        }

    }//GEN-LAST:event_sevenButtonActionPerformed

    /**
     * For when the user presses the button to bet for Over 7
     *
     * @param evt
     */
    //This button is the same as the UnderSeven button, but passes in different victory conditions and betting multiplier.
    //Comments for this button are the same as the Seven button and the UnderSeven button
    private void overSevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overSevenButtonActionPerformed
        try {
            int bet = Integer.parseInt(betField.getText());
            int roll = dice.Roll();
            String result = user.placeBet(bet, roll, 8, 12, 1);
            moneyLabel.setText("Funds Available: $" + user.getMoney());
            infoLabel.setText("Information: You rolled " + roll + ". " + result);
        } catch (IllegalArgumentException ex) {
            infoLabel.setText("Information: Please input a valid number.\n");
        } catch (Exception ex) {
            infoLabel.setText("Information: Not enough money to make that bet.\n");
        }

    }//GEN-LAST:event_overSevenButtonActionPerformed

    /**
     * For when the user hits enter in the login textField
     *
     * @param evt
     */
    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { //checks if the user presses enter in the text field
            loginButton.doClick();//clicks the button
        }
    }//GEN-LAST:event_usernameFieldKeyPressed

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
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField betField;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JButton overSevenButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton underSevenButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
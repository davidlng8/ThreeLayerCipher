/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cipher.java
 *
 * Created on Feb 4, 2013, 9:55:26 PM
 * By David Gardner
 */
package vernam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Ceaser;
import model.Vernam;
import java.util.Set;
import model.Vegeniere;

/**
 *
 * @author Admin
 */
public class Cipher extends JFrame {
    private final static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
    private boolean allow = false;
    /** Creates new form Cipher */
    public Cipher() {
        initComponents();
        this.setLocation(470, 300);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        encrypt = new javax.swing.JButton();
        input1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        keys = new javax.swing.JTextPane();
        randKeys = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        output1 = new javax.swing.JTextPane();
        txtKey = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        shift = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        decrypt = new javax.swing.JButton();
        input2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keys1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        output2 = new javax.swing.JTextPane();
        txtKey1 = new javax.swing.JTextField();
        shift1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Three Layer Encryptor");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        encrypt.setBackground(new java.awt.Color(0, 0, 0));
        encrypt.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        encrypt.setForeground(new java.awt.Color(255, 204, 0));
        encrypt.setText("Encrypt");
        encrypt.setToolTipText("");
        encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptActionPerformed(evt);
            }
        });

        input1.setText("Please enter text to encrypt");

        jLabel1.setText("Encrypted Text");

        keys.setText("Separate integer keys by a space or comma (,)");
        keys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keysMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(keys);

        randKeys.setBackground(new java.awt.Color(0, 0, 0));
        randKeys.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        randKeys.setForeground(new java.awt.Color(255, 204, 0));
        randKeys.setText("Generate Random Key");
        randKeys.setToolTipText("");
        randKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randKeysActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(output1);

        txtKey.setText("Enter Keyphrase");
        txtKey.setToolTipText("1 word no repeating characters");
        txtKey.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtKeyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKeyFocusLost(evt);
            }
        });

        jLabel2.setText("Shift:");

        shift.setModel(new javax.swing.SpinnerNumberModel(3, 1, 25, 1));
        shift.setToolTipText("");
        shift.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(input1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(encrypt)
                                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(randKeys)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(10, 10, 10)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(randKeys)
                    .addComponent(encrypt))
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Encrypt", jPanel1);

        decrypt.setBackground(new java.awt.Color(0, 0, 0));
        decrypt.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        decrypt.setForeground(new java.awt.Color(255, 204, 0));
        decrypt.setText("Decrypt");
        decrypt.setToolTipText("");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });

        input2.setText("Please enter text to decrypt");
        input2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input2MouseClicked(evt);
            }
        });
        input2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Decrypted Text");

        jLabel4.setText("Key Values");

        keys1.setText("Separate integer keys by a space or comma (,)");
        keys1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keys1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                keys1MousePressed(evt);
            }
        });
        keys1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                keys1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(keys1);

        jScrollPane4.setViewportView(output2);

        txtKey1.setText("Enter Keyphrase");
        txtKey1.setToolTipText("1 word no repeating characters");

        shift1.setModel(new javax.swing.SpinnerNumberModel(3, 1, 25, 1));
        shift1.setToolTipText("");
        shift1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setText("Shift:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(decrypt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtKey1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shift1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(shift1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtKey1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(decrypt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Decrypt", jPanel2);

        jMenu2.setText("Exit");
        jMenu2.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu2.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu2MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Encrypt");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu2MenuKeyPressed
        // TODO add your handling code here:
     System.exit(0);   
    }//GEN-LAST:event_jMenu2MenuKeyPressed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void keysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keysMouseClicked
        // TODO add your handling code here:
       if( "Separate integer keys by a space or comma (,)".equals(keys.getText())) 
            keys.setText("");
    }//GEN-LAST:event_keysMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosed

    private void keys1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keys1MouseClicked
        if( "Separate integer keys by a space or comma (,)".equals(keys1.getText())) 
            keys1.setText("");
    }//GEN-LAST:event_keys1MouseClicked

    private void encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptActionPerformed
        ArrayList<Integer> key = new ArrayList<Integer>();
        String str = keys.getText().trim(), nwStr = "";
        int val;
        char character;
        try{
            for(int n = 0; n < str.length(); n++){
                character = str.charAt(n);
                if(Character.isDigit(character))
                    nwStr += character;
                else{
                    val = Integer.parseInt(nwStr);
                  //  System.out.println(val);
                    key.add(val);
                    nwStr = "";
                }
            }
            val = Integer.parseInt(nwStr);
            //System.out.println(val);
            key.add(val);
            int charCount = 0;
            for(int x = 0; x < input1.getText().length();x++){
                if(alpha.contains(Character.toString(input1.getText().toUpperCase().charAt(x))))
                    charCount++;
            }
            if(key.size() < charCount)
                throw new Exception("Key count does not match characters, enter "+(charCount - key.size()+" more keys"));
            if(!allow)
                throw new Exception("passphrase cannot hav repeated characters or spaces ");
            nwStr = this.input1.getText().trim();
            Ceaser ceaser = new Ceaser(nwStr,(Integer)this.shift.getValue());
            nwStr = ceaser.encrypt();
            Vernam vernam = new Vernam(nwStr,key);
            nwStr = vernam.encrypt();
            Vegeniere ven = new Vegeniere(nwStr, this.txtKey.getText());
            nwStr = ven.encrypt();
            output1.setText(nwStr);
           this.input2.setText(output1.getText());
           this.shift1.setValue(this.shift.getValue());
           this.keys1.setText(this.keys.getText());
           this.txtKey1.setText(this.txtKey.getText());
           this.output2.setText("");
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Please specify integer keys", 
                    "No Keys Specified",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(), 
                    "Not enough keys",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_encryptActionPerformed

    private void randKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randKeysActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
	ArrayList<Integer> num = new ArrayList<Integer>();
        int val;
        String txt = "";
        for(int n = 0; n < input1.getText().length(); n++){
            if(input1.getText().charAt(n) == ' ')
                continue;
            val = rand.nextInt(200);
            num.add(val);
            txt += val+" ";
        }
        keys.setText(txt);
    }//GEN-LAST:event_randKeysActionPerformed

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> key = new ArrayList<Integer>();
        String str = keys1.getText().trim(), nwStr = "";
        int val;
        char character;
        
        try{
            if("".equals(input2.getText().trim()))
                throw new NullPointerException();
     
            for(int n = 0; n < str.length(); n++){
               character = str.charAt(n);
               if(Character.isDigit(character))
                   nwStr += character;
               else{
                   val = Integer.parseInt(nwStr);
                  // System.out.println(val);
                   key.add(val);
                   nwStr = "";
               }
            }
            val = Integer.parseInt(nwStr);
            //System.out.println(val);
            key.add(val);
            int charCount = 0;
            for(int x = 0; x < input2.getText().length();x++){
                if(alpha.contains(Character.toString(input2.getText().toUpperCase().charAt(x))))
                    charCount++;
            }
            if(key.size() < charCount)
                throw new Exception("Key count does not match characters, enter "+(charCount - key.size()+" more keys"));
            nwStr = input2.getText().trim();
           Vegeniere ven = new Vegeniere(nwStr, this.txtKey1.getText());
           nwStr = ven.decrypt();
            Vernam vernam = new Vernam(nwStr,key);
            nwStr = vernam.decrypt();
            Ceaser ceaser = new Ceaser(nwStr, (Integer)this.shift1.getValue());
            nwStr = ceaser.decrypt();
            output2.setText(nwStr);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Illegal Characters in key set", "No Keys Specified",JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Please specify text to decode", "No Text Specified",JOptionPane.ERROR_MESSAGE);
            
        }
        catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Invalid number of keys",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_decryptActionPerformed

    private void keys1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keys1MousePressed
        if( "Separate integer keys by a space or comma (,)".equals(keys1.getText())) 
            keys1.setText("");
    }//GEN-LAST:event_keys1MousePressed

    private void keys1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_keys1FocusGained
        // TODO add your handling code
        if( "Separate integer keys by a space or comma (,)".equals(keys1.getText())) 
            keys1.setText("");
    }//GEN-LAST:event_keys1FocusGained

    private void input2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input2MouseClicked
        // TODO add your handling code here:
        if("Please enter text to decrypt".equals(input2.getText()))
            this.input2.setText("");
    }//GEN-LAST:event_input2MouseClicked

    private void input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input2ActionPerformed

    private void txtKeyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKeyFocusGained
        // TODO add your handling code here:
        if(this.txtKey.getText().equals("Enter Keyphrase"))
            txtKey.setText("");
        
    }//GEN-LAST:event_txtKeyFocusGained

    private void txtKeyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKeyFocusLost
        // TODO add your handling code here:
        Set<Character> set = new HashSet<Character>();
        String txt = this.txtKey.getText(); 
        if(txt.equals("")){
            txtKey.setText("Enter Keyphrase");
            allow = false;
        }
        else{
            for(char c : txt.toCharArray())
                set.add(c);
            
            if(set.size() != txt.length()){
                JOptionPane.showMessageDialog(this, "Keyphrase has duplicates", "Invalid Key Phrase", JOptionPane.ERROR_MESSAGE);
            }
            else if(set.contains(" ")){
                JOptionPane.showMessageDialog(this, "Only single words, no spaces", "Invalid Key Phrase", JOptionPane.ERROR_MESSAGE);
            }
            else{
                allow = true;
            }
        }
    }//GEN-LAST:event_txtKeyFocusLost
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Cipher().setVisible(true);
            }
        });
        /*Vegeniere v = new Vegeniere("Hello world!23", "help");
        String s = v.encrypt();
        System.out.println(s);
        v = new Vegeniere(s, "help");
        s = v.decrypt();
        System.out.println(s);*/
    }
    
    
                                        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decrypt;
    private javax.swing.JButton encrypt;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane keys;
    private javax.swing.JTextPane keys1;
    private javax.swing.JTextPane output1;
    private javax.swing.JTextPane output2;
    private javax.swing.JButton randKeys;
    private javax.swing.JSpinner shift;
    private javax.swing.JSpinner shift1;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtKey1;
    // End of variables declaration//GEN-END:variables
}
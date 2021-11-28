/*
 * DialogAskFor.java
 *   Dialogo para pedir datos al usuario
 * Parte de proyecto: SisCongresos
 * Author: Pedro Cardoso Rdz
 * Mail: cardp_2004@yahoo.com.mx
 * Place: Zacatecas Mexico
 * 
    Copyright © 2010 Pedro Cardoso Rodriguez

    SisCongresos is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or any 
    later version.

    SisCongresos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with SisCongresos.  If not, see <http://www.gnu.org/licenses/>
 */
package Guis.Sistema;

import java.awt.Color;

/** 
 * @author  Pedro cardoso Rodriguez
 */
public class DialogAskFor extends javax.swing.JDialog {
    
    private int option;
    
    /** Creates new form DialogAskFor */
    public DialogAskFor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        Thread.setDefaultUncaughtExceptionHandler(new Logica.CatchUnhandledErrors((Ventana)parent));
        initComponents();
        setLocationRelativeTo(null);
        validateTree();
        btnClose.setColors(new Color(205,226,252),new Color(180,205,243),new Color(155,255,255));
        btnAOption.setColors(new Color(223,232,254),new Color(108,155,254),new Color(155,255,255));
        btnBOption.setColors(new Color(223,232,254),new Color(108,155,254),new Color(155,255,255));
        btnCOption.setColors(new Color(223,232,254),new Color(108,155,254),new Color(155,255,255));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlAll = new javax.swing.JPanel();
        pnlNorth = new javax.swing.JPanel();
        btnClose = new com.guis.SimpleButton();
        lblTitle = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnAOption = new com.guis.SimpleButton();
        btnBOption = new com.guis.SimpleButton();
        btnCOption = new com.guis.SimpleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnlAll.setBackground(new java.awt.Color(223, 232, 254));
        pnlAll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 160, 112), 3, true));
        pnlAll.setLayout(new java.awt.BorderLayout(5, 5));

        pnlNorth.setBackground(new java.awt.Color(223, 232, 254));

        btnClose.setText("X");
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        btnClose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCloseKeyPressed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblTitle.setForeground(new java.awt.Color(0, 153, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("? ? ?");

        javax.swing.GroupLayout pnlNorthLayout = new javax.swing.GroupLayout(pnlNorth);
        pnlNorth.setLayout(pnlNorthLayout);
        pnlNorthLayout.setHorizontalGroup(
            pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNorthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlNorthLayout.setVerticalGroup(
            pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblTitle))
        );

        pnlAll.add(pnlNorth, java.awt.BorderLayout.NORTH);

        pnlContainer.setBackground(new java.awt.Color(223, 232, 254));
        pnlContainer.setLayout(new java.awt.BorderLayout());

        jLabel2.setForeground(new java.awt.Color(223, 232, 254));
        jLabel2.setText("||");
        pnlContainer.add(jLabel2, java.awt.BorderLayout.WEST);

        jLabel1.setForeground(new java.awt.Color(223, 232, 254));
        jLabel1.setText("||");
        pnlContainer.add(jLabel1, java.awt.BorderLayout.EAST);

        jLabel3.setForeground(new java.awt.Color(223, 232, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("_");
        pnlContainer.add(jLabel3, java.awt.BorderLayout.SOUTH);

        pnlBody.setBackground(new java.awt.Color(223, 232, 254));
        pnlBody.setLayout(new java.awt.GridBagLayout());

        lblMessage.setText("Message");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 2);
        pnlBody.add(lblMessage, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 2);
        pnlBody.add(txtInput, gridBagConstraints);

        btnAOption.setText("Si");
        btnAOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAOptionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 2);
        pnlBody.add(btnAOption, gridBagConstraints);

        btnBOption.setText("No");
        btnBOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBOptionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 2);
        pnlBody.add(btnBOption, gridBagConstraints);

        btnCOption.setText("Cancelar");
        btnCOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOptionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 2);
        pnlBody.add(btnCOption, gridBagConstraints);

        pnlContainer.add(pnlBody, java.awt.BorderLayout.CENTER);

        pnlAll.add(pnlContainer, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlAll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCloseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCloseKeyPressed
        int key=evt.getKeyCode();
        if(key==java.awt.event.KeyEvent.VK_ESCAPE||key==java.awt.event.KeyEvent.VK_ENTER)
            dispose();
    }//GEN-LAST:event_btnCloseKeyPressed

    private void btnAOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAOptionActionPerformed
        option=1;
        dispose();
}//GEN-LAST:event_btnAOptionActionPerformed

    private void btnBOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBOptionActionPerformed
        option=2;
        dispose();
}//GEN-LAST:event_btnBOptionActionPerformed

    private void btnCOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOptionActionPerformed
        option=3;
        dispose();
}//GEN-LAST:event_btnCOptionActionPerformed
    
    /** Pide un dato o desicion al usuario
     * @param mss El mensaje a mostrar
     * @param intput si es true indica que se debe pedir un dato string
     * @param b1 El texto a mostrar el boton de primera opcion (null si se desea que ese boton no aparesca)
     * @param b2 El texto a mostrar el boton de segunda opcion (null si se desea que ese boton no aparesca)
     * @param b3 El texto a mostrar el boton de tercera opcion (null si se desea que ese boton no aparesca)
     */
    public void setUse(String mss, boolean input, String b1, String b2, String b3){
        lblMessage.setText(mss);
        txtInput.setVisible(input);
        if(b1!=null) btnAOption.setText(b1);
        else btnAOption.setVisible(false);
        if(b2!=null) btnBOption.setText(b2);
        else btnBOption.setVisible(false);
        if(b3!=null) btnCOption.setText(b3);
        else btnCOption.setVisible(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /** Obtiene el texto ingresado en el control txtInput
     * @return el texto ingresado en el control txtInput
     */
    public String getInput(){ return txtInput.getText(); }
    
    /** Regresa el codigo del boton elegido por el usuario
     * @return el codigo del boton elegido por el usuario
     *   1=btnAOption 2=btnBOption 3=btnCOption 
     *   (Por default los botones significan: SI NO CANCELAR)
     */
    public int getOption(){ return option; }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.guis.SimpleButton btnAOption;
    private com.guis.SimpleButton btnBOption;
    private com.guis.SimpleButton btnCOption;
    private com.guis.SimpleButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlAll;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
    
}
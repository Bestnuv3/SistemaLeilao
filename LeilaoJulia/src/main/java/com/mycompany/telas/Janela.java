package com.mycompany.telas;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Janela extends javax.swing.JFrame {
    static PanelLeilao panelLeilao;
    static PanelNovoLeilao panelNovoLeilao;
    static PanelLogin panelLogin;
    static PanelLeilaoCliente panelLeilaoCliente;
    
    public Janela() {
        initComponents();
        
        panelLogin = new PanelLogin();
        
        this.setLayout(new BorderLayout());
        this.add(panelLogin, BorderLayout.CENTER);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

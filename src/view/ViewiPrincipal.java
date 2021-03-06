/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import commons.report.pkg1.pkg8.pkg2.vreport;
import controller.Cliente;
import controller.Permissaousuario;
import controller.Produtos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ModelPermissaousuario;
import util.Datas;


/**
 *
 * @author Mike
 */
public class ViewiPrincipal extends javax.swing.JFrame {
    
    String pNomeUsuario;
  
    /**
     * Creates new form ViewPrincipal
     */
    public ViewiPrincipal() {
        
       setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        jPanel1 = new javax.swing.JPanel();
        btClientes = new javax.swing.JButton();
        btClientes4 = new javax.swing.JButton();
        btCidade = new javax.swing.JButton();
        brOrcamento = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();
        btRegistrarVenda = new javax.swing.JButton();
        btFormaPagamento = new javax.swing.JButton();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("sis_salao");
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1104, 631));

        uJPanelImagem1.setBackground(new java.awt.Color(35, 35, 40));
        uJPanelImagem1.setToolTipText("");
        uJPanelImagem1.setImagem(new java.io.File("C:\\PROJETO-SALAO\\src\\imagens\\back.png"));
        uJPanelImagem1.setMaximumSize(new java.awt.Dimension(693, 528));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setMinimumSize(new java.awt.Dimension(1102, 73));
        jPanel1.setName("Cadastros"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1102, 73));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btClientes.setBackground(new java.awt.Color(102, 102, 0));
        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconesSistema/Cliente.png"))); // NOI18N
        btClientes.setText("Clientes");
        btClientes.setBorder(null);
        btClientes.setBorderPainted(false);
        btClientes.setContentAreaFilled(false);
        btClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btClientes.setIconTextGap(-3);
        btClientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btClientes);

        btClientes4.setBackground(new java.awt.Color(102, 102, 0));
        btClientes4.setIcon(new javax.swing.ImageIcon("C:\\PROJETO-SALAO\\src\\imagens\\IconesSistema\\produtos.png")); // NOI18N
        btClientes4.setText("Produtos");
        btClientes4.setBorder(null);
        btClientes4.setBorderPainted(false);
        btClientes4.setContentAreaFilled(false);
        btClientes4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btClientes4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btClientes4.setIconTextGap(-3);
        btClientes4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btClientes4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btClientes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientes4ActionPerformed(evt);
            }
        });
        jPanel1.add(btClientes4);

        btCidade.setBackground(new java.awt.Color(102, 102, 0));
        btCidade.setIcon(new javax.swing.ImageIcon("C:\\PROJETO-SALAO\\src\\imagens\\IconesSistema\\Cidade.png")); // NOI18N
        btCidade.setText("Cidade");
        btCidade.setBorder(null);
        btCidade.setBorderPainted(false);
        btCidade.setContentAreaFilled(false);
        btCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCidade.setIconTextGap(-3);
        btCidade.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btCidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(btCidade);

        brOrcamento.setBackground(new java.awt.Color(102, 102, 0));
        brOrcamento.setIcon(new javax.swing.ImageIcon("C:\\PROJETO-SALAO\\src\\imagens\\IconesSistema\\agenda.png")); // NOI18N
        brOrcamento.setText("Agenda");
        brOrcamento.setBorder(null);
        brOrcamento.setBorderPainted(false);
        brOrcamento.setContentAreaFilled(false);
        brOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        brOrcamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        brOrcamento.setIconTextGap(-3);
        brOrcamento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        brOrcamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        brOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brOrcamentoActionPerformed(evt);
            }
        });
        jPanel1.add(brOrcamento);

        btFuncionario.setBackground(new java.awt.Color(102, 102, 0));
        btFuncionario.setIcon(new javax.swing.ImageIcon("C:\\PROJETO-SALAO\\src\\imagens\\IconesSistema\\funcionario.png")); // NOI18N
        btFuncionario.setText("Funcionario");
        btFuncionario.setBorder(null);
        btFuncionario.setBorderPainted(false);
        btFuncionario.setContentAreaFilled(false);
        btFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFuncionario.setIconTextGap(-3);
        btFuncionario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(btFuncionario);

        btRegistrarVenda.setBackground(new java.awt.Color(102, 102, 0));
        btRegistrarVenda.setIcon(new javax.swing.ImageIcon("C:\\PROJETO-SALAO\\src\\imagens\\IconesSistema\\compra.png")); // NOI18N
        btRegistrarVenda.setText("Venda");
        btRegistrarVenda.setBorder(null);
        btRegistrarVenda.setBorderPainted(false);
        btRegistrarVenda.setContentAreaFilled(false);
        btRegistrarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btRegistrarVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRegistrarVenda.setIconTextGap(-3);
        btRegistrarVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btRegistrarVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarVendaActionPerformed(evt);
            }
        });
        jPanel1.add(btRegistrarVenda);

        btFormaPagamento.setBackground(new java.awt.Color(102, 102, 0));
        btFormaPagamento.setIcon(new javax.swing.ImageIcon("C:\\PROJETO-SALAO\\src\\imagens\\IconesSistema\\FormaPagamento.png")); // NOI18N
        btFormaPagamento.setText("Forma de pagamento");
        btFormaPagamento.setBorder(null);
        btFormaPagamento.setBorderPainted(false);
        btFormaPagamento.setContentAreaFilled(false);
        btFormaPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btFormaPagamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFormaPagamento.setIconTextGap(-3);
        btFormaPagamento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btFormaPagamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFormaPagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(btFormaPagamento);

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 492, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cadastros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCidadeActionPerformed
           new ViewCidade().setVisible(true);    
    }//GEN-LAST:event_btCidadeActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void btClientes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientes4ActionPerformed
         new ViewProduto().setVisible(true);
    }//GEN-LAST:event_btClientes4ActionPerformed

    private void brOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brOrcamentoActionPerformed
        new ViewAgenda().setVisible(true);
    }//GEN-LAST:event_brOrcamentoActionPerformed

    private void btRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarVendaActionPerformed
        new ViewVenda().setVisible(true);
    }//GEN-LAST:event_btRegistrarVendaActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
       new ViewClientes().setVisible(true);
    }//GEN-LAST:event_btClientesActionPerformed

    private void btFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFormaPagamentoActionPerformed
         new ViewFormaPagamento().setVisible(true);
    }//GEN-LAST:event_btFormaPagamentoActionPerformed

   

  
   
   
    
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
            java.util.logging.Logger.getLogger(ViewiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brOrcamento;
    private javax.swing.JButton btCidade;
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btClientes4;
    private javax.swing.JButton btFormaPagamento;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btRegistrarVenda;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables

    private void JButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

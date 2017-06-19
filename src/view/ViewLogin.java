
package view;

import controller.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.ModelUsuario;


/**
 *
 * @author Mike
 */
public class ViewLogin extends javax.swing.JFrame {
    
   

    public ViewLogin() {

        initComponents();
        setLocationRelativeTo(null);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();
        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(153, 255, 153));
        setMaximumSize(new java.awt.Dimension(321, 167));
        setMinimumSize(new java.awt.Dimension(321, 167));
        setResizable(false);

        jLabel2.setText("Usuário:");

        jLabel3.setText("Senha:");

        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });

        bEntrar.setBackground(new java.awt.Color(153, 255, 153));
        bEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/OK.png"))); // NOI18N
        bEntrar.setText("Entrar");
        bEntrar.setFocusCycleRoot(true);
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        bSair.setBackground(new java.awt.Color(255, 51, 51));
        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jtfSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(bEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        // TODO add your handling code here:
        autenticar();
    }//GEN-LAST:event_bEntrarActionPerformed

    private void autenticar() {
        ModelUsuario modelUsuario = new ModelUsuario();
        Usuario controllerUsuario = new Usuario();
        modelUsuario.setLogin(this.jtfUsuario.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));
       
        if (controllerUsuario.getUsuarioController(modelUsuario)) {
            modelUsuario = controllerUsuario.getUsuarioController(modelUsuario.getLogin());
            ViewiPrincipal viewPrincipal = new ViewiPrincipal();
            viewPrincipal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário/Senha inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        // TODO add your handling code here:
        autenticar();
    }//GEN-LAST:event_jtfSenhaActionPerformed

        public static void main(String args[]) {         
            
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //começa o look aqui
                LookAndFeel lf = UIManager.getLookAndFeel();

                try {

                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }

                } catch (UnsupportedLookAndFeelException exc) {
                } catch (ClassNotFoundException exc) {
                } catch (InstantiationException exc) {
                } catch (IllegalAccessException exc) {
                }

                UIManager.put("nimbusBase", new Color(80, 100, 242));

                UIManager.put("nimbusBlueGrey", new Color(190, 189, 170));

                UIManager.put("control", new Color(242, 242, 242));
                //temina o look aqui
                new ViewLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables


}

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lab-mmd
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu1
     */
    public Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        btnListarDepartamentos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        itmListarUsuarios = new javax.swing.JMenu();
        itmCadastrarUsuarios = new javax.swing.JMenuItem();
        itmListarUsuario = new javax.swing.JMenuItem();
        itmAlterarUsuarios = new javax.swing.JMenuItem();
        itmExcluirUsuarios = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jMenu1.setMnemonic('D');
        jMenu1.setText("Departamentos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Alterar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Consultar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Excluir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        btnListarDepartamentos.setText("Listar");
        btnListarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDepartamentosActionPerformed(evt);
            }
        });
        jMenu1.add(btnListarDepartamentos);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('f');
        jMenu2.setText("Funcionários");

        jMenuItem6.setText("Cadastrar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Alterar");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Excluir");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Consultar");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Listar");
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setMnemonic('p');
        jMenu3.setText("Produtos");

        jMenuItem11.setText("Cadastrar");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Alterar");
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Consultar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Listar");
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Excluir");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuBar1.add(jMenu3);

        itmListarUsuarios.setMnemonic('u');
        itmListarUsuarios.setText("Usuários");

        itmCadastrarUsuarios.setText("Cadastrar");
        itmCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuariosActionPerformed(evt);
            }
        });
        itmListarUsuarios.add(itmCadastrarUsuarios);

        itmListarUsuario.setText("Listar");
        itmListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarUsuarioActionPerformed(evt);
            }
        });
        itmListarUsuarios.add(itmListarUsuario);

        itmAlterarUsuarios.setText("Alterar");
        itmAlterarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarUsuariosActionPerformed(evt);
            }
        });
        itmListarUsuarios.add(itmAlterarUsuarios);

        itmExcluirUsuarios.setText("Excluir");
        itmExcluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuariosActionPerformed(evt);
            }
        });
        itmListarUsuarios.add(itmExcluirUsuarios);

        jMenuItem20.setText("Consultar");
        itmListarUsuarios.add(jMenuItem20);

        jMenuBar1.add(itmListarUsuarios);

        jMenu5.setMnemonic('A');
        jMenu5.setText("Ajuda");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(570, 356));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    // 1 - Perguntar qual o usuário quero excluir
       String i;
       i = JOptionPane.showInputDialog("Qual departamento deseja excluir?");
       // 2 - conectar com o banco de dados MySQL
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root","admin");
       //3 - Excluir o usuário digitado da tabela do BD
       PreparedStatement st = conectado.prepareStatement("DELETE FROM departamento WHERE ID = ?");
       st.setString(1,i);
       int resultado = st.executeUpdate(); // executa o DELETE
       if (resultado == 1){
       // 4- Mostrar uma mensagem indicando que excluiu 
       JOptionPane.showMessageDialog (null, "Departamento excluído com sucesso");
       } else {
         JOptionPane.showMessageDialog (null, "Departamento não encontrado");
       }
       } catch (ClassNotFoundException  ex) {
          JOptionPane.showMessageDialog(null, "Driver não colocado na library");
       } catch (SQLException ex){
           JOptionPane.showMessageDialog (null, "Erro no banco de dados" + ex.getMessage());
           
              }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void itmListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarUsuarioActionPerformed
      new ListarUsuarios().setVisible(true);
    }//GEN-LAST:event_itmListarUsuarioActionPerformed

    private void itmCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuariosActionPerformed
      new CadastrarUsuarios().setVisible(true);
    }//GEN-LAST:event_itmCadastrarUsuariosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 new CadastrarDepartamentos().setVisible(true);       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmExcluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuariosActionPerformed
        // 1 - Perguntar qual o usuário quero excluir
       String u;
       u = JOptionPane.showInputDialog("Qual usuário deseja excluir?");
       // 2 - conectar com o banco de dados MySQL
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root","admin");
       //3 - Excluir o usuário digitado da tabela do BD
       PreparedStatement st = conectado.prepareStatement("DELETE FROM usuarios WHERE usuario = ?");
       st.setString(1,u);
       int resultado = st.executeUpdate(); // executa o DELETE
       if (resultado == 1){
       // 4- Mostrar uma mensagem indicando que excluiu 
       JOptionPane.showMessageDialog (null, "Usuário excluído com sucesso");
       } else {
         JOptionPane.showMessageDialog (null, "Usuário não encontrado");
       }
       } catch (ClassNotFoundException  ex) {
          JOptionPane.showMessageDialog(null, "Driver não colocado na library");
       } catch (SQLException ex){
           JOptionPane.showMessageDialog (null, "Erro no banco de dados" + ex.getMessage());
           
              }

    }//GEN-LAST:event_itmExcluirUsuariosActionPerformed

    private void btnListarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDepartamentosActionPerformed
        new ListarDepartamentos().setVisible (true);
    }//GEN-LAST:event_btnListarDepartamentosActionPerformed

    private void itmAlterarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarUsuariosActionPerformed
    new AlterarUsuarios().setVisible(true);
    }//GEN-LAST:event_itmAlterarUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnListarDepartamentos;
    private javax.swing.JMenuItem itmAlterarUsuarios;
    private javax.swing.JMenuItem itmCadastrarUsuarios;
    private javax.swing.JMenuItem itmExcluirUsuarios;
    private javax.swing.JMenuItem itmListarUsuario;
    private javax.swing.JMenu itmListarUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}

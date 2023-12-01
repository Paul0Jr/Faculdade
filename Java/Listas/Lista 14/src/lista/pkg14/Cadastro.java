package lista.pkg14;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.ResultSet;

public class Cadastro extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    Statement st = null;
    String buscaBD = null;
    String query = null;
    String BDurl = "jdbc:MySQL://127.0.0.1:3306/login";
    String BDusuario = "root";
    String BDsenha = "";

    public Cadastro() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        NomeText = new javax.swing.JFormattedTextField();
        EmailText = new javax.swing.JFormattedTextField();
        SenhaText = new javax.swing.JPasswordField();
        DataText = new javax.swing.JFormattedTextField();
        PaiText = new javax.swing.JFormattedTextField();
        MaeText = new javax.swing.JFormattedTextField();
        EndText = new javax.swing.JFormattedTextField();
        NumEndText = new javax.swing.JFormattedTextField();
        BairroText = new javax.swing.JFormattedTextField();
        CidadeText = new javax.swing.JFormattedTextField();
        EstadoText = new javax.swing.JFormattedTextField();
        Nome = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        Nome1 = new javax.swing.JLabel();
        Nome2 = new javax.swing.JLabel();
        Senha1 = new javax.swing.JLabel();
        Senha2 = new javax.swing.JLabel();
        Senha3 = new javax.swing.JLabel();
        Senha4 = new javax.swing.JLabel();
        Senha5 = new javax.swing.JLabel();
        Nome3 = new javax.swing.JLabel();
        CadBtn = new javax.swing.JButton();
        MsgLogin = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Titulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("CADASTRE SUA CONTA");

        NomeText.setBackground(new java.awt.Color(255, 255, 255));
        NomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTextActionPerformed(evt);
            }
        });

        EmailText.setBackground(new java.awt.Color(255, 255, 255));
        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });

        SenhaText.setBackground(new java.awt.Color(255, 255, 255));

        DataText.setBackground(new java.awt.Color(255, 255, 255));
        DataText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        DataText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextActionPerformed(evt);
            }
        });

        PaiText.setBackground(new java.awt.Color(255, 255, 255));
        PaiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaiTextActionPerformed(evt);
            }
        });

        MaeText.setBackground(new java.awt.Color(255, 255, 255));
        MaeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaeTextActionPerformed(evt);
            }
        });

        EndText.setBackground(new java.awt.Color(255, 255, 255));
        EndText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndTextActionPerformed(evt);
            }
        });

        NumEndText.setBackground(new java.awt.Color(255, 255, 255));
        NumEndText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumEndTextActionPerformed(evt);
            }
        });

        BairroText.setBackground(new java.awt.Color(255, 255, 255));
        BairroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BairroTextActionPerformed(evt);
            }
        });

        CidadeText.setBackground(new java.awt.Color(255, 255, 255));
        CidadeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidadeTextActionPerformed(evt);
            }
        });

        EstadoText.setBackground(new java.awt.Color(255, 255, 255));
        EstadoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoTextActionPerformed(evt);
            }
        });

        Nome.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Nome.setForeground(new java.awt.Color(0, 0, 0));
        Nome.setText("Nome Completo:");

        Email.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setText("Email:");

        Senha.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(0, 0, 0));
        Senha.setText("Senha:");

        Nome1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Nome1.setForeground(new java.awt.Color(0, 0, 0));
        Nome1.setText("Cidade:");

        Nome2.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Nome2.setForeground(new java.awt.Color(0, 0, 0));
        Nome2.setText("Bairro:");

        Senha1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Senha1.setForeground(new java.awt.Color(0, 0, 0));
        Senha1.setText("Data de Nascimento:");

        Senha2.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Senha2.setForeground(new java.awt.Color(0, 0, 0));
        Senha2.setText("Nome da Mãe:");

        Senha3.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Senha3.setForeground(new java.awt.Color(0, 0, 0));
        Senha3.setText("Nome do Pai:");

        Senha4.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Senha4.setForeground(new java.awt.Color(0, 0, 0));
        Senha4.setText("Número do Endereço:");

        Senha5.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Senha5.setForeground(new java.awt.Color(0, 0, 0));
        Senha5.setText("Endereço:");

        Nome3.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        Nome3.setForeground(new java.awt.Color(0, 0, 0));
        Nome3.setText("Estado:");

        CadBtn.setBackground(new java.awt.Color(204, 102, 0));
        CadBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        CadBtn.setForeground(new java.awt.Color(255, 255, 255));
        CadBtn.setText("CADASTRAR");
        CadBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadBtnActionPerformed(evt);
            }
        });

        MsgLogin.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        MsgLogin.setForeground(new java.awt.Color(0, 0, 0));
        MsgLogin.setText("Já possui conta?");

        LoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        LoginBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(0, 0, 0));
        LoginBtn.setText("Login");
        LoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Senha)
                            .addComponent(Email)
                            .addComponent(Senha1)
                            .addComponent(Senha2)
                            .addComponent(Senha3)
                            .addComponent(Senha4)
                            .addComponent(Senha5)
                            .addComponent(Nome)
                            .addComponent(Nome2)
                            .addComponent(Nome1)
                            .addComponent(Nome3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DataText)
                            .addComponent(SenhaText)
                            .addComponent(NomeText)
                            .addComponent(MaeText, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(EmailText, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(EndText, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(EstadoText, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(CidadeText, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(NumEndText, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(BairroText, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(PaiText, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(MsgLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoginBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(CadBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Titulo)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha)
                    .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha1)
                    .addComponent(DataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha3)
                    .addComponent(PaiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha5)
                    .addComponent(EndText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumEndText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome2)
                    .addComponent(BairroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome1)
                    .addComponent(CidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome3)
                    .addComponent(EstadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CadBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MsgLogin)
                    .addComponent(LoginBtn))
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DataTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed

    }//GEN-LAST:event_LoginBtnActionPerformed

    private void NomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTextActionPerformed

    private void CadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadBtnActionPerformed
        int nf = 0;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(BDurl, BDusuario, BDsenha);
                st = con.createStatement();
                query = "SELECT * FROM logincad where email ='" + DataText.getText() + "'";
                rs = st.executeQuery(query);
                while (rs.next()) {
                    buscaBD = rs.getString("email");
                    nf = 1;
                }
                if (nf == 1) {
                    JOptionPane.showMessageDialog(new JFrame(), "Email já utilizado!", "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
                } else {
                    //INSERIR NO BANCO
                    query = "INSERT INTO logincad (nome, email, senha, nascimento, nomepai, nomemae, endereco, numeroend, bairro, cidade, estado)" + "VALUES('" + NomeText.getText() + "', '" + EmailText.getText() + "', '" + SenhaText.getText() + "', '" + DataText.getText() + "', '" + PaiText.getText() + "', '" + MaeText.getText() + "', '" + EndText.getText() + "', '" + NumEndText.getText() + "', '" + BairroText.getText() + "', '" + CidadeText.getText() + "', '" + EstadoText.getText() + "')";
                    st.execute(query);
                    showMessageDialog(null, "Conta criada com sucesso!");
                    //SAIR DO CADASTRO
                    Login LoginFrame = new Login();
                    LoginFrame.setVisible(true);
                    LoginFrame.pack();
                    LoginFrame.setLocationRelativeTo(null);
                    this.dispose();
                }

            } catch (Exception e) {

                //ERRO NO CADASTRO E QUAL TIPO DE ERRO(MOSTRADO APENAS NO CONSOLE)
                System.out.println("ERRO!" + e.getMessage());
            }
        
    }//GEN-LAST:event_CadBtnActionPerformed

    private void MaeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaeTextActionPerformed

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextActionPerformed

    private void EndTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndTextActionPerformed

    private void EstadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoTextActionPerformed

    private void NumEndTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumEndTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumEndTextActionPerformed

    private void CidadeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidadeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeTextActionPerformed

    private void BairroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BairroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroTextActionPerformed

    private void PaiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaiTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField BairroText;
    private javax.swing.JButton CadBtn;
    private javax.swing.JFormattedTextField CidadeText;
    private javax.swing.JFormattedTextField DataText;
    private javax.swing.JLabel Email;
    private javax.swing.JFormattedTextField EmailText;
    private javax.swing.JFormattedTextField EndText;
    private javax.swing.JFormattedTextField EstadoText;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JFormattedTextField MaeText;
    private javax.swing.JLabel MsgLogin;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Nome1;
    private javax.swing.JLabel Nome2;
    private javax.swing.JLabel Nome3;
    private javax.swing.JFormattedTextField NomeText;
    private javax.swing.JFormattedTextField NumEndText;
    private javax.swing.JFormattedTextField PaiText;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Senha1;
    private javax.swing.JLabel Senha2;
    private javax.swing.JLabel Senha3;
    private javax.swing.JLabel Senha4;
    private javax.swing.JLabel Senha5;
    private javax.swing.JPasswordField SenhaText;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

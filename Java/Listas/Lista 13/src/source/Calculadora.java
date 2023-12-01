/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package source;

/**
 *
 * @author extre
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    double num, valor;
    int calculo;

    public void contas() {
        switch (calculo) {
            case 1 -> {
                valor = num + Double.parseDouble(Tela.getText());
                Tela.setText(Double.toString(valor));
            }
            case 2 -> {
                valor = num - Double.parseDouble(Tela.getText());
                Tela.setText(Double.toString(valor));
            }
            case 3 -> {
                valor = num * Double.parseDouble(Tela.getText());
                Tela.setText(Double.toString(valor));
            }
            case 4 -> {
                valor = num / Double.parseDouble(Tela.getText());
                Tela.setText(Double.toString(valor));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Enter = new javax.swing.JButton();
        Dois = new javax.swing.JButton();
        Quatro = new javax.swing.JButton();
        Um = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Virgula = new javax.swing.JButton();
        Sete = new javax.swing.JButton();
        Nove = new javax.swing.JButton();
        Oito = new javax.swing.JButton();
        Multi = new javax.swing.JButton();
        Div = new javax.swing.JButton();
        Adicao = new javax.swing.JButton();
        Subtracao = new javax.swing.JButton();
        Tela = new javax.swing.JTextField();
        Backspace = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(390, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Enter.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Enter.setText("=");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Dois.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Dois.setText("2");
        Dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoisActionPerformed(evt);
            }
        });

        Quatro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Quatro.setText("4");
        Quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuatroActionPerformed(evt);
            }
        });

        Um.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Um.setText("1");
        Um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton20.setText("%");

        Zero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Cinco.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Cinco.setText("5");
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });

        Seis.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Seis.setText("6");
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });

        Tres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Tres.setText("3");
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });

        Virgula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Virgula.setText(",");
        Virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VirgulaActionPerformed(evt);
            }
        });

        Sete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Sete.setText("7");
        Sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeteActionPerformed(evt);
            }
        });

        Nove.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Nove.setText("9");
        Nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoveActionPerformed(evt);
            }
        });

        Oito.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Oito.setText("8");
        Oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OitoActionPerformed(evt);
            }
        });

        Multi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Multi.setText("X");
        Multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiActionPerformed(evt);
            }
        });

        Div.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Div.setText("/");
        Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivActionPerformed(evt);
            }
        });

        Adicao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Adicao.setText("+");
        Adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicaoActionPerformed(evt);
            }
        });

        Subtracao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Subtracao.setText("-");
        Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtracaoActionPerformed(evt);
            }
        });

        Tela.setEditable(false);
        Tela.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Tela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Backspace.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Backspace.setText("<-");
        Backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackspaceActionPerformed(evt);
            }
        });

        Clean.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Clean.setText("C");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });

        Resultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resultado.setForeground(new java.awt.Color(255, 0, 0));
        Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tela, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Sete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Um, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Dois, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Adicao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Oito, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Nove, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Div, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tela, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Div, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Oito, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nove, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Um, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dois, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Adicao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        Tela.setText(Tela.getText() + "0");
    }//GEN-LAST:event_ZeroActionPerformed

    private void UmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UmActionPerformed
        Tela.setText(Tela.getText() + "1");
    }//GEN-LAST:event_UmActionPerformed

    private void DoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoisActionPerformed
        Tela.setText(Tela.getText() + "2");
    }//GEN-LAST:event_DoisActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        Tela.setText(Tela.getText() + "3");
    }//GEN-LAST:event_TresActionPerformed

    private void QuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuatroActionPerformed
        Tela.setText(Tela.getText() + "4");
    }//GEN-LAST:event_QuatroActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        Tela.setText(Tela.getText() + "5");
    }//GEN-LAST:event_CincoActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        Tela.setText(Tela.getText() + "6");
    }//GEN-LAST:event_SeisActionPerformed

    private void SeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeteActionPerformed
        Tela.setText(Tela.getText() + "7");
    }//GEN-LAST:event_SeteActionPerformed

    private void OitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OitoActionPerformed
        Tela.setText(Tela.getText() + "8");
    }//GEN-LAST:event_OitoActionPerformed

    private void NoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoveActionPerformed
        Tela.setText(Tela.getText() + "9");
    }//GEN-LAST:event_NoveActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        contas();
        Resultado.setText("");
    }//GEN-LAST:event_EnterActionPerformed

    private void AdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicaoActionPerformed
        //Tela.setText(Tela.getText() + " + ");
        num = Double.parseDouble(Tela.getText());
        calculo = 1;
        Tela.setText("");
        Resultado.setText(num + "+");
    }//GEN-LAST:event_AdicaoActionPerformed

    private void SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtracaoActionPerformed
        //Tela.setText(Tela.getText() + " - ");
        num = Double.parseDouble(Tela.getText());
        calculo = 2;
        Tela.setText("");
        Resultado.setText(num + "-");
    }//GEN-LAST:event_SubtracaoActionPerformed

    private void MultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiActionPerformed
        //Tela.setText(Tela.getText() + " - ");
        num = Double.parseDouble(Tela.getText());
        calculo = 3;
        Tela.setText("");
        Resultado.setText(num + "x");
    }//GEN-LAST:event_MultiActionPerformed

    private void DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivActionPerformed
        //Tela.setText(Tela.getText() + " - ");
        num = Double.parseDouble(Tela.getText());
        calculo = 4;
        Tela.setText("");
        Resultado.setText(num + "/");
    }//GEN-LAST:event_DivActionPerformed

    private void BackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackspaceActionPerformed
        int tam = Tela.getText().length();
        int num = Tela.getText().length() - 1;
        String st;
        if (tam > 0) {
            StringBuilder apagar = new StringBuilder(Tela.getText());
            apagar.deleteCharAt(num);
            st = apagar.toString();
            Tela.setText(st);
        }
    }//GEN-LAST:event_BackspaceActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        Tela.setText("");
    }//GEN-LAST:event_CleanActionPerformed

    private void VirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VirgulaActionPerformed
        Tela.setText(Tela.getText() + ",");
    }//GEN-LAST:event_VirgulaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicao;
    private javax.swing.JButton Backspace;
    private javax.swing.JButton Cinco;
    private javax.swing.JButton Clean;
    private javax.swing.JButton Div;
    private javax.swing.JButton Dois;
    private javax.swing.JButton Enter;
    private javax.swing.JButton Multi;
    private javax.swing.JButton Nove;
    private javax.swing.JButton Oito;
    private javax.swing.JButton Quatro;
    private javax.swing.JLabel Resultado;
    private javax.swing.JButton Seis;
    private javax.swing.JButton Sete;
    private javax.swing.JButton Subtracao;
    private javax.swing.JTextField Tela;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Um;
    private javax.swing.JButton Virgula;
    private javax.swing.JButton Zero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton20;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}

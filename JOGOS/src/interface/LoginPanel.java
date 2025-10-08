package
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

 interface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class LoginPanel extends TelaPanel {
      private JButton botaoLogin;
      public LoginPanel(JPanel telas, JFrame janela){
        super(telas, janela);
        JLabel mensagem = new JLabel("Conteudo de LoginPanel ");
        JButton botao = new JButton("Fazer Login");
        botao.addActionListener(this);

        this.add(mensagem);
        this.add(botao);

      }
      public void executarBotao(ActionEvent e); {
             trocaTela("Tela Principal");
      }
     
}

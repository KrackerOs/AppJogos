package inteface;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPanel extends TelaPanel{
    private JButton botaoLogin;//método JButton
    public LoginPanel(JPanel telas, JFrame janela) {
        super(telas,janela);
        JLabel mensagem = new JLabel("Conteúdo do Login Panel");

        JButton botao = new JButton("Fazer login"); 
        botao.addActionListener(this);

        this.add(mensagem);
        this.add(botao);
        this.add(imagem);
    }

    public void executarBotao(ActionEvent e){
        trocarTela("Tela Principal");
    }
}
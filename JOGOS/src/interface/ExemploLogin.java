
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class ExemploLogin extends JFrame implements ActionListener {

    private JButton botao;

    public ExemploLogin() {
        super("Janela de Login"); 


        setLayout(new FlowLayout()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        
     
        botao = new JButton("Fazer login");
        botao.addActionListener(this); 

      me
        add(botao);

   
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == botao) {
           
            JOptionPane.showMessageDialog(this, "Login efetuado com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new ExemploLogin();
    }
}
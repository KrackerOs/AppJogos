package interface;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JFrame;                         
public class Janela extends JFrame{
    public Janela(){

        this.setBounds(0,0,1020,1080);
        CardLayout controleTela = New 
        CardLayout();
        JPanel telas = new JPanel
        (controleTela);
        LoginPanel LoginPanel = new LoginPanel(telas, this);
        PrincipalPanel PrincipalPanel = new Principalpanel(telas,this);

        this.add(telas);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
        
        
    }
}

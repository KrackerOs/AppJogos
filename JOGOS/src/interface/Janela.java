package interface;
import javax.swing.JPanel;


import java.awt.CardLayout;



import javax.swing.JFrame;
                                
public class Janela extends JFrame{
    public Janela(){
        this.setBounds(0,0,1020,1080);
        CardLayout controleTela = New 
        CardLayout();
        JPanel telas = NEW JPanel
        (controleTela);
        LoginPanel LoginPanel = New LoginPanel(telas, this);
    }
}

import javax.swing.JFrame;

public class JanelaMobile {

    public static void main(String[] args) {
      
        JFrame janela = new JFrame();

      
        janela.setTitle("Janela Mobile");

        int x = 0;
        int y = 0;
        int largura = 750;
        int altura = 320;
        janela.setBounds(x, y, largura, altura);
        
       
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        janela.setVisible(true);
    }
}
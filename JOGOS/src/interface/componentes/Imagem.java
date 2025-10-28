package inteface.componentes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagem extends JLabel{
    public Imagem(String nome){
        super();
        ImageIcon icone = new ImageIcon(Imagem.class.getResource("/imagens/windows-close.png"));
        setIcon(icone);
        repaint();
    }
}
package views;

import javax.swing.*;
import java.awt.event.PaintEvent;

public abstract class PainelPadrao extends JPanel {
    public PainelPadrao(){
        setSize(1072,720);
        setLayout(null);
    }
    public void fundo(String foto) {
        ImageIcon imagem = new ImageIcon("src/main/java/imagens/"+foto+".png");
        JLabel label = new JLabel();
        label.setIcon(imagem);
        label.setBounds(0,0,getWidth(),getHeight());
        add(label);
        repaint();
    }
}

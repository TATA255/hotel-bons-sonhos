package views;

import views.ObjetosTelas.Botao;
import views.ObjetosTelas.EspacoTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import controller.QuartoController;

public class RemoverQuarto extends PainelPadrao{
    private EspacoTexto numero = new EspacoTexto();
    private EspacoTexto categoria = new EspacoTexto();
    private EspacoTexto andar = new EspacoTexto();
    private Botao remover = new Botao(false);

    public RemoverQuarto(){
        objetos();
        ouvintes();
        fundo("remover Quarto");
    }

    private void ouvintes() {
        remover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numeroQuarto = Integer.parseInt(numero.getText());
                String tipoQuarto = categoria.getText();
                int andarQuarto = Integer.parseInt(andar.getText());

                if (QuartoController.removerQuarto(numeroQuarto, tipoQuarto, andarQuarto)) {
                    JOptionPane.showMessageDialog(null, "Quarto removido com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(null, "Quarto não encontrado", "Erro", JOptionPane.ERROR);
                }
            }
        });
    }

    private void objetos() {
        int a = 373, c = 324, d = 50;
        numero.setBounds(a,238,c,d);
        categoria.setBounds(a,332,c,d);
        andar.setBounds(a,426,c,d);
        remover.setBounds(409,547,252,71);
        add(numero);
        add(categoria);
        add(andar);
        add(remover);
    }
}

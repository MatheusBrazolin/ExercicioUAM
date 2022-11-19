
import java.awt.*;
import javax.swing.*;

public class Jogo {

    private int contador = 0;
    private String JogadoInicial = "X";

    private JButton[][] button = {
        {new JButton(), new JButton(), new JButton()},
        {new JButton(), new JButton(), new JButton()},
        {new JButton(), new JButton(), new JButton()},};

    public void show() {
        JFrame frame = new JFrame("Jogo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(3, 3));
        panel.setPreferredSize(new Dimension(500, 500));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton btnAtual = button[i][j];
                panel.add(btnAtual);

                btnAtual.addActionListener(e -> {
                    if (btnAtual.getText().equals("")) {
                        btnAtual.setText(JogadoInicial);
                        contador++;

                        if (verificarVencedor()) {
                            JOptionPane.showMessageDialog(null, "venceu!!!");
                            reiniciar();
                        } else {
                            if (contador == 9) {
                                JOptionPane.showMessageDialog(null, "Empate!");
                                reiniciar();
                            } else {
                                JogadoInicial = (JogadoInicial.equals("X")) ? "O" : "X";
                            }
                        }

                    }
                });
            }
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public boolean verificarVencedor() {
        String b00 = button[0][0].getText();
        String b01 = button[0][1].getText();
        String b02 = button[0][2].getText();

        String b10 = button[1][0].getText();
        String b11 = button[1][1].getText();
        String b12 = button[1][2].getText();

        String b20 = button[2][0].getText();
        String b21 = button[2][1].getText();
        String b22 = button[2][2].getText();

        //Linhas
        if ((!b00.equals("") && b00.equals(b01) && b00.equals(b02))
                || (!b10.equals("") && b10.equals(b11) && b00.equals(b12))
                || (!b20.equals("") && b20.equals(b21) && b00.equals(b22))) {
            return true;
        } // Coluna
        else if ((!b00.equals("") && b00.equals(b00) && b00.equals(b20))
                || (!b01.equals("") && b01.equals(b11) && b00.equals(b12))
                || (!b02.equals("") && b02.equals(b21) && b02.equals(b22))) {
            return true;
        } //Diagonal
        else if ((!b00.equals("") && b00.equals(b00) && b00.equals(b02))
                || (!b02.equals("") && b02.equals(b11) && b00.equals(b02))) {
            return true;
        }

        return false;
    }

    public void reiniciar() {
        for (int i = 0; 1 < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[i][j].setText("");
                contador = 0;
                JogadoInicial = "X";
            }
        }
    }
}

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] opcoes = {
                "Escolha 1",
                "Escolha 2",
                "Escolha 3",
        };

        ImageIcon image = new ImageIcon("./src/Teste.png");

        String input = (String) JOptionPane.showInputDialog(
                null,
                "Opções",
                "Escolha uma opção",
                JOptionPane.PLAIN_MESSAGE,
                image,
                opcoes,
                opcoes[0]
        );

            JOptionPane.showMessageDialog(
                    null,
                    input,
                    "ADS",
                    JOptionPane.INFORMATION_MESSAGE
            );
    }
}
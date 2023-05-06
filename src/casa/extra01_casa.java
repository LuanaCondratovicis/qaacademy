package casa;
//ler e exebir uma palavra

import javax.swing.JOptionPane;

public class extra01_casa{
    public static void main(String[] args) {
        String animal = JOptionPane.showInputDialog("Qual seu animal favorito?");
        String pergunta = JOptionPane.showInputDialog("Quantos animais de estimação você possui?");
        System.out.println("O animal favorito do usuário é: " +animal);
        System.out.println("O usuário possui: " +pergunta+ " animais de estimação");
    }
}

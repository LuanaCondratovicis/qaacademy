import javax.swing.JOptionPane;

public class exercicio03_easy {
    //Faça um algoritmo para ler dois valores, armazenar em variáveis, e exibir os valores das variáveis, trocados.
    public static void main(String[] args) {
        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor:");
       String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor:");
       String auxiliar = "";
       auxiliar = primeiroValor;
       primeiroValor = segundoValor;
segundoValor = auxiliar;
System.out.println("O primeiro valor digitado foi:" +primeiroValor);
System.out.println("O segundo valor digitado foi:" +segundoValor);
    }
}

import javax.swing.JOptionPane;

public class exercecicio06_easy {

    //Faça um algoritmo para ler duas notas, calcular a média. 
    //E SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5 exibir exame.
        public static void main(String[] args) {
            double nota1, nota2, resultado;
            String nota1Stg, nota2Stg;
            nota1Stg = JOptionPane.showInputDialog("Por favor, digite a primeira nota: ");
            nota2Stg = JOptionPane.showInputDialog("Por favor, digite a segunda nota: ");
    
            nota1 = Double.parseDouble(nota1Stg);
            nota2 = Double.parseDouble(nota2Stg);
            resultado = (nota1 + nota2) / 2;
    
            if (resultado > 5) { // incio
                System.out.println("Você está Aprovado! Parabéns!!!");
            } // fim se
            if (resultado < 5) {// inicio se
                System.out.println("Você está Reprovado!");
            } // fim se
            if (resultado == 5) { // inicio IF
                System.out.println("Você está de Exame");
            } // fim if
        }// fim metodo
    
    }


    


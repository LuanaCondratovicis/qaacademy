public class Param{ 
    public static String mensagem(String mensagem01, String mensagem02){
        return mensagem01 + mensagem02; 
    }

    public static void main(String[] args){
        String mensagem01 = "Luana";
        String mensagem02 = "Santos";
        System.out.println(mensagem(mensagem01, mensagem02));
    }
}


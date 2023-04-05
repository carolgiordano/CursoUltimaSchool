package Modulo1;

public class TempoAtv {
    public static void main(String args[]) {
        boolean noite = true;
        boolean chuva = false;
        String clima = "Nublado";
        int temperatura = 5;
        int sensacaoTermica = temperatura + 2;


        if(noite == true) {
            System.out.println("Está de noite.");
        } else {
            System.out.println("Está de dia.");
        }

        System.out.println("A temperatura é de "
                +temperatura+ " graus Celsius e a sensação termica é de "
                +sensacaoTermica+ " graus Celsius.");

        if(chuva == true) {
            System.out.println("Está chovendo.");
        } else {
            System.out.println("Não está chovendo.");
        }

        System.out.println("O clima está " +clima+ ".");
    }


}

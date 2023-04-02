public class Tempo {
    public static void main(String args[]) {
        boolean noite = true;
        boolean chuva = false;
        int ano = 2022;
        int tempo = 10;
        int resultado = 0;

        if(noite == true) {
            resultado = ano + tempo;
            System.out.println("Em " + resultado + " está uma noite muito fria.\n");
        } else {
            resultado = ano - tempo;
            System.out.println("Em " + resultado + " está de dia e faz calor.\n");
        }

        if(chuva == true) {
            resultado = ano + tempo;
            System.out.println("Em " + resultado + " está chovendo.\n");
        } else {
            resultado = ano - tempo;
            System.out.println("Em " + resultado + " não está chovendo.\n");
        }
    }
}

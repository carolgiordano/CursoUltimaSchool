package Modulo1;

public class RadarDeTransito {
    public static void main(String[] args) {

        double velocidadeVeiculo = 60;
        double velocidadeMaxima = 70;

        double velocidadeMaxPermitida = velocidadeMaxima + (velocidadeMaxima * 0.1);

        if (velocidadeVeiculo > velocidadeMaxPermitida) {
            System.out.println("Voce será multado");
        } else {
            if (velocidadeVeiculo > velocidadeMaxima){
                System.out.println("Voce está quase atingindo a velocidade maxima");
            }else {
                System.out.println("Voce está dentro do limite de velocidade!");
            }
        }
    }


}

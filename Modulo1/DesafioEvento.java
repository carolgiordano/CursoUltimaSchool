package Modulo1;

public class DesafioEvento {
    public static void main(String[] args) {

        double horaEvento = 18.5;
        double horaClienteAtrasdo = horaEvento + 0.5;
        double horaClienteAdiantado = horaEvento - 0.5;

        double horaChegada = 19.01;

        if (horaChegada > horaClienteAtrasdo) {
            System.out.println("Você está atrasado, desculpe, " +
                    "não será possível entrar no evento!");
        } else if (horaChegada < horaClienteAdiantado) {
            System.out.println("O evento ainda não foi liberado, " +
                    "gentileza aguardar o horário de entrada!");
        } else {
            System.out.println("Pode entrar, seja bem vindo!");

        }
    }
}

package Modulo1;

public class ExemploWhile {
    public static void main(String[] args) {
        int valor = 5;
        int numero = 0;
        while (numero != 10) {
            // enquanto a variável não for 10, o código será repetido
            System.out.println("Número informado: " + valor);
            numero = valor;
            if (numero == 10) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou :(");
            }
            valor++;
        }
    }
}

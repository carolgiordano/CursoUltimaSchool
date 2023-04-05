public class DesafioBagagem {
    public static void main(String[] args) {

        char bagagemMao = 'M';
        char bagagemPortão = 'P';
        double pesoMao = 10.0;
        double pesoPortao = 23.0;
        boolean limiteBagagem = false;

        if (bagagemMao == 'M'){
            limiteBagagem = ( pesoMao <=10.0);
        } else if (bagagemPortão == 'P'){
            limiteBagagem = (pesoPortao <= 23.0);
        }

        if (limiteBagagem){
            System.out.println("Sua bagagem está dentro do limite");
        } else {
            System.out.println("O peso da sua bagagem passou " +
                    "do limite permitido");
        }
    }
}

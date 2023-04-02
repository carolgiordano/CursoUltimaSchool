public class principal {

    public static class escola {
        private static String nome  = "" ; // atributo
        private escola(String nomeEscola){
            this.nome = nomeEscola;
        }

        //metodos
        public static String getNome () {return nome ; }
        public static void setNome (String n) { nome = n; }

    }

    //classes
    public static class departamento {
        private static String nome = ""; //atributo
        private departamento (String nomeDepto) {
            this.nome = nomeDepto;
        }
        //metodos
        public static String getNome () { return nome ; }
        public static void setNome (String n) {nome = n ; }
    }

    //metodos
    public static void main(String[] args) {
        escola.setNome("Ultima School");
        departamento.setNome("Financeiro");

        //funcões
        System.out.println("O departamento " +
                departamento.getNome() + "da escola " +
                escola.getNome() + " está aberto.");

    }
}

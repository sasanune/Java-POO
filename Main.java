//Classe principal
//Objetos do tipo Pessoa e Atleta

public  class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Sabrina", 65, 1.55);
        Pessoa pessoa2 = new Pessoa("Lucas", 70, 1.70);

       
        Atleta atleta1 = new Atleta("Maria",  75, 1.70, "Volei");
        Atleta atleta2 = new Atleta("Augusto",  80, 1.80, "Luta");

        Pessoa[] pessoas = { pessoa1, pessoa2, atleta1, atleta2 };

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
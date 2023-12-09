public class Main {

    public static void main(String[] args) {


        Exercito jogo = new Exercito();

        // Criar heróis e bestas
        Heroi elfo = new Elfo("Elfo", 100, 20);
        Heroi hobbit = new Hobbit("Hobbit", 80, 15);
        Besta orque = new Orque("Orque", 120, 25);
        Besta troll = new Troll("Troll", 150, 30);

        // Adicionar heróis e bestas ao exército
        jogo.adicionarHeroi(elfo);
        jogo.adicionarHeroi(hobbit);
        jogo.adicionarBesta(orque);
        jogo.adicionarBesta(troll);

        // Iniciar a batalha
        jogo.batalhar();
    }
    }



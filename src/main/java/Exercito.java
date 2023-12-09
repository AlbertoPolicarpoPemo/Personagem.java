import java.util.ArrayList;
import java.util.List;

public class Exercito {


    public Personagem[] adicionarBesta;
    public Personagem[] adicionarHeroi;
    private List<Personagem> exercitoHerois;
    private List<Personagem> exercitoBestas;

    public Exercito() {
        exercitoHerois = new ArrayList<>();
        exercitoBestas = new ArrayList<>();
    }

    public void adicionarHeroi(Personagem heroi) {
        exercitoHerois.add(heroi);
    }

    public void adicionarBesta(Personagem besta) {
        exercitoBestas.add(besta);
    }

    public String batalhar() {
        int turno = 1;

        while (!exercitoHerois.isEmpty() && !exercitoBestas.isEmpty()) {
            System.out.println("----- Turno " + turno + " -----");

            Personagem heroi = exercitoHerois.get(0);
            Personagem besta = exercitoBestas.get(0);

            System.out.println("Herói: " + heroi.nome + " vs Besta: " + besta.nome);

            int potenciaOfensivaHeroi = heroi.calcularPotenciaOfensiva();
            int potenciaOfensivaBesta = besta.calcularPotenciaOfensiva();

            System.out.println("Potência Ofensiva Herói: " + potenciaOfensivaHeroi);
            System.out.println("Potência Ofensiva Besta: " + potenciaOfensivaBesta);

            int danoHeroi = besta.calcularDano(potenciaOfensivaHeroi);
            int danoBesta = heroi.calcularDano(potenciaOfensivaBesta);

            System.out.println("Dano causado pelo Herói: " + danoHeroi);
            System.out.println("Dano causado pela Besta: " + danoBesta);

            heroi.receberDano(danoBesta);
            besta.receberDano(danoHeroi);

            System.out.println("Pontos de Vida do Herói: " + heroi.pontosDeVida);
            System.out.println("Pontos de Vida da Besta: " + besta.pontosDeVida);

            if (!heroi.estaVivo()) {
                exercitoHerois.remove(heroi);
                System.out.println("Herói " + heroi.nome + " foi derrotado.");
            }

            if (!besta.estaVivo()) {
                exercitoBestas.remove(besta);
                System.out.println("Besta " + besta.nome + " foi derrotada.");
            }

            turno++;
            System.out.println();
        }

        System.out.println("----- Fim da Batalha -----");

        if (exercitoHerois.isEmpty()) {
            System.out.println("As Bestas venceram a batalha!");
        } else if (exercitoBestas.isEmpty()) {
            System.out.println("Os Heróis venceram a batalha!");
        }
        return null;
    }
}
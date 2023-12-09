import java.util.Random;

 abstract class Besta extends Personagem {
     public Besta(String nome, int pontosDeVida, int nivelArmadura) {
         super(nome, pontosDeVida, nivelArmadura);
     }


     @Override
     public int calcularPotenciaOfensiva() {
         return new Random().nextInt(91);
     }
 }
class Orque extends Besta {
    public Orque(String nome, int pontosDeVida, int nivelArmadura) {
        super(nome, pontosDeVida, nivelArmadura);
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
        nivelArmadura -= (int) (nivelArmadura * 0.1);
    }
}

class Troll extends Besta {
    public Troll(String nome, int pontosDeVida, int nivelArmadura) {
        super(nome, pontosDeVida, nivelArmadura);
    }
}


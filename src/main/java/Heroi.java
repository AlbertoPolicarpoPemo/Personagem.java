import java.util.Random;

public class Heroi extends Personagem {
    public Heroi(String nome, int pontosDeVida, int nivelArmadura) {
        super(nome, pontosDeVida, nivelArmadura);
    }

    @Override
    public int calcularPotenciaOfensiva() {
        int dado1 = new Random().nextInt(101);
        int dado2 = new Random().nextInt(101);
        return Math.max(dado1, dado2);
    }
}

class Elfo extends Heroi {
    public Elfo(String nome, int pontosDeVida, int nivelArmadura) {
        super(nome, pontosDeVida, nivelArmadura);
    }

    @Override
    public int calcularPotenciaOfensiva() {
        int potencia = super.calcularPotenciaOfensiva();
        if (nome.equals("Orque")) {
            potencia += 10;
        }
        return potencia;
    }
}

class Hobbit extends Heroi {
    public Hobbit(String nome, int pontosDeVida, int nivelArmadura) {
        super(nome, pontosDeVida, nivelArmadura);
    }

    @Override
    public int calcularPotenciaOfensiva() {
        int potencia = super.calcularPotenciaOfensiva();
        if (nome.equals("Troll")) {
            potencia -= 5;
        }
        return potencia;
    }
}

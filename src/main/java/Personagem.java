public class Personagem {

    public Object nivelDeArmadura;
    protected String nome;
    protected int pontosDeVida;
    protected int nivelArmadura;

    public Personagem(String nome, int pontosDeVida, int nivelArmadura) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.nivelArmadura = nivelArmadura;
    }

    public boolean estaVivo() {

        return pontosDeVida > 0;
    }

    public void receberDano(int dano) {
        pontosDeVida -= dano;
        if (pontosDeVida < 0) {
            pontosDeVida = 0;
        }
    }

    public int calcularPotenciaOfensiva() {

        return 0;
    }

    public int calcularDano(int potenciaOfensivaAdversario) {
        int dano = 0;
        if (potenciaOfensivaAdversario > nivelArmadura) {
            dano = potenciaOfensivaAdversario - nivelArmadura;
        }
        return dano;
    }

}

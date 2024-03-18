package POO.Personagem;

public class App {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();
        // chamei um metodo atacar e passei como ARGUMENTO uma string "Hydra"
        heroi.atacar("Hydra", "Golpe Duplo");
        

    }
}

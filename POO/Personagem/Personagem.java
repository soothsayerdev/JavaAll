package POO.Personagem;

import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // void -> significa que nao esta retornando
    void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);

    }

    int causarDano(){
        Random gerador = new Random();
        // 0....19
        // nextInt():
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    // metodo que nao retorna nada e recebe um PARAMETRO alvo que é do tipo String
    void atacar(String alvo, String habilidade) {
        int danoCausado = causarDano();
        
        if (habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);

        }
        else{
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, forca);
        }

        System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
    }
}

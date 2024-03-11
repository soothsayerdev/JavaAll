public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela de 6.1, 256gb
        // Galaxy Note 20 Ultra, tela de 6.9, 256gb
        // Xiaomi Mi 11 Pro, tela de 6,81, 128gb
        // <tipo_variavel> nome_variavel = valor;

        // Declarando um objeto do tipo Celular => Instanciando um Objeto
        Celular celular_a = new Celular();
        celular_a.nome = "Iphone 12";
        celular_a.tamanho_tela = 6.1f;
        celular_a.espaco_armazenamento = 256;
        celular_a.sistema_operacional = "IOS";

        Celular celular_b = new Celular();
        celular_b.nome = "Galaxy Note 20 Ultra";
        celular_b.tamanho_tela = 6.9f; 
        celular_b.espaco_armazenamento = 256;
        celular_b.sistema_operacional = "Android";


        Celular celular_c;
        celular_c = new Celular();
        celular_c.nome = "Xiaomi Mi 11 Pro";
        celular_c.tamanho_tela = 6.81f;
        celular_c.espaco_armazenamento = 128;
        celular_c.sistema_operacional = "Android";

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celular_a.nome, celular_a.tamanho_tela, celular_a.espaco_armazenamento, celular_a.sistema_operacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celular_b.nome, celular_b.tamanho_tela, celular_b.espaco_armazenamento, celular_b.sistema_operacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celular_c.nome, celular_c.tamanho_tela, celular_c.espaco_armazenamento, celular_c.sistema_operacional);
        
    }
}

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaSimplesDesordenada<Data> l3 = new ListaEncadeadaSimplesDesordenada<Data>();

        Data natal = new Data((byte)25,(byte)12,(short)2024);
        l3.guardeNoInicio(natal);

        natal.setAno(2025);
    }
}
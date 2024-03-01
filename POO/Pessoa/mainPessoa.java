package POO.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class mainPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Pessoa pessoa = new Pessoa();

        String name = scanner.next();
        int age = scanner.nextInt();
        float weight = scanner.nextFloat();
        float high = scanner.nextFloat();

        pessoa.setName(name);
        pessoa.setAge(age);
        pessoa.setWeight(weight);
        pessoa.setHigh(high);

        System.out.println(pessoa.toString());
    }
}

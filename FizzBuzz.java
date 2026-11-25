import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        int n = entrada.nextInt();

        for (int numero = 1; numero <= n; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numero);
            }
        }

        entrada.close();
    }
}

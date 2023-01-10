import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro maior que 0 : ");
            int number = scanner.nextInt();
            if (number < 1) {
                throw new InputMismatchException();
            }
            System.out.println("------------------------------");
            System.out.println("Pirâmide de " + number);
            System.out.println("------------------------------");
            for (int i = 1; i <= number; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
            System.out.println("------------------------------");
        } catch (InputMismatchException e) {
            System.out.println("Número inválido =/");
        } catch (Exception e) {
            System.out.println("Erro não detectado... oO");
        } finally {
            scanner.close();
        }
    }
}

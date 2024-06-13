import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            if (numero1 >= numero2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = numero1; i <= numero2; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (NumberFormatException e) {
            System.err.println("Erro: Os parâmetros devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

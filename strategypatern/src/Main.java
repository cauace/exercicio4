import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        int choice = scanner.nextInt();
        System.out.print("Digite o valor da transação: ");
        double amount = scanner.nextDouble();
        PaymentStrategy strategy = switch (choice) {
            case 1 -> new PixPayment();
            case 2 -> new CreditCardPayment();
            case 3 -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Opção inválida");
        };
        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.executePayment(amount);
    }
    }


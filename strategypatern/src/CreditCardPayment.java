import java.util.Scanner;

public class CreditCardPayment  implements  PaymentStrategy{
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento de R$" + amount + " via Cartão de Crédito realizado com sucesso.");
    }
}

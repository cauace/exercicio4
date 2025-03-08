import java.util.Random;

public class BoletoPayment  implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Pagamento via Boleto gerado.");
        System.out.println("Código do Boleto: " + new Random().nextInt(99999999));
    }
}

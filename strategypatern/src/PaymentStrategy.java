import java.util.Random;

public interface PaymentStrategy {
    void processPayment(double amount);
}

class PixPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Pagamento via Pix realizado com sucesso.");
        System.out.println("Código Pix: " + new Random().nextInt(999999));
    }
}

// Target Interface
interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " processed through PayPal.");
    }
}
class StripeGateway {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " processed through Stripe.");
    }
}
// Adapter Classes
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal = new PayPalGateway();

    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}

class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe = new StripeGateway();

    public void processPayment(double amount) {
        stripe.pay(amount);
    }
}

// Test Class
public class AdapterPatternExample {
    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(1000);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(2000);
    }
}
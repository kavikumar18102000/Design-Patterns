package SOLIDPrinciples.OCP;

/*abstract class Payment{
    abstract void pay();
}*/

/*Prefer Interface, if the implementation only need to agree on behaviour such as pay(), an interface is often a better
starting point.*/
interface Payment{
    void pay();
}

class UPIPayment implements Payment{
    private final double amount;
    public UPIPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Processing UPI payment for amount: " + amount);
    }
}

class CardPayment implements Payment{
    private final double amount;

    CardPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Processing Card payment for amount: " + amount);
    }
}

class PAYPALPayment implements Payment{
    private final double amount;

    PAYPALPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Processing PAYPAL payment for amount: "+amount);
    }
}

public class PaymentService {
    private Payment payment;
    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void processPayment(){
        this.payment.pay();
    }

    static void main() {
        PaymentService paymentService = new PaymentService(new UPIPayment(10000));
        paymentService.processPayment();
    }

}

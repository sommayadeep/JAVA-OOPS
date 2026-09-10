class Payment{
    void pay(double amount){
        System.out.println("payment of rs:" + amount);
    }
}
class CreditCardpayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("payment method: Credit Card");
        System.out.println("payment of rs:" + amount);
    }
}

class UPIpayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("payment method: UPI");
        System.out.println("payment of rs:" + amount);
    }
}

public class paymentdemo {
    public static void main (String[] args){
        Payment payment;

        payment = new CreditCardpayment();
        payment.pay(500);

        payment = new UPIpayment();
        payment.pay(500);

    }

}

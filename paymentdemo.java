class Payment{
    void pay(double amount){
        System.out.println("payment of rs:" + amount);
    }
}
class CreditCardpayment{
    void pay(double amount){
        System.out.println("payment method: Credit Card");
        System.out.println("payment of rs:" + amount);
    }
}
class UPIpayment{
    void pay(double amount){
        System.out.println("payment method: UPI");
        System.out.println("payment of rs:" + amount);
    }
}
public class paymentdemo {
    public static void main (String[] args){
    Payment payment;
    payemnt = new CreditCardpayment();
    payemnt.pay(500);

    payemnt = new UPIpayment();
    payemnt.pay(500);

    }

}

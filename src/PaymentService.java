interface internalpayment{
    void pay(double amount);
}
class thirdparty{

    public void thirdpartypay(double amount) {
        System.out.println("Thirdparty of $" + amount);
    }
}
class thirdpartypayment implements internalpayment {
    private thirdparty ip;

    public thirdpartypayment(thirdparty ip) {
        this.ip = ip;
    }

    @Override
    public void pay(double amount) {
        ip.thirdpartypay(amount);
    }

}
interface security{
    void securepay();
}
class paymentsv implements security{
    public void securepay() {
        thirdparty tp=new thirdparty();
        internalpayment internal=new thirdpartypayment(tp);
        internal.pay(100.0);
    }
}
class dummypay implements security{
    private boolean token;
    public dummypay(boolean token) {
        this.token = token;
    }
    public void securepay() {
        if(token){
            paymentsv ps=new paymentsv();
            ps.securepay();
        }
        else{
            System.out.println("Payment failed due to invalid token.");
        }
    }
}

public class PaymentService {
    public static void main(String[] args) {
        security paymentService = new dummypay(false); // Change to false to simulate invalid token
        paymentService.securepay();

    }
}

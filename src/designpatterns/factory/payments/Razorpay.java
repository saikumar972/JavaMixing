package designpatterns.factory.payments;

public class Razorpay implements Payment{
    @Override
    public String transactionAmount(double amount) {
        return "razorpay amount is "+amount;
    }
}

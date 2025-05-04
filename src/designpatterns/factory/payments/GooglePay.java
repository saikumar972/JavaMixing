package designpatterns.factory.payments;

public class GooglePay implements Payment{

    @Override
    public String transactionAmount(double amount) {
        return "Google pay amount is "+amount;
    }
}

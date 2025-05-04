package designpatterns.factory.payments;

public class Phonepe implements Payment{
    @Override
    public String transactionAmount(double amount) {
        return "phonepe amount is "+amount;
    }
}

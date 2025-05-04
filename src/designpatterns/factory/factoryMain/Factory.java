package designpatterns.factory.factoryMain;

import designpatterns.factory.Factoryy.FactoryImpl;
import designpatterns.factory.payments.Payment;

public class Factory {
    public static void main(String[] args) {
        Payment paymentmode= FactoryImpl.getPayment("phonePe");
        System.out.println(paymentmode.transactionAmount(6969));
    }
}

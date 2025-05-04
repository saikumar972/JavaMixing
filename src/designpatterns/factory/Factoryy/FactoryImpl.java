package designpatterns.factory.Factoryy;

import designpatterns.factory.payments.GooglePay;
import designpatterns.factory.payments.Payment;
import designpatterns.factory.payments.Phonepe;
import designpatterns.factory.payments.Razorpay;

public class FactoryImpl {
   public static Payment getPayment(String payment){
       return switch (payment.toLowerCase()) {
           case "googlepay" -> new GooglePay();
           case "phonepe" -> new Phonepe();
           case "razorpay" -> new Razorpay();
           default -> null;
       };
   }
}

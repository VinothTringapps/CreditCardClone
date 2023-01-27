package org.example;

import java.util.*;
import java.util.logging.Logger;
//" 3. Design a class for a basic credit card. The class should have the following features:
//    - Instance variables for the cardholder's name, card number, and expiration date.
//  - A constructor that allows the user to create a credit card with a given name, card number, and
//  expiration date.
//- An equals method that returns true if the given object is a credit card with the same card number, and
// false otherwise.
// - A clone method that creates and returns a new credit card with the same name, card number,
//        and expiration date as the original credit card."
public class BasicCreditCard implements Cloneable {
    String cardHolderName;
    String cardNumber;
    String expiryDate;
    BasicCreditCard(String name,String cardNumber,String expiryDate){
        this.cardHolderName=name;
        this.cardNumber=cardNumber;
        this.expiryDate=expiryDate;
    }
    public boolean checkEqual(BasicCreditCard verify){
        return this.cardNumber.equalsIgnoreCase(verify.cardHolderName);
    }


    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        Logger l=Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        l.info("Enter the  Card Holder Name :");
         String name=sc.nextLine();
        l.info("Enter the Card Number :");
        String cardNumber=sc.nextLine();
        l.info("Enter the Expiry Date :");
        String expiryDate=sc.nextLine();
        BasicCreditCard b=new BasicCreditCard(name,cardNumber,expiryDate);
        BasicCreditCard b2=(BasicCreditCard) b.clone();
        l.info("Enter the Card holder Name :");
        String name2=sc.nextLine();
        l.info("Enter the Card Number :");
        String cardNumber2=sc.nextLine();
        l.info("Enter the Expiry Dated :");
        String expiryDate2=sc.nextLine();
        BasicCreditCard b3=new BasicCreditCard(name2,cardNumber2,expiryDate2);
        String s="Details are Equal : "+b2.checkEqual(b3);
        l.info(s);


    }
}
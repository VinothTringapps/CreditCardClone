package org.example;

import java.util.*;
import java.util.logging.*;

public class CloneMain {
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

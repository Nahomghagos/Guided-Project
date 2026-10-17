package com.pluralsight;

import java.net.SocketTimeoutException;
import java.security.KeyStore;

public class MovieTicketKiosk {
    public static void main(String[] args) {
        System.out.println("wlecome to the movie ticket kiosk");
         String customerName;
         customerName= "maya";

         int ticketCount;
         ticketCount= 3;

         boolean isMember;
         isMember= true;

         String dayOfTheWeek;
         dayOfTheWeek= "thursday";

         int age;
         age= 34;

         double baseLinePrice;
         baseLinePrice= 12.00;

         double discountPrice;
         discountPrice = 3.00;

         final double MINMUM_PRICE;
         MINMUM_PRICE= 1.50;

        System.out.println("costomer " + customerName);
        System.out.println("age "+ age);
        System.out.println("day of the week " + dayOfTheWeek);
        System.out.println("is a member " + isMember);
        System.out.println("Price " + baseLinePrice);
        System.out.println("discountPrice " + discountPrice);
        System.out.println("Final price " + MINMUM_PRICE);
    }
}

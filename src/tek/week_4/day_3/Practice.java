package tek.week_4.day_3;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double originalPrice;
        boolean isMember = false;
        double finalValue = 0;
        int userselction;
        System.out.println("what is orginalprice");
        originalPrice = scanner.nextDouble();

        System.out.println("-----------------------------------------");


        if(isMember){
            System.out.println("yes i am member of" +
                    " this store and your final item price is " +
                    " " + (finalValue =originalPrice-(originalPrice*0.4)));

        }
        else {
            System.out.println("Unfortunately! i am not member of this store");
            System.out.println("Your are not the member of this store and your final item price is  "
                    + originalPrice);
        }

//      finalValue = ( isMember ) ? originalPrice - (originalPrice * 0.4) : originalPrice; // 40% discount


        System.out.println("----------------d");

    }
}

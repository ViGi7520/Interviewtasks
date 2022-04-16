import java.util.Scanner;

public class Quarterly_interest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        // fixed variables
        double rate = 4.5;
        double time = 1;

        double interest = (principal * time * rate) / 100;  // annual interest
        double quarterly_interest = interest/4;             // quarterly interest

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Annual Interest: " + interest);
        System.out.println("Quarterly Interest: "+ quarterly_interest);

        input.close();
    }
}


import java.time.LocalDate;
import java.util.Scanner;

public class Electric_bill {
    public static void main(String[] args) {
        int amt = 100;                       //Original Amount is 100
        int famt;

        Scanner date = new Scanner(System.in);

        System.out.println("Welcome to bill Payment");
        System.out.println("Enter Today's date: ");
        String p = date.next();                        //input date
        LocalDate payday = LocalDate.parse(p);
        int pdate = payday.getDayOfMonth();
        int fdigit= pdate/10, ldigit= pdate%10;
        int interestF=0, interestL=0;
        float interest, penalty;

        switch (fdigit) {               //to calculate interest from date(DD) first digit
            case 1:
                interestF =0;
                break;
            case 2:
                interestF = 10;
                break;
            case 3:
                interestF = 20;
                break;
        }
        //System.out.println(interestF);

        switch (ldigit) {              //to calculate interest from date(DD) last digit
            case 1:
                interestL = 1;
                break;
            case 2:
                interestL = 2;
                break;
            case 3:
                interestL = 3;
                break;
            case 4:
                interestL = 4;
                break;
            case 5:
                interestL = 5;
                break;
            case 6:
                interestL = 6;
                break;
            case 7:
                interestL = 7;
                break;
            case 8:
                interestL = 8;
                break;
            case 9:
                interestL = 9;
                break;
        }
        //System.out.println(interestL);

        famt = amt;
        interest = interestF + interestL;           //calculation of Interest
        interest = interest/100;

        //System.out.println(interest);

        if (pdate <= 10) {
            System.out.println("Amount to be paid= " + amt + " (NO PENALTY)");
        }
        else {
            famt += famt * interest;
            penalty = famt - amt;
            System.out.println("Amount to be paid= " + famt + " (PENALTY= " + penalty + ")");
        }
    }
}

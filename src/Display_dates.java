import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display_dates{
        public static void main(String[] args) {
            Scanner date = new Scanner(System.in);

            System.out.println("Enter Start date (yyyy-mm-dd):- ");   // Input
            String s = date.next();
            System.out.println("Enter End date (yyyy-mm-dd):- ");
            String e = date.next();
            LocalDate start = LocalDate.parse(s);
            LocalDate end = LocalDate.parse(e);
            List<LocalDate> totalDatesM = new ArrayList<>();
            List<LocalDate> totalDatesT = new ArrayList<>();
            List<LocalDate> totalDatesF = new ArrayList<>();

            int daysToAdvance = 1;

            LocalDate nextDay = start;
            while (!nextDay.isAfter(end)) {

                // Monday
                if (nextDay.getDayOfWeek() == DayOfWeek.MONDAY) {
                    totalDatesM.add(nextDay);
                }

                // Thursday
                else if (nextDay.getDayOfWeek() == DayOfWeek.THURSDAY) {
                    totalDatesT.add(nextDay);
                }

                //Friday
                else if (nextDay.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    totalDatesF.add(nextDay);
                }
                nextDay = nextDay.plusDays(daysToAdvance);
            }
            System.out.println();
            System.out.println("MONDAY: \n"+ totalDatesM);      // Output
            System.out.println("THURSDAY: \n"+ totalDatesT);
            System.out.println("FRIDAY: \n"+ totalDatesF);

            date.close();
        }
    }

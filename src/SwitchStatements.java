import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int daysInAMonth = 0;
        String day30months = "April, June, September, November";
        String day31months = "January, March, May, July, August, October, December";
        String february = "February";

        System.out.print("Enter the exact number of days in a month: ");
        daysInAMonth = input.nextInt();

        switch (daysInAMonth) {
            case 30:
                System.out.println(day30months);
                break;
            case 31:
                System.out.println(day31months);
                break;
            case 28:
            case 29:
                System.out.println(february);
                break;
            default:
                System.out.println("No month has exactly that number of days");
        }
    }
}

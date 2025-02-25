import java.util.Scanner;

public class WeekPlanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {

        String[][] weekDays = new String[7][2];
        String day;

        fillTheDays(weekDays);


    }

    private static void fillTheDays(String[][] weekDays) {
        weekDays[0][0] = "Monday";
        weekDays[0][1] = "Go To Work; Go To Cinema";
        weekDays[1][0] = "Tuesday";
        weekDays[1][1] = "Hang Out With Cute GirlFriend";
        weekDays[2][0] = "Wednesday";
        weekDays[2][1] = "Go To Bank; Go To Gym";
        weekDays[3][0] = "Thursday";
        weekDays[3][1] = "Go To Family Dinner; Read A Book";
        weekDays[4][0] = "Friday";
        weekDays[4][1] = "Make A Plan For Weekend; Go To Party";
        weekDays[5][0] = "Saturday";
        weekDays[5][1] = "Do Whatever You Want";
        weekDays[6][0] = "Sunday";
        weekDays[6][1] = "Hang Out With Friends; Go To Park";
    }

}
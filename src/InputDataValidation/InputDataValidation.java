package InputDataValidation;

import static ConsoleRead.ReadN.readInt;

public class InputDataValidation {
    public static void main(String[] args) {

        System.out.println(printTime());

    }

    public static boolean checkTime(int hh, int mm) {
        return ((hh >= 0) && (hh <= 23)) && ((mm >= 0) && (mm <= 59));
    }

    public static String printTime() {
        System.out.print("Ora este: ");
        int hour = readInt();
        System.out.print("Minutul este: ");
        int minute = readInt();
        if (checkTime(hour,minute)) {
            return "The time is " + hour + ":" + minute + " now";
        }
        else{
            System.out.print("Try again: ");
            return printTime();
        }
    }
}

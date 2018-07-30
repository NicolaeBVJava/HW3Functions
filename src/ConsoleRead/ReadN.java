package ConsoleRead;

import java.util.Scanner;

public class ReadN {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args){
        System.out.println("Numarul este: ");
        readInt();
    }

    public static int readInt() {
        if (!sc.hasNextInt()) {
            System.out.print("Retry: ");
            sc.nextLine();
            return readInt();
        } else {
            return sc.nextInt();
        }
    }

    public static int readIntGreaterThanZero() {
        int number;
        if ((number = readInt()) > 0) {
            return number;
        } else {
            System.out.print("Write an integer greater than 0: ");
            return readIntGreaterThanZero();
        }
    }

    public static double readDouble() {
        if (!sc.hasNextDouble()) {
            System.out.print("Retry: ");
            sc.nextLine();
            return readDouble();
        } else {
            return sc.nextDouble();
        }
    }
}

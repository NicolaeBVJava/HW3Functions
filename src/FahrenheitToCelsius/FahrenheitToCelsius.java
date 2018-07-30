package FahrenheitToCelsius;

import static ConsoleRead.ReadN.readDouble;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        System.out.print("Input your Fahrenheit degrees body temperature: ");
        System.out.println(bodyTempCelsiusD(readDouble()));
    }
    //this method transforms Fahrenheit degrees to Celsius degrees
    public static double fahrenheitToCelsius(double fahrenheitDegrees) {
        return ((fahrenheitDegrees - 32) * 5 / 9);

    }
    //this method outputs in Celsius Degrees a body temperature measured in Fahrenheit degrees
    public static String bodyTempCelsiusD(double fahrenheitDegrees) {
        double celsiusDegrees;
        celsiusDegrees = fahrenheitToCelsius(fahrenheitDegrees);
        if ((celsiusDegrees >= 36) && (celsiusDegrees <= 43)) {
            if (celsiusDegrees > 37) {
                return "Your body temperature is " + celsiusDegrees + ". You are ill";
            } else {
                return "Your body temperature is " + celsiusDegrees + ".";
            }

        } else {
            System.out.print("ït is impossible. Retry: ");
            return  bodyTempCelsiusD(readDouble());
        }
    }
}
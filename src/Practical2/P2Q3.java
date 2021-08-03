package Practical2;

public class P2Q3 {
    public static void main(String args[]) {
        double i;
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Inches", "Centimeters", "Centimeters", "Inches");
        for (i = 1; i <= 10; i++) {
            System.out.printf("%-15.2f %-15.2f %-15.2f %-15.4f\n", i, UnitConverter.inchToCentimeter(i), i * 5,
                    UnitConverter.centimeterToInch(i * 5));
        }
    }

    public class UnitConverter {
        /** Converts from inches to centimeters */
        public static double inchToCentimeter(double in) {
            double centimeters;
            centimeters = in * 2.54;
            return centimeters;
        }

        /** Converts from centimeters to inches */
        public static double centimeterToInch(double cm) {
            double inches;
            inches = cm / 2.54;
            return inches;
        }
    }
}

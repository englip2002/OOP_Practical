package Practical2;


public class T2Q5 {
    public static void main(String[] args) {
        final int NO_OF_NUM = 20;
        double randNum = 0;
        double totalX = 0;
        double totalXSquare = 0;
        double variance;

        for (int i = 0; i < NO_OF_NUM; i++) {
            randNum = (Math.random() * 101);
            System.out.printf("%f,", randNum);
            totalXSquare += Math.pow(randNum, 2);
            totalX += randNum;
        }
        System.out.println(totalXSquare);
        System.out.println(totalX);

        variance = (totalXSquare - (Math.pow(totalX, 2) / NO_OF_NUM)) / (NO_OF_NUM - 1);
        System.out.println(Math.sqrt(variance));

    }
}


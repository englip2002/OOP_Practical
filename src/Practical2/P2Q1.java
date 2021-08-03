package Practical2;

public class P2Q1 {
    public static void main(String[] args){
        System.out.printf("%10s %10s\n","Number","Squareroot");
        int i;
        for (i = 0; i < 21; i=i+2) {
            System.out.printf("%-10d %-10.4f\n",i, Math.sqrt(i));
        }
    }
}

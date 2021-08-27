package Practical7.P7Q3;

import Practical7.P7Q1.Comparable;

public class ComparableCircle extends Circle implements Colorable,Comparable {
    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(){}
    @Override
    public int compareTo(Object obj) {
        if (radius < ((Circle) obj).radius)
            return -1;
        else if (radius == ((Circle) obj).radius)
            return 0;
        else
            return 1;
    }

    @Override
    public void howToColor() {
        System.out.println("Crayon");
    }
}

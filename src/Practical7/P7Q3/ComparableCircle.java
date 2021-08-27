package Practical7.P7Q3;

import Practical7.P7Q1.Comparable;

public class ComparableCircle extends Circle implements Comparable, Colorable{
    
    @Override
    public boolean compareTo(Object obj){
        if(obj instanceof Circle){
            //if( Circle.getRadius==((Circle) obj).getRadius)
                return true;
            //else
                //return false;
        }
        return false;
    }

    @Override
    public void howToColor(){

    }
}

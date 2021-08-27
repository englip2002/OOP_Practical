package Practical7.P7Q3;

public class P7Q3 {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(4);
        circles[1] = new ComparableCircle(1);
        circles[2] = new ComparableCircle(3);
        circles[3] = new ComparableCircle(2);

        for (int i = 0; i < circles.length; i++) {
            int largestIndex = i;  //assume largest radius index in 0
            for (int j = i + 1; j < circles.length; j++) {   //compare to index 1,2,3....
                if (circles[j].compareTo(circles[largestIndex]) > 0) {  //if current index is larger 
                    largestIndex = j;   //largest index = current index
                }
            }
            ComparableCircle temp = circles[largestIndex];
            circles[largestIndex] = circles[i];
            circles[i] = temp;
        }

        System.out.println("Largest Radius: "+circles[0].radius+" 2nd Large Radius: "+circles[2].radius);
    }
}

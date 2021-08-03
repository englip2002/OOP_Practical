package Practical4.Q5;

public class P4Q5 {
    public static void main(String[] args){
        Course course1=new Course("Introduction to Computers", 250);
        course1.addStudent("Ali Said");
        course1.addStudent("Wong Ken");
        course1.addStudent("Peter Lim");

        System.out.println(course1.toString());
        
        System.out.println("Total fee Collected: "+ course1.calcFeesCollected());
        System.out.println("Name of Student Enrolled:");
        for(int i=0;i<course1.getNoOfStudent();i++){
            System.out.println("\t\t\t"+course1.getStudentName()[i]);
        }
    }
}

package Practical4.Q4;

public class personalInfo {
    private String ICNo;
    private String name;

    personalInfo() {
    }

    personalInfo(String ICNo, String name) {
        this.ICNo = ICNo;
        this.name = name;
    }

    public String toString(){
        return String.format("%-15s %-10s",name,ICNo);
    }

}

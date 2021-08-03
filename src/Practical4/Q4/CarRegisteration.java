package Practical4.Q4;

public class CarRegisteration {
    private static int latestRegNo = 1001;
    private int regNo;
    private personalInfo personalInfo;
    private Car car;

    CarRegisteration() {
        this.regNo=latestRegNo;
        latestRegNo++;
    }

    CarRegisteration(personalInfo personalInfo, Car car) {
        this.personalInfo = personalInfo;
        this.car = car;
        this.regNo++;
    }

    CarRegisteration(String name, String ICNo, String plateNo, String colour, int year, CarType carType) {
        personalInfo = new personalInfo(ICNo, name);
        car = new Car(plateNo, colour, year, carType);
        this.regNo=latestRegNo;
        latestRegNo++;
    }

    public String toString() {
        return String.format("%-6d %-25s %-55s", regNo, personalInfo, car);
    }

}

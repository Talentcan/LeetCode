package Daily;

public class Q1603 {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }


}

class ParkingSystem{

    int bigcar [];
    int mediumcar[];
    int smallcar[];

    static int big;
    static int medium;
    static int small;
    public ParkingSystem (int big, int medium, int small) {
        bigcar = new int[big];
        mediumcar = new int[medium];
        smallcar = new int[small];
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int carType) {
        if (carType == 1){
            if (big == 0){
                return false;
            }
            else
                big--;
        }
        else if (carType == 2){
            if (medium == 0){
                return false;
            }
            else
                medium--;
        }
        else{
            if (small == 0){
                return false;
            }
            else
                small--;
        }

        return true;
    }
}
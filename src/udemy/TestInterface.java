package udemy;
class Bicycle{
    int gear,speed;
    Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBreak(int  decrement){
        speed-=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
    public String toString(){
        return ("No of gears : "+gear+"\n"+"Speed of bicycle : "+speed);
    }
}
class MountainBike extends Bicycle{
    int seatHeight;
    MountainBike(int gear,int speed,int seatHeight){
        super(gear,speed);
        this.seatHeight=seatHeight;
    }
    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }
    public String toString(){
       return (super.toString()+"\nSeat height : "+seatHeight);
    }
}
public class TestInterface {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike(5, 50, 8);
        System.out.println(bike.toString());
        bike.setSeatHeight(9);
        System.out.println("After applying break");
        bike.applyBreak(10);
        System.out.println(bike.toString());
        System.out.println("After speeding up");
        bike.speedUp(30);
        System.out.println(bike.toString());
    }
}
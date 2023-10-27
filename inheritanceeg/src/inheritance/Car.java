package inheritance;

public class Car extends Vehicle{
    public int numDoors;
    public void drive(){
        System.out.println("number of doors are:"+numDoors);
        System.out.println("The Car is in motion");
    }
}

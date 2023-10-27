package inheritance;

public class Test {
    public static void main(String[] args){
        Motorcycle m=new Motorcycle();
        m.make= "Honda";
        m.model= "CBR600RR";
        m.year= 2020;
        m.isSportsBike= false;
        m.start();
        m.wheelie();
        Car c = new Car();
        c.make= "Toyota";
        c.model= "Camry";
        c.year= 2020;
        c.numDoors= 4;
        c.start();
        c.drive();


    }
}

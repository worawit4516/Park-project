
import park.pkg2.*;
import park.pkg2.Vehicle.*;

public class test {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("A5", Vehicletype.car) {
        };
        Vehicle v2 = new Vehicle("A5", Vehicletype.car) {
        };
        Parkinglot p1 = new Parkinglot(5);
        VehicleForParking c1 = new VehicleForParking("Eart 4516", Vehicletype.car);
        VehicleForParking c2 = new VehicleForParking("Eart ", Vehicletype.car);

        p1.entryPoint(c1);
        System.out.println(c1);
         p1.exitPoint(c1);
        System.out.println(c1);
        p1.entryPoint(c2);
        System.out.println(c2);
        System.out.println(p1);
        System.out.println(c1.equals(c1));
        System.out.println(c1.equals(c2));
    }
}

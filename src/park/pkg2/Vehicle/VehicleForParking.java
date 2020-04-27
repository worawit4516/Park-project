package park.pkg2.Vehicle;

import park.pkg2.ParkingTicket;

public class VehicleForParking extends Vehicle {

    private ParkingTicket parkingTicket = new ParkingTicket();

    public VehicleForParking(String licenseNumber, Vehicletype type) {
        super(licenseNumber, type);

    }

    public void assignTicket() {
        this.parkingTicket = new ParkingTicket();
        parkingTicket.issuedAt();

    }

    public void returnTicket() {
        this.parkingTicket.payedAt();
    }

    @Override
    public String toString() {
        return super.toString() + parkingTicket.toString();
    }

}

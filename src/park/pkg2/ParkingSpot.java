package park.pkg2;

import park.pkg2.Vehicle.VehicleForParking;

class ParkingSpot {

    private String parkingSpotID;
    private boolean free;
    private VehicleForParking vehicle;

    public ParkingSpot(String parkingSpotID) {
        this.parkingSpotID = parkingSpotID;
        this.free = true;
    }

    public void assignVehicle(VehicleForParking vehicle) {
        this.vehicle = vehicle;
        free = false;

    }

    public boolean isFree() {
        return free;
    }

    public VehicleForParking getVehicle() {
        return vehicle;
    }

    public void removeVehicle() {
       this.vehicle=null;
       free = true;
    }

    @Override
    public String toString() {
      StringBuilder str = new  StringBuilder();
      str.append("ParkingSpot{" + "parkingSpotID=" + parkingSpotID + ", free=" + free + ")");
        if (free==false) {
            str.append(vehicle.toString());
        }
     return str.toString();
    }

}

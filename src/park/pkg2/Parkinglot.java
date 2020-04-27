package park.pkg2;

import park.pkg2.Vehicle.VehicleForParking;

public class Parkinglot {

    public int PARKING_RATE;
    private ParkingSpot[] parkingSpots;
    private int count;

    public Parkinglot(int max) {
        parkingSpots = new ParkingSpot[(max < 0 ? 0 : max)];
        createParkingSpot();
    }

    public void createParkingSpot() {
        for (int i = 0; i < parkingSpots.length; i++) {
            parkingSpots[i] = new ParkingSpot(i + 1 + "A"+"\n");
        }
    }

    public void entryPoint(VehicleForParking vehicle) {
        int getavailable = getAvailableParkingSpot();
        if (getavailable == -1) {
            System.out.println("No avaliable parkspot"+"\n");
        } else {
            vehicle.assignTicket();
            parkingSpots[getavailable].assignVehicle(vehicle);
            count++;
        }

    }

    public void exitPoint(VehicleForParking vehicle) {
        int found = searchVehicleInParkingSpot(vehicle);

        if (found == -1) {
            System.out.println("No vehicle "+"\n");
        }
        vehicle.returnTicket();
        parkingSpots[found].removeVehicle();
        count--;

    }

    public int searchVehicleInParkingSpot(VehicleForParking vehicle) {
        for (int i = 0; i < parkingSpots.length; i++) {
            parkingSpots[i].getVehicle().equals(vehicle);
            return i;
        }
        return -1;
    }

    public int getAvailableParkingSpot() {
        for (int i = 0; i < parkingSpots.length; i++) {
            if (parkingSpots[i].isFree()) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < parkingSpots.length; i++) {
            str.append(parkingSpots[i]+"\n");
        }
        str.append("\n"+"Free spot" + (parkingSpots.length - count));
        return str.toString();
    }
}

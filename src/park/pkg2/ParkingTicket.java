package park.pkg2;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;


public class ParkingTicket {

    private static int runningid;
    private String ticketID;
    private LocalDateTime entrytime;
    private LocalDateTime exittime;
    private double payedAmount;
    private ParkingTicketStatus parkingTicketStatus;

    public ParkingTicket() {

    }

    public void issuedAt() {
        entrytime = LocalDateTime.now();
        parkingTicketStatus = parkingTicketStatus.Active;
        ticketID = LocalTime.now() + " " + runningid;
    }

    public void payedAt() {
        exittime = LocalDateTime.now();
        parkingTicketStatus = parkingTicketStatus.Paid;
        calculateParkingHours();
    }

    public long calculateParkingHours() {

        long hour = (exittime.getHour() - entrytime.getHour());

        return hour * 20;

    }

    @Override
    public String toString() {
        return "ParkingTicket{" + "ticketID=" + ticketID + ", entrydatetime=" + entrytime + ", exittime=" + exittime + ", payedAmount=" + payedAmount + ", parkingTicketStatus=" + parkingTicketStatus + '}';
    }

}

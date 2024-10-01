package models;

import java.util.Date;

public class Booking {
    private String bcode;
    private String pcode;
    private Date odate;
    private int paid;
    private int seat;

    public Booking(String bcode, String pcode, Date odate, int paid, int seat) {
        this.bcode = bcode;
        this.pcode = pcode;
        this.odate = odate;
        this.paid = paid;
        this.seat = seat;
    }

    // Getters and setters
    public String getBcode() { return bcode; }
    public void setBcode(String bcode) { this.bcode = bcode; }
    
    // ... (other getters and setters)

    @Override
    public String toString() {
        return "Booking{" +
                "bcode='" + bcode + '\'' +
                ", pcode='" + pcode + '\'' +
                ", odate=" + odate +
                ", paid=" + paid +
                ", seat=" + seat +
                '}';
    }
}

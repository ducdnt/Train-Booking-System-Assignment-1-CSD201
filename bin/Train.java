package models;

public class Train {
    private String tcode;
    private String name;
    private String dstation;
    private String astation;
    private double dtime;
    private int seat;
    private int booked;
    private double atime;

    public Train(String tcode, String name, String dstation, String astation, 
                 double dtime, int seat, int booked, double atime) {
        this.tcode = tcode;
        this.name = name;
        this.dstation = dstation;
        this.astation = astation;
        this.dtime = dtime;
        this.seat = seat;
        this.booked = booked;
        this.atime = atime;
    }

    // Getters and setters
    public String getTcode() { return tcode; }
    public void setTcode(String tcode) { this.tcode = tcode; }
    
    // ... (other getters and setters)

    @Override
    public String toString() {
        return "Train{" +
                "tcode='" + tcode + '\'' +
                ", name='" + name + '\'' +
                ", dstation='" + dstation + '\'' +
                ", astation='" + astation + '\'' +
                ", dtime=" + dtime +
                ", seat=" + seat +
                ", booked=" + booked +
                ", atime=" + atime +
                '}';
    }
}

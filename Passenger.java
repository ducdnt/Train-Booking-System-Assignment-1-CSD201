package models;

public class Passenger {
    private String pcode;
    private String name;
    private String phone;

    public Passenger(String pcode, String name, String phone) {
        this.pcode = pcode;
        this.name = name;
        this.phone = phone;
    }

    // Getters and setters
    public String getPcode() { return pcode; }
    public void setPcode(String pcode) { this.pcode = pcode; }
    
    // ... (other getters and setters)

    @Override
    public String toString() {
        return "Passenger{" +
                "pcode='" + pcode + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

package greengates.charity.app;

public class Donor {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String taxNumber;
    private int donationsPerMonth;

    public Donor(String firstName, String lastName, String email, String address, String taxNumber, int donationsPerMonth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.taxNumber = taxNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String address() {
        return address;
    }
    public String getTaxNumber() {
        return taxNumber;
    }
    public int getDonationsPerMonth() {
        return donationsPerMonth;
    }


}
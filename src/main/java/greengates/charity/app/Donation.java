package greengates.charity.app;

class Donation {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String taxNumber;
    private String date;
    private String amount;
    private String recipient;


    public Donation(String[] data) {
        this.id = Integer.parseInt(data[0]);
        this.firstName = data[1];
        this.lastName = data[2];
        this.email = data[3];
        this.address = data[4];
        this.taxNumber = data[5];
        this.date = data[6];
        this.amount = data[7];
        this.recipient = data[8];
    }


    public Donation(Integer id, String firstName, String lastName, String email, String address, String taxNumber, String date, String amount, String recipient) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.taxNumber = taxNumber;
        this.date = date;
        this.amount = amount;
        this.recipient = recipient;
    }

    public Integer getId() {
        return id;
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
    public String getAddress() {
        return address;
    }
    public String getTaxNumber() {
        return taxNumber;
    }
    public String getDate() {
        return date;
    }
    public String getAmount() {
        return amount;
    }
    public String getRecipient() {
        return recipient;
    }
}
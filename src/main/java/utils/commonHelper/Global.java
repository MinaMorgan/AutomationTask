package utils.commonHelper;

public class Global {
    private String email;
    private String password;
    private String name;
    private String mobileNumber;
    private String address;
    private String city;
    private String zipcode;
    static Global global;


    private Global() {} // Private Constructor to stop instantiation to achieve singleton

    public static Global getGlobal() {
        if(global == null)
            global = new Global();
        return global;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = RandomSource.generateRandomEmail();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = RandomSource.generateRandomPassword();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = RandomSource.generateRandomName();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber() {
        this.mobileNumber = RandomSource.generateRandomMobileNumber();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = RandomSource.generateRandomAddress();
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = RandomSource.generateRandomCity();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode() {
        this.zipcode = RandomSource.generateRandomZipcode();
    }
}

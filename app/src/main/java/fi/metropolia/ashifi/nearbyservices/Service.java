package fi.metropolia.ashifi.nearbyservices;

public class Service {
   private String name;
   private String address;
   private String phone;
   private String openingHours;

    public Service(String name, String address, String phone, String openingHours) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.openingHours = openingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @Override
    public String toString() {
        return name;
    }
}

package fi.metropolia.ashifi.nearbyservices;

public class SuperMarkets {
    private String superMarketName;
    private String superMarketAddress;
    private String superMarketPhone;
    private String superMarketOpeningHours;

    public SuperMarkets(String superMarketName, String superMarketAddress, String superMarketPhone, String superMarketOpeningHours) {
        this.superMarketName = superMarketName;
        this.superMarketAddress = superMarketAddress;
        this.superMarketPhone = superMarketPhone;
        this.superMarketOpeningHours = superMarketOpeningHours;
    }

    public String getSuperMarketName() {
        return superMarketName;
    }

    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }

    public String getSuperMarketAddress() {
        return superMarketAddress;
    }

    public void setSuperMarketAddress(String superMarketAddress) {
        this.superMarketAddress = superMarketAddress;
    }

    public String getSuperMarketPhone() {
        return superMarketPhone;
    }

    public void setSuperMarketPhone(String superMarketPhone) {
        this.superMarketPhone = superMarketPhone;
    }

    public String getSuperMarketOpeningHours() {
        return superMarketOpeningHours;
    }

    public void setSuperMarketOpeningHours(String superMarketOpeningHours) {
        this.superMarketOpeningHours = superMarketOpeningHours;
    }

    @Override
    public String toString() {
        return superMarketName;
    }
}

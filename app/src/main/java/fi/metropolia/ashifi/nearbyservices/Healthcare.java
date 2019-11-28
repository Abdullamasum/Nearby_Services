package fi.metropolia.ashifi.nearbyservices;

public class Healthcare {
                private String healthcareName;
                private String healthcareAddress;
                private  String healthcarePhone;
                private String healthcareOpeningHours;

    public Healthcare(String healthcareName, String healthcareAddress, String healthcarePhone, String healthcareOpeningHours) {
        this.healthcareName = healthcareName;
        this.healthcareAddress = healthcareAddress;
        this.healthcarePhone = healthcarePhone;
        this.healthcareOpeningHours = healthcareOpeningHours;
    }

    public String getHealthcareName() {
        return healthcareName;
    }

    public void setHealthcareName(String healthcareName) {
        this.healthcareName = healthcareName;
    }

    public String getHealthcareAddress() {
        return healthcareAddress;
    }

    public void setHealthcareAddress(String healthcareAddress) {
        this.healthcareAddress = healthcareAddress;
    }

    public String getHealthcarePhone() {
        return healthcarePhone;
    }

    public void setHealthcarePhone(String healthcarePhone) {
        this.healthcarePhone = healthcarePhone;
    }

    public String getHealthcareOpeningHours() {
        return healthcareOpeningHours;
    }

    public void setHealthcareOpeningHours(String healthcareOpeningHours) {
        this.healthcareOpeningHours = healthcareOpeningHours;
    }

    @Override
    public String toString() {
        return healthcareName;
    }
}

package fi.metropolia.ashifi.nearbyservices;

public class GasStation {
    private String gasStationName;
    private String gasStationAddress;
    private String gasStationPhone;
    private String gasStationOpeningHours;

    public GasStation(String gasStationName, String gasStationAddress, String gasStationPhone, String gasStationOpeningHours) {
        this.gasStationName = gasStationName;
        this.gasStationAddress = gasStationAddress;
        this.gasStationPhone = gasStationPhone;
        this.gasStationOpeningHours = gasStationOpeningHours;
    }

    public String getGasStationName() {
        return gasStationName;
    }

    public void setGasStationName(String gasStationName) {
        this.gasStationName = gasStationName;
    }

    public String getGasStationAddress() {
        return gasStationAddress;
    }

    public void setGasStationAddress(String gasStationAddress) {
        this.gasStationAddress = gasStationAddress;
    }

    public String getGasStationPhone() {
        return gasStationPhone;
    }

    public void setGasStationPhone(String gasStationPhone) {
        this.gasStationPhone = gasStationPhone;
    }

    public String getGasStationOpeningHours() {
        return gasStationOpeningHours;
    }

    public void setGasStationOpeningHours(String gasStationOpeningHours) {
        this.gasStationOpeningHours = gasStationOpeningHours;
    }

    @Override
    public String toString() {
        return gasStationName;
    }
}

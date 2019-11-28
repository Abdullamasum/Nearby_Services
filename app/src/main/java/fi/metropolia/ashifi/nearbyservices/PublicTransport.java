package fi.metropolia.ashifi.nearbyservices;

public class PublicTransport {
    private String transportType;
    private  String stationName;
    private String distance;

    public PublicTransport(String transportType, String stationName, String distance) {
        this.transportType = transportType;
        this.stationName = stationName;
        this.distance = distance;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return transportType;
    }
}

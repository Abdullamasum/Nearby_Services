package fi.metropolia.ashifi.nearbyservices;

public class Restaurant {
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantPhone;
    private String RestaurantOpeningHours;

    public Restaurant(String restaurantName, String restaurantAddress, String restaurantPhone, String restaurantOpeningHours) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantPhone = restaurantPhone;
        RestaurantOpeningHours = restaurantOpeningHours;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantPhone() {
        return restaurantPhone;
    }

    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }

    public String getRestaurantOpeningHours() {
        return RestaurantOpeningHours;
    }

    public void setRestaurantOpeningHours(String restaurantOpeningHours) {
        RestaurantOpeningHours = restaurantOpeningHours;
    }

    @Override
    public String toString() {
        return restaurantName;
    }
}

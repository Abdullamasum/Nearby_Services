package fi.metropolia.ashifi.nearbyservices;

import java.util.ArrayList;
import java.util.List;

class RestaurantList {
    private static final RestaurantList ourInstance = new RestaurantList();
    private List<Restaurant> restaurants;

    static RestaurantList getInstance() {
        return ourInstance;
    }

    private RestaurantList() {
        restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant("Taco bell", "Sello shopping mall",
                "+3593333333", "Sello Shopping Mall"));
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}

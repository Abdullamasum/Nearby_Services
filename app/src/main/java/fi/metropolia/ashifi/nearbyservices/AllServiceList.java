package fi.metropolia.ashifi.nearbyservices;

import java.util.ArrayList;
import java.util.List;

class AllServiceList {
    private static final AllServiceList ourInstance = new AllServiceList();
    private List<GasStation> gasStation;
    private  List<Restaurant> restaurants;
    private  List<PublicTransport> publicTransports;
    private List<Healthcare> healthcares;
    private List<SuperMarketList> superMarketLists;

    static AllServiceList getInstance() {
        return ourInstance;
    }

    private AllServiceList() {

        gasStation = new ArrayList<GasStation>();

        gasStation.add(new GasStation("ABC Karaportti", "Karaniityntie 2, 02160 Espoo", "010 7660770", "24/7"));
        healthcares=new ArrayList<Healthcare>();
        healthcares.add(new Healthcare("Jorvin Sairaala", "Turuntie 150, 02740 Espoo", "09 4711", "24/7"));
        restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant("Taco bell", "Sello shopping mall",
                "+3593333333", "Sello Shopping Mall"));
    }


    public List<GasStation> getGasStations() {
        return gasStation;
    }
}

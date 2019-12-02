package fi.metropolia.ashifi.nearbyservices;

import java.util.ArrayList;
import java.util.List;

class AllServiceList {
    private static final AllServiceList ourInstance = new AllServiceList();
    private List<GasStation> gasStation;
    private List<Restaurant> restaurants;
    private List<PublicTransport> publicTransports;
    private List<Healthcare> healthcares;
    private List<SuperMarkets> superMarkets;

    static AllServiceList getInstance() {
        return ourInstance;
    }

    private AllServiceList() {

        gasStation = new ArrayList<GasStation>();
        gasStation.add(new GasStation("ABC Karaportti", "Karaniityntie 2, 02160 Espoo", "010 7660770", "24/7"));
        gasStation.add(new GasStation("Neste Express", "Tornihaukantie 9, 02620 Espoo", "0200 80100", "24/7"));
        gasStation.add(new GasStation("Neste-K", "Rajamännynahde 1, 02710 Espoo", "09 599626", "24/7"));
        gasStation.add(new GasStation("St1 Espoo Automat Karamalmi", "Karapellontie 11, 02610 Espoo", "0800 131031", "24/7"));

        healthcares = new ArrayList<Healthcare>();
        healthcares.add(new Healthcare("Jorvin Sairaala", "Turuntie 150, 02740 Espoo", "09 4711", "24/7"));
        healthcares.add(new Healthcare("Selviämisasema", "Vitikka 1 E 1, 02630 Espoo", "046 9685830", "24/7"));
        healthcares.add(new Healthcare("Kauniala Hospital", "Kylpyläntie 19, 02700 Kauniainen", "09 505921", "24/7"));
        healthcares.add(new Healthcare("Terveysasema", "Asematie 19, 02700 Kauniainen", "09 87891300", "ma-la: 10-22, Su 10-22"));

        restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant("Fazer Food", "Karakaarenkuja 6, 02610 Espoo",
                "+358 050 4760888", "ma-la: 11-13"));
        restaurants.add(new Restaurant("Restaurant Midpoint", "Karakaari 7, 02610 Espoo", "+358 050 3570687", "ma-la: 10-22, Su 10-22"));
        restaurants.add(new Restaurant("Ravintola Jufu Karaportti", "Karaniityntie 2, 02610 Espoo ", "+358 010 2080868", "ma-la: 10-22, Su 10-22"));

        superMarkets = new ArrayList<SuperMarkets>();
        superMarkets.add(new SuperMarkets("S-Market", "Karaniityntie 2, 02160 Espoo", "010 7660770", "ma-la: 7-22, Su 9-22"));
        superMarkets.add(new SuperMarkets("Alepa Karakallio", "Karakalliontie 10, 02620 Espoo", "010 7669390", "ma-la: 8-22, Su 9-22"));
        superMarkets.add(new SuperMarkets("K-Market Kilo", "Kilonpuistonkatu 14, 07900 Espoo", "010 7669489", "ma-la: 7-21, Su 9-20"));
        superMarkets.add(new SuperMarkets("Alepa Kilo", "Kilonkuja 3, 02610 Espoo", "010 7669955", "ma-la: 7-23, Su 9-21"));

        publicTransports = new ArrayList<PublicTransport>();

        publicTransports.add(new PublicTransport("Bus", "Karaportti", "Turuntie corner with Karaniityntie"));
        publicTransports.add(new PublicTransport("Bus", "Karanristi", "Turuntie corner with Karaniityntie"));
        publicTransports.add(new PublicTransport("Train", "Keran Rautatieasema", "700m"));
        publicTransports.add(new PublicTransport("Train", "Kilo Rautatieasema", "1.2km"));

    }


    public List<GasStation> getGasStations() {
        return gasStation;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public List<PublicTransport> getPublicTransports() {
        return publicTransports;
    }

    public List<Healthcare> getHealthcares() {
        return healthcares;
    }

    public List<SuperMarkets> getSuperMarkets() {
        return superMarkets;
    }
}


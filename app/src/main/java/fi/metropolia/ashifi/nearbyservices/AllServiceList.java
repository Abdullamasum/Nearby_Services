package fi.metropolia.ashifi.nearbyservices;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

class AllServiceList {
    private static final String gasfilename = "gas.json";
    private static Gson gson = new Gson();

    private static final AllServiceList ourInstance = new AllServiceList();
    private List<Service> gasStation;
    private List<Service> restaurants;
    private List<Service> publicTransports;
    private List<Service> healthcares;
    private List<Service> superMarkets;


    static AllServiceList getInstance() {
        return ourInstance;
    }

    public void addService(String type, Service service, Context c) {
        if (type.equals(c.getString(R.string.gas))) {
            gasStation.add(service);

            try {
                gson.toJson(gasStation, new FileWriter(gasfilename));
                //FileOutputStream fos = c.openFileOutput(filename, Context.MODE_PRIVATE);
                //fos.write(gson.toJson(gasStation));
            } catch (Exception e) {
                Log.d(MainActivity.TAG, "failed to write to disk " + e);
            }
        }
    }


    private AllServiceList() {

        File f = new File(gasfilename);
        //read from json to the gasStation list
        try {
            gasStation = gson.fromJson(new FileReader(f), ArrayList.class);
        } catch (Exception e) {
            Log.d(MainActivity.TAG, "failed to read from json..." + e);
            gasStation = new ArrayList<>();
            gasStation.add(new Service("ABC Karaportti", "Karaniityntie 2, 02160 Espoo", "010 7660770", "24/7"));
            gasStation.add(new Service("Neste Express", "Tornihaukantie 9, 02620 Espoo", "0200 80100", "24/7"));
            gasStation.add(new Service("Neste-K", "Rajamännynahde 1, 02710 Espoo", "09 599626", "24/7"));
            gasStation.add(new Service("St1 Espoo Automat Karamalmi", "Karapellontie 11, 02610 Espoo", "0800 131031", "24/7"));
        }


        healthcares = new ArrayList<Service>();
        healthcares.add(new Service("Jorvin Sairaala", "Turuntie 150, 02740 Espoo", "09 4711", "24/7"));
        healthcares.add(new Service("Selviämisasema", "Vitikka 1 E 1, 02630 Espoo", "046 9685830", "24/7"));
        healthcares.add(new Service("Kauniala Hospital", "Kylpyläntie 19, 02700 Kauniainen", "09 505921", "24/7"));
        healthcares.add(new Service("Terveysasema", "Asematie 19, 02700 Kauniainen", "09 87891300", "ma-la: 10-22, Su 10-22"));

        restaurants = new ArrayList<Service>();
        restaurants.add(new Service("Fazer Food", "Karakaarenkuja 6, 02610 Espoo",
                "+358 050 4760888", "ma-la: 11-13"));
        restaurants.add(new Service("Restaurant Midpoint", "Karakaari 7, 02610 Espoo", "+358 050 3570687", "ma-la: 10-22, Su 10-22"));
        restaurants.add(new Service("Ravintola Jufu Karaportti", "Karaniityntie 2, 02610 Espoo ", "+358 010 2080868", "ma-la: 10-22, Su 10-22"));

        superMarkets = new ArrayList<Service>();
        superMarkets.add(new Service("S-Market", "Karaniityntie 2, 02160 Espoo", "010 7660770", "ma-la: 7-22, Su 9-22"));
        superMarkets.add(new Service("Alepa Karakallio", "Karakalliontie 10, 02620 Espoo", "010 7669390", "ma-la: 8-22, Su 9-22"));
        superMarkets.add(new Service("K-Market Kilo", "Kilonpuistonkatu 14, 07900 Espoo", "010 7669489", "ma-la: 7-21, Su 9-20"));
        superMarkets.add(new Service("Alepa Kilo", "Kilonkuja 3, 02610 Espoo", "010 7669955", "ma-la: 7-23, Su 9-21"));

        publicTransports = new ArrayList<Service>();

        publicTransports.add(new Service("Karaportti Buss stop", "Karaportti", "", ""));
        publicTransports.add(new Service("Karanristi Buss stop", "Karanristi", "Turuntie corner with Karaniityntie", ""));
        publicTransports.add(new Service("Kera Train Station", "Keran Rautatieasema", "", ""));
        publicTransports.add(new Service("Kilo Train Station", "Kilo Rautatieasema", "", ""));


    }


    public List<Service> getGasStations() {
        return gasStation;
    }

    public List<Service> getRestaurants() {
        return restaurants;
    }

    public List<Service> getPublicTransports() {
        return publicTransports;
    }

    public List<Service> getHealthcares() {
        return healthcares;
    }

    public List<Service> getSuperMarkets() {
        return superMarkets;
    }
}


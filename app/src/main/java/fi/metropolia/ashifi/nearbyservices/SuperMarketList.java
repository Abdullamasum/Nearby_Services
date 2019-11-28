package fi.metropolia.ashifi.nearbyservices;

import java.util.List;

class SuperMarketList {
    private static final SuperMarketList ourInstance = new SuperMarketList();
    private List<SuperMarkets> superMarkets;

    static SuperMarketList getInstance() {
        return ourInstance;
    }

    private SuperMarketList() {
        superMarkets.add(new SuperMarkets("S Market", "Karaniityntie 2, 02160 Espoo", "010 7660770", "ma-la: 7-22, Su 9-22"));
    }

    public List<SuperMarkets> getSuperMarkets() {
        return superMarkets;
    }
}

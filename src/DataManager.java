import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Property> createArr()
    {
        ArrayList<Property> properties = new ArrayList<>();

        properties.add(new Plot("Tel Aviv, Frishman 12", 200, 1500000, Plot.TYPE.URBAN));
        properties.add(new Plot("Kfar Saba, Weitzman 18", 500, 2500000, Plot.TYPE.AGRICULTURAL));
        properties.add(new Apartment("Ramat Gan, Bialik 23", 120, 2000000, 2, 4));
        properties.add(new Apartment("Jerusalem, King David 10", 100, 1800000, 1, 3));
        properties.add(new Villa("Haifa, Carmel 15", 300, 3500000, 3, 2));
        properties.add(new Villa("Eilat, Red Sea 5", 400, 4500000, 2, 3));
        properties.add(new Vacation("Dead Sea, Ein Bokek 1", 250, 3000000, 1, 10));
        properties.add(new Vacation("Tiberias, Sea of Galilee 2", 150, 2000000, 2, 8));
        properties.add(new Commercial("Petah Tikva, High-Tech 7", 500, 5000000, false, 4.5));
        properties.add(new Commercial("Ashdod, Industrial Zone 3", 600, 6000000, true, 6.0));
        properties.add(new Office("Herzliya, Business District 22", 300, 3500000));
        properties.add(new Office("Beer Sheva, Negev Center 17", 400, 4000000));

        return properties;
    }


}

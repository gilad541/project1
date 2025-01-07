import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws PriceException {
        RealEstateManager realEstateManager = new RealEstateManager("Alon");
        realEstateManager.setProperties(DataManager.createArr());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to search for properties");
        System.out.println("Enter 2 for financial report");
        System.out.println("Enter 3 for commercial yield");
        System.out.println("Enter 4 to see the properties by cities");
        System.out.println("Enter 5 to see the number of cities");
        System.out.println("Enter -1 to exit");
        int input = scanner.nextInt();
        while (input != -1){
            switch(input) {
                case (1):{
                    System.out.println("Enter your price");
                    int price = scanner.nextInt();
                    propertiesList(price,realEstateManager);}
                case (2):{
                    financialReport(realEstateManager);
                }
                case(3):{
                    commercialYield(realEstateManager);
                }
                case(4):{
                    System.out.println("Enter your wanted city");
                    String city = scanner.nextLine();
                    propertiesByCity(realEstateManager,city);
                }
                case(5):{
                    numberOfCities(realEstateManager);
                }
            }
            System.out.println("Enter 1 to search for properties");
            System.out.println("Enter 2 for financial report");
            System.out.println("Enter 3 for commercial yield");
            System.out.println("Enter 4 to see the properties by cities");
            System.out.println("Enter 5 to see the number of cities");
            System.out.println("Enter -1 to exit");
            input = scanner.nextInt();
        }
    }


    public static void propertiesList(double price, RealEstateManager realEstateManager) throws PriceException {
        if (price < 0) {
            throw new PriceException("Price cannot be negative.");
        }

        ArrayList<Property> arrayList = realEstateManager.maxPriced(price);
        for (Property property : arrayList) {
            System.out.println(property.toString());
        }
    }

    public static void financialReport(RealEstateManager realEstateManager)
    {
        for (Property property : realEstateManager.getProperties()) {
            System.out.print(property.getAddress()+"  tax:");
            property.taxlt();
        }
    }

    public static void commercialYield(RealEstateManager realEstateManager)
    {
        double sum = 0;
        for (Property property : realEstateManager.getProperties()) {
            if (property instanceof Commercial)
                sum += ((Commercial) property).getYield();
        }
        System.out.println("Sum: "+sum);
    }

    public static void propertiesByCity(RealEstateManager realEstateManager, String city) {
        for (Property property : realEstateManager.getProperties()) {
            String address = property.getAddress().toLowerCase();
            if (address.contains(city.toLowerCase()))
                System.out.println(property.toString());
        }
    }

    public static void numberOfCities(RealEstateManager realEstateManager) {
        HashMap<String, Integer> cityCountMap = new HashMap<>();
        for (Property property : realEstateManager.getProperties()) {
            String address = property.getAddress();
            String city = extractCityFromAddress(address);
            cityCountMap.put(city, cityCountMap.getOrDefault(city, 0) + 1);
        }

        System.out.println("Number of unique cities: " + cityCountMap.size());
        System.out.println("Cities and property counts:");
        for (HashMap.Entry<String, Integer> entry : cityCountMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " properties");
        }
    }

    private static String extractCityFromAddress(String address) {
        if (address == null || address.isEmpty()) {
            return "Unknown";
        }
        String[] parts = address.split(",");
        return parts[0].trim();
    }


}
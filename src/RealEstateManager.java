import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class RealEstateManager {

    private String name;
    private ArrayList<Property> properties = new ArrayList<>();

    public RealEstateManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property) {
        this.properties.add(property);
    }

    public ArrayList<Property> maxPriced(double price)
    {
        ArrayList<Property> arrayList = new ArrayList<>();
        for (Property property : this.properties) {
            if (property.getPrice() <= price)
                arrayList.add(property);
        }
        return arrayList;
    }

    public double sumPrice()
    {
        double sum = 0;
        for (Property property : this.properties) {
            sum += property.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "RealEstateManager{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }
}

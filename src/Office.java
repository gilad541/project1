public class Office extends Property{

    public Office(String address, double area, double price) {
        super(address, area, price);
    }

    @Override
    public void taxlt() {
        System.out.println("5%");
    }

    @Override
    public String toString() {
        return "Office{}"+ super.toString();
    }
}

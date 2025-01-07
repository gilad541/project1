public class Plot extends Property {

    public enum TYPE{
        URBAN,
        AGRICULTURAL,
        INDUSTRIAL
    }
    private TYPE type;

    public Plot(String address, double area, double price, TYPE type) {
        super(address, area, price);
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public void taxlt() {
        System.out.println("10%");
    }

    @Override
    public String toString() {
        return "Plot{" +
                "type=" + type +
                '}'+super.toString();
    }
}

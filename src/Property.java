public abstract class Property {
    private String address = "Na, na";
    private double area = 0;
    private double price = 0;

    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public void setAddress(String address) {
        if (address != null && address.trim().split(" ").length >= 2)
            this.address = address;
    }

    public void setArea(double area) {
        if(area > 0)
            this.area = area;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public abstract void taxlt();

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                '}';
    }
}

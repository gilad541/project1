public class Commercial extends Property{

    private boolean storeroom = false;
    private double yield = 0.0;

    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
    }

    public Commercial(String address, double area, double price, boolean storeroom, double yield) {
        super(address, area, price);
        setStoreroom(storeroom);
        setYield(yield);
    }

    public boolean isStoreroom() {
        return storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public void setYield(double yield) {
        if (yield > 0)
            this.yield = yield;
    }

    public void expectedYield() {
        System.out.println(this.getPrice() * (this.yield /100) / 12+"");
    }


    @Override
    public void taxlt() {
        System.out.println("5%");
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "storeroom=" + storeroom +
                ", yield=" + yield +
                '}' + super.toString();
    }
}

public class Car{
    private int id;
    private String marka;
    private double price;

    private Driver driver;
    private boolean reservation;

    public Car(int id, String marka, double price, Driver driver) {
        this.id = id;
        this.marka = marka;
        this.price = price;
        this.driver = driver;
        this.reservation = false;
    }

    public boolean getReservation() {
        return reservation;
    }

    public void setRezervation(boolean rezervation) {
        this.reservation = rezervation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Cars" +
                id +
                ", marka: '" + marka + '\'' +
                ", price: " + price +
                ", driver: " + driver + "\n"
                ;
    }
}

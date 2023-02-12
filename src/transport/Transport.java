package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int speed;

    public Transport(String brand, String model, int year, String country, String color, int speed) {
        this.brand = checkBrand(brand);
        this.model = checkModel(model);
        this.year = checkYear(year);
        this.country = checkCountry(country);
        this.color = checkColor(color);
        setSpeed(speed);
    }

    public int getYear() {return year;}
    public String getCountry() {return country;}
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public String getColor() {return color;}

    public int getSpeed() {return speed;}
    public void setColor(String color) {this.color = color;}

    public void setSpeed(int speed) {
        if (speed <= 0) {
            speed = 140;
        }
        this.speed = speed;
    }

    public String checkBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            return "default";
        }
        return brand;
    }
    public String checkModel(String model) {
        if (model == null || model.isEmpty()) {
            return "default";
        }
        return model;
    }
    public String checkCountry(String country) {
        if (country == null || country.isEmpty()) {
            return "default";
        }
        return country;
    }
    public int checkYear(int year) {
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }
    public String checkColor(String color) {
        if (color == null || color.isEmpty()) {
            return "белый";
        }
        return color;
    }
    @Override
    public String toString() {
        return "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", цвет='" + color + '\'' +
                ", год=" + year +
                ", страна='" + country + '\'' +
                ", макс.скорость = " + speed;

    }
}

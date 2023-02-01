package Car;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car (String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = checkBrand(brand);
        this.model = checkModel(model);
        this.year = checkYear(year);
        this.country = checkCountry(country);
        this.color = checkColor(color);
        this.engineVolume = checkEngineVolume(engineVolume);
    }
    public String checkBrand(String brand) {
        if (brand == null || brand == "") {
            return "default";
        }
        this.brand = brand;
        return brand;
    }
    public String checkModel(String model) {
        if (model == null || model == "") {
            return "default";
        }
        this.model = model;
        return model;
    }
    public String checkCountry(String country) {
        if (country == null || country == "") {
            return "default";
        }
        this.country = country;
        return country;
    }
    public int checkYear(int year) {
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }
    public String checkColor(String color) {
        if (color == null || color == "") {
            return "белый";
        }
        this.color = color;
        return color;
    }
    public double checkEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}

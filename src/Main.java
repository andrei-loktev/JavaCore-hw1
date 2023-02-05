import Car.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car( "Lada", "Granta", 2015, "Russia", "жёлтый", 1.7);
        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 2020 , "Germany", "чёрный", 3.0);
        Car car2 = new Car("Bmw", "Z8", 2021, "Germany", "чёрный", 3.0);
        Car car3 = new Car("Kia", "Sportage", 2018, "South Korea", "красный", 2.4);
        Car car4 = new Car("Hyundai", "Avante", 2016, "South Korea", "оранжевый", 1.6);

        System.out.println(car.toString());
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
    }
}
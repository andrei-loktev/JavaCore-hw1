package transport;

public class Car extends Transport{

    private double engineVolume;
    private String gear;
    private final String bodyType;
    private String registerNumber;
    private final int seat;
    private boolean isSummerTyres;
    private Key key;


    public static class Key {
        private final boolean startEngine;
        private final boolean smartKey;

        public Key(boolean startEngine, boolean smartKey) {
            this.startEngine = startEngine;
            this.smartKey = smartKey;
        }

        @Override
        public String toString() {
            return (startEngine ? "с автозапуском " : "без автозапуска") + ", " +
                    (smartKey ? "есть бесключевой доступ " : "нет бесключевого доступа");
        }
    }

    public Car(String brand, String model,
               int year, String country,
               String color, double engineVolume, String gear,
               String bodyType, String registerNumber,
               int seat, boolean isSummerTyres, Key key, int speed) {
        super(brand, model, year, country, color, speed);

        this.engineVolume = checkEngineVolume(engineVolume);
        this.gear = checkGear(gear);
        this.bodyType = checkBodyType(bodyType);
        this.seat = seat;
        this.registerNumber = checkRegNumber(registerNumber);
        this.isSummerTyres = isSummerTyres;
        this.key = key;

    }

    public double getEngineVolume() {return engineVolume;}

    public String getGear() {return gear;}
    public String getBodyType() {return bodyType;}
    public String getRegisterNumber() {return registerNumber;}
    public int getSeat() {return seat;}

    public Key getKey() {return key;}

    public void setKey(Key key) {
        if (key == null){
            key = new Key(true, true);
        }
        this.key = key;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = checkEngineVolume(engineVolume);
    }

    public void setGear(String gear) {
        this.gear = checkGear(gear);
    }
    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
    public void setSummerTyres(boolean summerTyres) {
        isSummerTyres = summerTyres;
    }
    public String checkRegNumber(String registerNumber){
        if (registerNumber == null || registerNumber.isEmpty()) {
            registerNumber = "xxx";
        }
        return registerNumber;
    }

    public void changeTyres(int month) {
        if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            isSummerTyres = false;
        }
        if (month >= 5 && month <= 10) {
            isSummerTyres = true;
        }
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
    public double checkEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return engineVolume;
    }
    public String checkBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty()) {
            return "default";
        }
        return bodyType;
    }
    public String checkGear(String gear) {
        if (gear == null || gear.isEmpty()) {
            return "default";
        }
        return gear;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                ", коробка='" + gear + '\'' +
                ", тип кузова='" + bodyType + '\'' +
                ", госномер='" + registerNumber + '\'' +
                ", кол-во мест=" + seat + ", " +
                (isSummerTyres ? "летняя" : "зимняя") + " резина" + ", " +
                key;
    }
}



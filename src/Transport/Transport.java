package Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final Integer productionYear;
    private final String productionCountry;
    private String color;
    private Integer speedMax;


    public Transport(String brand, String model, Integer productionYear, String productionCountry, Integer speedMax) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        setSpeedMax(speedMax);
    }

    protected abstract void refill();

    public void setColor(String color) {
        if(color != null) {
        this.color = color;
    }else {
            this.color = "Цвет не указан";
        }
    }

    public void setSpeedMax(int speedMax) {
        if (speedMax <= 0) {
            this.speedMax = -1;
        } else {
            this.speedMax = speedMax;
        }
    }

    public Transport(String brand, String model, Integer productionYear, String productionCountry,
                     String color, Integer speedMax)
        {
            this.brand = brand;
            this.model = model;
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
            this.color = color;
            this.speedMax = speedMax;
        }


        public String getBrand () {
            return brand;
        }

        public String getModel () {
            return model;
        }

        public int getProductionYear () {
            return productionYear;
        }

        public String getProductionCountry () {
            return productionCountry;
        }

        public String getColor () {
            return color;
        }

        public int getSpeedMax () {
            return speedMax;
        }


    @Override
    public String toString() {
        return "Марка - "+ brand +
                ", Модель - " + model +
                ", Год выпуска - " + productionYear +
                ", Страна производитель - " + productionCountry +
                " Цвет - " + color +
                ", Максимальная скорость - " + speedMax +
                '.';
    }
    }

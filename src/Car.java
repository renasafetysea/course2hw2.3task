import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private String color;
    private String productionCountry;
    private double engineVolume;

    public Car(String brand, String model, int productionYear, String color, String productionCountry, double engineVolume) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        if (productionYear >= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.color = Objects.requireNonNullElse(color, "белый");
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString () {
        return brand +" "+ model+ " " + productionYear +
                " год выпуска. Цвет кузова "  + color +
                ". Произведена в " + productionCountry +
                ". Объем двигателя " + engineVolume;
    }
}

package Transport;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final int productionYear;
    private String color;
    private final String productionCountry;
    private Float engineVolume;
    private String transmission;
    private final String body;
    private String regNumber;
    private final Integer numberOfSeats;
    private String summerTires;

    public Car(String brand, String model, int productionYear, String color, String productionCountry,
               Float engineVolume, String transmission,String body,String regNumber, Integer numberOfSeats,
               String summerTires) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        if (productionYear >= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.color = Objects.requireNonNullElse(color, "белый");
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        if ( engineVolume == null  || engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "transmission";
        }else {
            this.transmission = transmission;
        }
        if (body == null || body.isEmpty() || body.isBlank()) {
            this.body = "body";
        }else {
            this.body = body;
        }
        if (regNumber == null || regNumber.isBlank() || regNumber.isEmpty()) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        this.numberOfSeats = Objects.requireNonNullElse(numberOfSeats, 5);
        if (summerTires == null || summerTires.isBlank() || summerTires.isEmpty()) {
            this.summerTires = "summerTires";
        } else {
            this.summerTires = summerTires;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBody() {
        return body;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Float engineVolume) {
        if ( engineVolume == null  || engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
        this.engineVolume = engineVolume;
    }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "transmission";
        }else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank() || regNumber.isEmpty()) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;

    }
    }


    public String getSummerTires() {
        return summerTires;
    }

    public void setSummerTires(String summerTires) {
        if (summerTires == null || summerTires.isBlank() || summerTires.isEmpty()) {
            this.summerTires = "summerTires";
        } else {
        this.summerTires = summerTires;
    }
    }
    public boolean regNumberCorrect() {
        return this.regNumber.matches("[A-Z]{2}\\d{3}[A-Z]\\d{3}");

    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", body='" + body + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerTires='" + summerTires + '\'' +
                '}';
    }
}

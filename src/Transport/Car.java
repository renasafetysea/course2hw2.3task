package Transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {
    private Float engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final Integer numberOfSeats;
    private Boolean isSummerTires;
    private final Key key;
    private final Insurance insurance;

    public Car(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed,
               Float engineVolume, String transmission, String bodyType, String regNumber, Integer numberOfSeats, Boolean isSummerTires,
               String wirelessAccess, String remoteStart, String date, Float cost, String number) {
        super(brand, model, productionYear, productionCountry, maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "bodyType";
        } else {
            this.bodyType = bodyType;
        }
        setRegNumber(regNumber);
        this.numberOfSeats = Objects.requireNonNullElse(numberOfSeats, 4);
        setTires(isSummerTires);
        key = new Key(wirelessAccess, remoteStart);
        insurance = new Insurance(date, cost, number);
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTires() {
        if (isSummerTires) {
            return "Лето";
        } else return "Зима";
    }

    public void setEngineVolume(Float engineVolume) {
        if (engineVolume == null || engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "transmission";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank()) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public void setTires(Boolean isSummerTires) {
        this.isSummerTires = Objects.requireNonNullElse(isSummerTires, false);
    }

    public boolean isRegNumberValid() {
        return this.regNumber.matches("[AВЕКМНОРСТУХавекмнорстух]{2}\\d{3}[AВЕКМНОРСТУХавекмнорстух]\\d{3}");
    }

    public void isInvalidNumberInsurance() {
        if (insurance.number.length() != 9) {
            System.out.println("Некорректный номер страховки!");
        }
    }

    public void isExpiredInsurance() {
        if (insurance.validity.isBefore(LocalDate.now())) {
            System.out.println("Страховка просрочена");
        }
    }

    public void changeTires(String season) {
        if (season.equalsIgnoreCase("лето")) {
            isSummerTires = true;
        } else if (season.equalsIgnoreCase("зима")) {
            isSummerTires = false;
        } else {
            System.out.println("Неверное значение");
        }
    }

    @Override
    public void refill() {
        System.out.println("Можно заправить бензином, дизелем или на электро-парковке");
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString() + "\nобъем двигателя " + String.format("%.1f", engineVolume)
                + " л" + "\nкоробка передач " + transmission + "\nтип кузова " + bodyType + "\nномер "
                + regNumber + "\nколичество мест " + numberOfSeats + "\nрезина " + getTires() + "\n"
                + key + "\n" + insurance;
    }

    private class Key {
        private final boolean isWirelessAccess;
        private final boolean isRemoteStart;

        private Key(String wirelessAccess, String remoteStart) {
            if (wirelessAccess == null) {
                isWirelessAccess = false;
            } else {
                isWirelessAccess = wirelessAccess.equalsIgnoreCase("Есть");
            }
            if (remoteStart == null) {
                isRemoteStart = false;
            } else {
                isRemoteStart = remoteStart.equalsIgnoreCase("Есть");
            }
        }

        @Override
        public String toString() {
            String access, start;
            if (isWirelessAccess) {
                access = "есть";
            } else access = "нет";
            if (isRemoteStart) {
                start = "есть";
            } else start = "нет";
            return String.format("бесключевой доступ: %s, удаленный запуск: %s", access, start);
        }
    }

    private class Insurance {
        private final LocalDate validity;
        private final Float cost;
        private String number;

        private Insurance(String date, Float cost, String number) {
            if (date == null || date.isBlank() || date.length() != 10) {
                validity = LocalDate.parse("1900-01-01");
                System.out.println("Некорректная дата");
            } else {
                validity = LocalDate.parse(date.replace('.', '-'));
            }
            if (cost == null || cost < 0) {
                this.cost = 0f;
            } else {
                this.cost = cost;
            }
            if (number == null || number.isBlank()) {
                this.number = "Не указано";
            } else if (number.length() != 9) {
                this.number = "Не указано";
                System.out.println("Номер страховки некорректный!");
            } else {
                this.number = number;
            }
        }

        @Override
        public String toString() {
            return "Страховка до " + validity + ", стоимость " + String.format("%.2f", cost) + ", номер " + number;
        }
    }
}
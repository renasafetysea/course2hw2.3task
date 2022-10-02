package Transport;

import java.time.LocalDate;
import java.util.Objects;

public class Train extends Transport {
        private Float priceOfTrip;
        private LocalDate trevelTime;
        private String lastStop;
        private String departureStation;
        private Integer numberOfWagons;

        public Train(String brand, String model, Integer productionYear, String productionCountry,
                     Integer maxSpeed, Float priceOfTrip, String trevelTime, String lastStop, String departureStation,
                     Integer numberOfWagons) {
            super(brand, model,productionYear, productionCountry, maxSpeed);
            setPriceOfTrip(priceOfTrip);
            setTrevelTime(trevelTime);
            setLastStop(lastStop);
            setDepartureStation(departureStation);
            setNumberOfWagons(numberOfWagons);
        }

        public Float getPriceOfTrip() {
            return priceOfTrip;
        }

        public void setPriceOfTrip(Float priceOfTrip) {
            if (priceOfTrip == null || priceOfTrip < 0) {
                this.priceOfTrip = 0f;
            } else this.priceOfTrip = priceOfTrip;
        }

        public LocalDate getTrevelTime() {
            return trevelTime;
        }

        public void setTrevelTime(String trevelTime) {
            if (trevelTime == null || trevelTime.isBlank() || trevelTime.length() != 10) {
                this.trevelTime = LocalDate.parse("2020-12-01");
                System.out.println("Некорректная дата");
            } else {
                this.trevelTime = LocalDate.parse(trevelTime.replace('.', '-'));
            }
        }

        public String getLastStop() {
            return lastStop;
        }

        public void setLastStop(String lastStop) {
            if (lastStop == null || lastStop.isBlank()) {
                this.lastStop = "Не указано";
            } else {
                this.lastStop = lastStop;
            }
        }

        public String getDepartureStation() {
            return departureStation;
        }

        public void setDepartureStation(String departureStation) {
            if (departureStation == null || departureStation.isBlank()) {
                this.departureStation = "Не указано";
            } else {
                this.departureStation = departureStation;
            }
        }

        public Integer getNumberOfWagons() {
            return numberOfWagons;
        }

        public void setNumberOfWagons(Integer numberOfWagons) {
            this.numberOfWagons = Objects.requireNonNullElse(numberOfWagons, 10);
        }

        @Override
        public void refill() {
            System.out.println("Можно заправить дизелем");
        }

        @Override
        public String toString() {
            return "Поезд - " + super.toString() +
                    " Цена поездки " + String.format("%.2f", priceOfTrip) + " руб. Дата отправления " + trevelTime + ". Пункт отправления "
                    + lastStop + ". Пункт прибытия " + departureStation + ". Количество вагонов " + numberOfWagons;
        }
    }


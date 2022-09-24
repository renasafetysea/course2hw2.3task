public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.productionYear = 2015;
        lada.productionCountry = "Russia";
        lada.color = "yellow";
        lada.engineVolume = 1.7;

        lada.obgect();

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8";
        audi.productionYear = 2020;
        audi.productionCountry = "Germany";
        audi.color = "black";
        audi.engineVolume = 3.0;

        audi.obgect();

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Germany";
        bmw.color = "black";
        bmw.engineVolume = 3.0;

        bmw.obgect();

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage";
        kia.productionYear = 2018;
        kia.productionCountry = "South Korea";
        kia.color = "red";
        kia.engineVolume = 2.4;

        kia.obgect();

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "South Korea";
        hyundai.color = "red";
        hyundai.engineVolume = 1.6;

        hyundai.obgect();


    }
}
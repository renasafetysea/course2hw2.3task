public class Car {
    String brand;
    String model;
    String color;
    String productionCountry;
    double engineVolume;
    int productionYear;

    void obgect(){
        System.out.println(brand + model +" " + productionYear + " год выпуска.Сборка в " +productionCountry );
        System.out.println(color + " цвет кузова. Объем двигателя " + engineVolume );
        System.out.println();
    }
}

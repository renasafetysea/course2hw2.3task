package Transport;

public class Bus extends  Transport{

    public Bus(String brand, String model,Integer productionYear,String productionCountry,String color,
               Integer speedMax) {
        super(brand, model, productionYear, productionCountry, color, speedMax);
    }


    @Override
    public void refill() {
        System.out.println("Можно заправить дизелем или бензином.");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}



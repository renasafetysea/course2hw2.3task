import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","Granta",2015,"yellow","Russia",
                1.7f,"avtomat","Universal","A555AA555",5,"summerT");
        System.out.println(lada);
        System.out.println();

        Car audi = new Car("Audi","A8",2020,"black","Germany",
                3.0f,"avtomat","universal","B111BB111",5,"summerT");
        System.out.println(audi);
        System.out.println();

        Car bmw = new Car("BMW","Z8",2021,"black","Germany",
                0f,"avtomat",null,"DDD333558",5,"summerT");
        System.out.println(bmw);
        System.out.println();

        Car kia = new Car("Kia","Srortage", 2018, null, "South Korea",
                2.4f,null,"universal","C777CC777",3,null);
        System.out.println(kia);
        System.out.println();

        Car hyundai = new Car("Hyundai","Avente", 2016,"red", null,
                1.6f,"mechanic","universal",null,4,"summmerT");
        System.out.println(hyundai);
        System.out.println();


    }
}
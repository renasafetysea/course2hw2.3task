import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","Granta",2015,"yellow","Russia",
                1.7f,"avtomat","Universal","A555AA555",5,
                "summerT",null,"no",null,33.12f,"111222333");
        System.out.println(lada);
        System.out.println();

        Car audi = new Car("Audi","A8",2020,"black","Germany",
                3.0f,"avtomat","universal","B111BB111",5,
                "summerT","yes","yes",null,56.15f,"1111111111");
        System.out.println(audi);
        System.out.println();

        Car bmw = new Car("BMW","Z8",2021,"black","Germany",
                0f,"avtomat",null,"DDD333558",5,
                "summerT","yes",null,"2023.10.10",44.56f,"222222222");
        System.out.println(bmw);
        System.out.println();

        Car kia = new Car("Kia","Srortage", 2018, null, "South Korea",
                2.4f,null,"universal","C777CC777",3,
                null,"no","no","2024.01.01",69.49f,"555555555");
        System.out.println(kia);
        System.out.println();

        Car hyundai = new Car("Hyundai","Avente", 2016,"red", null,
                1.6f,"mechanic","universal",null,4,
                "summmerT","no","no",null,null,null);
        System.out.println(hyundai);
        System.out.println();



    }
}
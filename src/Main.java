import Animals.*;
import Transport.Bus;
import Transport.Train;

public class Main {
    public static void main(String[] args) {

        Train lastoshka = new Train("Ласточка", "B-901", 2011, "Россия",
                301, 3500f, null, "Белорусский вокзал", "Минск",
                11);
        System.out.println(lastoshka);
        System.out.println();
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                270, 1700f, null, "Ленинградский вокзал", "Ленинград-Пассажирский",
                 8);
        System.out.println(leningrad);
        System.out.println();
        Bus bogdan = new Bus("Богдан", "КЕМ", 1999, "Украина", "синий", 165);
        System.out.println(bogdan);
        System.out.println();
        Bus wolks = new Bus("Фольцваген", "транспортер", 1985, "Германия", "зеленый", 190);
        System.out.println(wolks);
        System.out.println();
        Bus gazel = new Bus("Газель", "Тыгыдык", 2020, "Россия", "красный", 205);
        System.out.println(gazel);
        System.out.println();

        Herbivore bizon = new Herbivore("Бизон", 1, 55);
        System.out.println(bizon);
        Herbivore antilopa = new Herbivore("Антилопа", 5, 70);
        System.out.println(antilopa);
        Predator lion = new Predator("Лев", 3, 60);
        System.out.println(lion);
        Predator pantera = new Predator("Пантера", 6, 45);
        System.out.println(pantera);
        Amphibian gikon = new Amphibian("Гекон", 2);
        System.out.println(gikon);
        Amphibian iguana = new Amphibian("Игуана", 4);
        System.out.println(iguana);
        FlightlessBird straus = new FlightlessBird("Страус", 3);
        System.out.println(straus);
        FlightlessBird emu = new FlightlessBird("Эму", 3);
        System.out.println(emu);
        FlyingBird vorona = new FlyingBird("Ворона", 1);
        System.out.println(vorona);
        FlyingBird jastreb = new FlyingBird("Ястреб", 1);
        System.out.println(jastreb);

        lion.hunt();
        iguana.hunt();


        Herbivore lopa = new Herbivore("Антилопа", 3, 60);
        System.out.println(antilopa.equals(lopa));
        System.out.println(antilopa.equals(pantera));
}
}
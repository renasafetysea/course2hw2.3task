package Animals;

import java.util.Objects;

public class FlightlessBird extends Bird{
        public FlightlessBird(String name, Integer age) {
            super(name, age, "Ходит и бегает", "");
        }

        public void walk() {
            System.out.println(" Я гуляю");
        }

        @Override
        void eat() {
            System.out.println("Я ем");
        }

        @Override
        void go() {
            System.out.println("Я хожу ");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FlightlessBird a = (FlightlessBird) o;
            return Objects.equals(getName(), a.getName());
        }
    }


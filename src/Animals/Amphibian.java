package Animals;

import java.util.Objects;

public class Amphibian extends Animals {

        public Amphibian(String name, Integer age) {
            super(name, age, "земно-водная");
        }

        public void hunt() {
            System.out.println("Я охочусь");
        }

        @Override
        void eat() {
            System.out.println("Я ем");
        }

        @Override
        void go() {
            System.out.println("Я хожу");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Amphibian a = (Amphibian) o;
            return Objects.equals(getName(), a.getName());
        }
    }


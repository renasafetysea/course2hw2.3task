package Animals;

import java.util.Objects;

public class Predator extends Mammal {
        public Predator(String name, Integer age, Integer speed) {
            super(name, age, speed, "Животные");
        }

        public void hunt() {
            System.out.println("Я охочусь");
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Predator a = (Predator) o;
            return Objects.equals(getName(), a.getName());
        }

        @Override
        void go() {
            System.out.println("Я хожу и всех ем");
        }
    }


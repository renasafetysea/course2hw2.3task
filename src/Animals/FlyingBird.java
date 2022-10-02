package Animals;

import java.util.Objects;

public class FlyingBird extends Bird{
        public FlyingBird(String name, Integer age) {
            super(name, age, "Летает", "Наземно-воздушная");
        }

        public void fly() {
            System.out.println("Я летаю");
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
            FlyingBird a = (FlyingBird) o;
            return Objects.equals(getName(), a.getName());
        }
    }


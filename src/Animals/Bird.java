package Animals;

abstract class Bird extends Animals {
        public final String locomotion;

        public Bird(String name, Integer age, String locomotion, String envin) {
            super(name, age, envin);
            if (locomotion == null || locomotion.isBlank()) {
                throw new IllegalArgumentException("Информация отсутствует!");
            } else {
                this.locomotion = locomotion;
            }
        }

        public String getLocomotion() {
            return locomotion;
        }

        public void hunt() {
            System.out.println("Я охочусь");
        }

        @Override
        public String toString() {
            return super.toString() + ", тип передвижения " + locomotion;
        }
    }


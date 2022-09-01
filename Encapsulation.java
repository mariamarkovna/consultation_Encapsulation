package homework.hw2608;

public class Encapsulation {

//    Инкапсуляция для классов Cat и Dog
//    Скрыть все внутренние переменные класса Cat и Dog. Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.

    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);
        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }

    public static class Cat {
       private String name;
        private int speed;


        Cat(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        private String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

       public boolean isDogNear(Dog dog) {
            return this.speed > dog.getSpeed();
        }
    }

    static class Dog {
        private String name;
        private int speed;

        Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        private String getName() {
            return name;
        }

        int getSpeed() {
            return speed;
        }

        boolean isCatNear(Cat cat) {
            return this.speed > cat.getSpeed();
        }
    }

}

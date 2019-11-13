package main;

import animals.Animal;
import animals.Cat;
import animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal animal = Dog.homeDog("Tuzik", 3);
        System.out.println(animal.getName());
        animal.voice();
        animal = new Cat("Murka",1);
        animal.voice();

        Animal b = new Animal("qqq",1) {
            @Override
            public void voice() {
                System.out.println("qwe");
            }
        };

        Dog d = null;
        System.out.println(d.LEGS);

        System.out.println(((Dog) null).LEGS);
    }
}







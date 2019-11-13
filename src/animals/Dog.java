package animals;

public class Dog extends Animal {

    private Dog(String name, int age) {
        super(name, age);
    }

    private Dog() {
        super("",0);
    }

    public static Dog homeDog(String name, int age) {
        if (age>=0) {
            return new Dog(name, age);
        } else return null;
    }

    public static Dog streetDog() {
        return new Dog();
    }

    @Override
    public void voice() {
        System.out.println("gav-gav");
    }
}

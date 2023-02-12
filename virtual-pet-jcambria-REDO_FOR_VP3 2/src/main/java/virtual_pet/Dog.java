package virtual_pet;

public class Dog extends Organic {

    public Dog(String name, int hunger, int thirst, int boredom, int cleanliness) {
        super(name, hunger, thirst, boredom, cleanliness);
    }

    public void walk() {
        super.walk();
    }
}


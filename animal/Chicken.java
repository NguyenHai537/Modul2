package animal;

import edible.Edible;
public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: oooooooo!";
    }
    public String howtoEat(){
        return "could be rice";
    }
}

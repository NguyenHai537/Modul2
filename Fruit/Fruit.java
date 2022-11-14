package Fruit;

import edible.Edible;

public abstract class Fruit implements Edible {
    @Override
    public String howtoEat() {
        return "This is Fruit";
    }
}

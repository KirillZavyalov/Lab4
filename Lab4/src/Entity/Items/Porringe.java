package Entity.Items;

import Entity.Entity;
import Printer.ConsolePrinter;

public class Porringe extends Entity implements  FoodInterface{

    public Porringe(String name, boolean isAlive) {
        super(name, isAlive);
    }

    @Override
    public void getEaten(Entity someone) {
        ConsolePrinter.print(this.getName() + " съеден " + someone.getName());
    }
}

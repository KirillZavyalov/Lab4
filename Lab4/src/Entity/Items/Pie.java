package Entity.Items;

import Entity.Entity;
import Printer.ConsolePrinter;

public class Pie extends  Entity implements  FoodInterface{

    public Pie(String name, boolean isAlive) {
        super(name, isAlive);
    }

    @Override
    public void getEaten(Entity someone) {
        ConsolePrinter.print(this.getName() + " съеден " + someone.getName());
    }
}

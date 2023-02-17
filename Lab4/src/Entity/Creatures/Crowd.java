package Entity.Creatures;

import Entity.Entity;
import Printer.ConsolePrinter;

public class Crowd extends Entity {
    public Crowd(String name, boolean isAlive) {
        super(name, isAlive);
    }

    @Override
    public  void  laugh(){
        ConsolePrinter.print("Коротышки смеются");
    }

    @Override
    public  void haveFun(){
        ConsolePrinter.print(this.getName() + " веселится ");
    }

}

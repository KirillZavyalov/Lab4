package Entity;

import Entity.Creatures.BodyParts;
import Exceptions.ObjectIsNotAliveException;

public class Furniture extends Entity{

    public Furniture(String name, boolean isAlive) {
        super(name, isAlive);
    }

    //Плохой локальный класс
    @Override
    public  void  hit(Entity target, BodyParts part){
        class ToeHitter{
            public void hitToe() throws ObjectIsNotAliveException {
                target.cry();
            }
        }
    }

    @Override
    public String toString(){
        return this.getName();
    }
}

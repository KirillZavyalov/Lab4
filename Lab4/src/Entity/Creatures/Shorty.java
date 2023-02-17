package Entity.Creatures;

import Entity.Entity;
import Entity.Items.Ball;
import Exceptions.ObjectIsNotAliveException;
import Exceptions.ObjectIsNotBallException;
import Printer.ConsolePrinter;
import Scene.AbstractScene;
import Scene.Scene;

public class Shorty extends Entity {

    public Shorty(String name, boolean isAlive) {
        super(name, isAlive);
    }

    @Override
    public void sell(Entity ball) throws ObjectIsNotBallException {
        if (!(ball instanceof Ball)){
            throw new ObjectIsNotBallException();
        }
        else {ConsolePrinter.print(this.getName() + " продает " + ball.getName());}
    }

    @Override
    public  void interactWithScene(AbstractScene scene){
        ConsolePrinter.print(this.getName() + " просунул голову через " + Scene.Curtain.getName());
    }

    @Override
    public  void protectBodyPart(BodyParts part){
        ConsolePrinter.print(this.getName() + " старается защитить " + part.getDescription());
    }

    @Override
    public  void pay(int summ, Entity someone){
        ConsolePrinter.print(this.getName() + " заплатил " + someone.getName() + " " + summ + " сантик");
    }

    public void  payToScene(int summ, AbstractScene scene) throws ObjectIsNotAliveException {
        ConsolePrinter.print(this.getName() + " заплатил " + scene.getName() + " " + summ + " сантик");
    }

    @Override
    public  void cry(){
        ConsolePrinter.print( this.getName() + " пустил слезу ");
    }

    @Override
    public  void payWithSomeone(Entity s1, Entity s2, int sum){
        ConsolePrinter.print( s1.getName() + " и " + s2.getName() + " заплатили " + sum + " сантик " );
    }


}

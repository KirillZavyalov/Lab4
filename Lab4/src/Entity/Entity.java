package Entity;

import Entity.Creatures.BodyParts;
import Entity.Items.Ball;
import Exceptions.ObjectIsNotAliveException;
import Exceptions.ObjectIsNotBallException;
import Printer.ConsolePrinter;
import Scene.AbstractScene;
import Scene.Scene;

public abstract class Entity {
    private final String name;
    private final boolean isAlive;

    public Entity(String name, boolean isAlive){
        this.name = name;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void laugh() throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    public void throwObj(Entity obj, Entity target) throws ObjectIsNotAliveException {
        if (this.isAlive){
            if (obj instanceof Ball){
                ConsolePrinter.print(this.getName() + " кинул " + obj.getName() + " в " + target.getName());
            }
            else  throw new ObjectIsNotBallException();
        }
        else  throw new ObjectIsNotAliveException();
    }

    public  void  hit(Entity target, BodyParts part){
        ConsolePrinter.print(this.name + " ударил " +
                target.getName() + " в " + part.getDescription());
    }

    public void interactWithScene(AbstractScene scene) throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    public  void protectBodyPart(BodyParts part) throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    public  void cry() throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    public  void haveFun() throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    public void sell(Entity obj) throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    public void  pay(int summ, Entity someone) throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    public void  payToScene(int summ, AbstractScene scene) throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    public void becomeSad() throws ObjectIsNotAliveException {
        if (!this.isAlive){
            throw new ObjectIsNotAliveException();
        }
        else {
        ConsolePrinter.print(this.getName() + " загрустил");
        }
    }

    public  void getEaten(Entity someone){
    }

    public  void payWithSomeone(Entity s1, Entity s2, int sum) throws  ObjectIsNotAliveException{
        if (!s1.isAlive){
            throw new ObjectIsNotAliveException();
        }
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        if (isAlive != entity.isAlive) return false;
        return name.equals(entity.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (isAlive ? 1 : 0);
        return result;
    }
}

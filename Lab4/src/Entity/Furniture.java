package Entity;

public class Furniture extends Entity{

    public Furniture(String name, boolean isAlive) {
        super(name, isAlive);
    }

    @Override
    public String toString(){

        return this.getName();
    }
}

package Scene;

import Entity.Furniture;
import Printer.ConsolePrinter;

import java.util.Arrays;

public abstract class AbstractScene {

    private String name;

    boolean isDark = false;

    private Furniture[] furniture;

    public AbstractScene(boolean isDark){
        this.isDark = isDark;
    }
    public AbstractScene(String name, Furniture[] furniture){
        this.name = name;
        this.furniture = furniture;
    }
    public void getFurniture() {
        ConsolePrinter.print("В комнате была мебель:");
        for (int i = 0; i < furniture.length; i++){
            ConsolePrinter.print(furniture[i].toString());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeTime(){
        this.isDark = !(isDark);

        if (this.isDark == true) {
            ConsolePrinter.print("Потемнело");
        }
        else {
            ConsolePrinter.print("Посветлело");
        }
    }

    public void getBedName() {
    }

    @Override
    public String toString() {
        return "AbstractScene{" +
                "isDark=" + isDark +
                ", number=" + name +
                ", furniture=" + Arrays.toString(furniture) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scene)) return false;

        AbstractScene that = (AbstractScene) o;

        if (isDark != that.isDark) return false;
        if (name != that.name) return false;

        return Arrays.equals(furniture, that.furniture);
    }

    @Override
    public int hashCode() {
        int result = (isDark ? 1 : 0);
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(furniture);
        return result;
    }

    public void specialMove(){
        return;
    }

    public String getName() {
        return name;
    }
}

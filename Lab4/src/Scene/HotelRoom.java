package Scene;

import Entity.Furniture;
import Printer.ConsolePrinter;
import Printer.PrinterInterface;

public class HotelRoom extends AbstractScene {

    public HotelRoom(String name, Furniture[] furniture){
        super("Room " + name,furniture);
    }

    FlipBed bed = new FlipBed("Откидушка");

    public void getBedName(){
        bed.printer.print();
    }

    @Override
    public void specialMove(){
        ConsolePrinter.print("Сантик");
    }

    //Вложенный класс
    class FlipBed{
        String name;

        public FlipBed(String name){
            this.name = name;
        }
        //Анонимный класс
        PrinterInterface printer = new PrinterInterface() {
            @Override
            public  void print(){
                System.out.print(name);
            }
        };

    }
}

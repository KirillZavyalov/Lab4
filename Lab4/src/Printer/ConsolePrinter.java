package Printer;

public class ConsolePrinter implements  PrinterInterface{

    private String string;

    public ConsolePrinter(String string){
        this.string = string;
    }

    public static void print(String string){
        System.out.println(string);
    }

    @Override
    public void print() {

    }

}

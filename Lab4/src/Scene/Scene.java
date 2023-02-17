package Scene;

import Printer.ConsolePrinter;

public class Scene extends AbstractScene {
    public Scene(String name, boolean isDark) {
        super(isDark);
    }

    public void changeTime(boolean darkness){
        this.isDark = !(isDark);

        if (this.isDark == true) {
            ConsolePrinter.print("Наступила ночь");
        }
        else {
            ConsolePrinter.print("Наступило утро");
        }
    }
    //Вложенный статик
    public static class Curtain{
        static String name = "занавеска";

        public static String getName() {
            return name;
        }
    }
}

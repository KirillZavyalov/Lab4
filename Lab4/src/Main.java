import Entity.*;
import Entity.Creatures.*;
import Entity.Items.Ball;
import Entity.Items.Pie;
import Entity.Items.Porringe;
import Entity.Items.Soup;
import Exceptions.ObjectIsNotAliveException;
import Printer.ConsolePrinter;
import Scene.*;


public class Main {
    public static void main(String[] args) {

        try {
            AbstractScene scene = new Scene("Сцена", false);

            Entity crowd = new Crowd("Толпа", true);
            Entity goat = new Shorty("Козлик", true);
            Entity salesman = new Shorty("Хозяин", true);
            Ball ball = new Ball("мяч", false);
            Entity dumb = new Shorty("Нинайка", true);

            crowd.laugh();

            goat.interactWithScene(scene);

            crowd.throwObj(ball, goat);
            //crowd.throwObj(goat, goat);
            //ball.throwObj(ball, goat);

            ball.hit(goat, BodyParts.FOREHEAD);
            ball.hit(goat, BodyParts.CHEEKS);
            ball.hit(goat, BodyParts.NOSE);
            ball.hit(goat, BodyParts.EAR);

            goat.cry();

            goat.protectBodyPart(BodyParts.EYES);

            salesman.sell(ball);

            dumb.becomeSad();

            scene.changeTime();

            salesman.pay(300, goat);

            Entity pies = new Pie("Пироги", false);
            Entity porridge = new Porringe("Пироги", false);
            Entity soup = new Soup("Пироги", false);

            //soup.laugh(); - Проверка на исключение. Суп не смеется.

            pies.getEaten(goat);
            porridge.getEaten(dumb);
            soup.getEaten(goat);

            dumb.payWithSomeone(dumb, goat, 50);

            Furniture table = new Furniture("стол", false);
            Furniture chairs = new Furniture("стулья", false);
            Furniture wardrobe = new Furniture("шкаф", false);
            Furniture sink = new Furniture("умывальник", false);
            Furniture tv = new Furniture("телевизор", false);
            Furniture[] furnitureList = new Furniture[]{table, sink, wardrobe, chairs, tv};

            AbstractScene hotelRoom = new HotelRoom("69", furnitureList);

            hotelRoom.getFurniture();

            hotelRoom.specialMove();

            hotelRoom.changeTime();
            goat.payToScene(1, hotelRoom);
            hotelRoom.changeTime();

            ConsolePrinter.print("В комнате были кровати типа: ");
            hotelRoom.getBedName();

            ConsolePrinter.print("\nКонец.");
        }
        catch (ObjectIsNotAliveException e){
            ConsolePrinter.print(e.getMessage());
        }
    }
}
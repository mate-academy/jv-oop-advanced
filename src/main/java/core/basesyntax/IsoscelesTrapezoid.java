package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{

    @Override
    public void draw() {
        System.out.println("Рисую трапецию");
    }

    @Override
    public String getName() {
        return "Трапеция";
    }

    @Override
    public void unicMetod() {
        System.out.println("Метод трапеции");
    }
}

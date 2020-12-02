package core.basesyntax;

public class Square extends Figure {

    @Override
    public void draw() {
        System.out.println("Рисую квадрат");
    }

    @Override
    public String getName() {
        return "Квадрат";
    }

    @Override
    public void unicMetod() {
        System.out.println("Метод квадрата");
    }
}

package core.basesyntax;

public class Rectangle extends Figure {

    @Override
    public void draw() {
        System.out.println("Рисую триугольник");
    }

    @Override
    public String getName() {
        return "Триугольник";
    }

    @Override
    public void unicMetod() {
        System.out.println("Метод триугольника");
    }
}

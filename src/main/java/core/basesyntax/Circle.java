package core.basesyntax;

public class Circle extends Figure {

    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }

    @Override
    public String getName() {
        return "Круг";
    }

    @Override
    public void unicMetod() {
        System.out.println("Метод круга");
    }
}

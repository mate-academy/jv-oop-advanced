package core.basesyntax;

public class RightTriangle extends Figure {

    @Override
    public void draw() {
        System.out.println("Рисую правильный триугольник");
    }

    @Override
    public String getName() {
        return "Правильный триугольник";
    }

    @Override
    public void unicMetod() {
        System.out.println("Метод правильного триугольника");
    }
}

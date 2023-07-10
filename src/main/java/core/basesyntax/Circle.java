package core.basesyntax;

public class Circle extends Figure{
    private int radius;

    public Circle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {

    }
}

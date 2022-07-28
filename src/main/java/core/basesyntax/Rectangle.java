package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public void draw() {

    }

    @Override
    public double calculateArea() {
        return 0;
    }
}

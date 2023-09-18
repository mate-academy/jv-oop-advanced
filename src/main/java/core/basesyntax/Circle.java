package core.basesyntax;

public class Circle extends Figure implements Drawable, AreaCalculator {
    private double radius;

    public Circle(String color) {
        super(color);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}

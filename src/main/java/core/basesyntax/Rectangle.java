package core.basesyntax;

public class Rectangle extends Figure implements Drawable, AreaCalculator {
    private double height;
    private double width;

    public Rectangle(String color) {
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

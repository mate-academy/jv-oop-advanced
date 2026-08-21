package core.basesyntax;

public class Rectangle extends Figure implements Drawable, AreaCalculator {
    private int length;
    private int width;

    @Override
    public void draw() {

    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

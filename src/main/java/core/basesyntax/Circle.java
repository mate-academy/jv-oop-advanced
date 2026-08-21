package core.basesyntax;

public class Circle extends Figure implements Drawable, AreaCalculator {
    private int radius;

    @Override
    public void draw() {

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

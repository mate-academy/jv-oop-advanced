package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private double sideLength;

    public Square(String color) {
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

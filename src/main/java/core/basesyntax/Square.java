package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Square | side length: %.2f | area: %.2f | color: %s\n", sideLength, calculateArea(), getColor());
    }
}

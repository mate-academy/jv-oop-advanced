package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSideLength;
    private double secondSideLength;

    public Rectangle(double firstSideLength, double secondSideLength, String color) {
        super(color);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    @Override
    public double calculateArea() {
        return firstSideLength * secondSideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + (int) calculateArea()
                + " sq.units, firstSideLength: " + (int) firstSideLength
                + " units, secondSideLength: " + (int) secondSideLength
                + " units, color: " + getColor());
    }
}


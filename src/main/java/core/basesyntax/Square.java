package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength, String color) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + (int) calculateArea()
                + " sq.units, sideLength: " + (int) sideLength
                + " units, color: " + getColor());
    }
}

package core.basesyntax;

public class Square extends Figure {
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
        System.out.println("Figure: square "
                + "area: " + calculateArea() + " sq. units, "
                + "sideLength: " + sideLength + " units, "
                + "color: " + getColor().toLowerCase());
    }
}

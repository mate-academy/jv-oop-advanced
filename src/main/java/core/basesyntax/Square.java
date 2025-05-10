package core.basesyntax;

public class Square extends Figure {
    private int sideLength;

    public Square(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + sideLength
                + " units, color: " + getColor().toLowerCase());
    }
}

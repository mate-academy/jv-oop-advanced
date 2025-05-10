package core.basesyntax;

public class Square extends Figure {
    private int sideLength;

    public Square(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square"
                + " area: " + getArea()
                + " sq.units,"
                + " side: " + sideLength
                + " units,"
                + " color: " + getColor());
    }
}

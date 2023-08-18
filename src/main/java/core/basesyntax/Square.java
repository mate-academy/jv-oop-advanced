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
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() +
                " sq.units, side length: " + sideLength +
                ", color: " + getColor());
    }
}

package core.basesyntax.model;

public class Square extends Figure {
    private final int sideLength;

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
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", square: " + getArea() + " sq.units, color: "
                + getColor() + ", side: " + sideLength);
    }
}

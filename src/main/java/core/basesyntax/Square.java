package core.basesyntax;

public class Square extends Figure {
    private final int sideLength;

    public Square(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double obtainTheArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + obtainTheArea()
                + " sq. units, sideLength: " + sideLength + " units, color: "
                + getColor().toLowerCase().toLowerCase());
    }
}

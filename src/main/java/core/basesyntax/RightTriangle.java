package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String NAME = "rightTriangle";
    private final int firstSide;
    private final int secondSide;

    public RightTriangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {

        return firstSide * secondSide / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + getArea()
                + " sq.units, side: " + firstSide + " units," + " side: " + secondSide
                + " units," + " side: " + firstSide + " units," + "color: " + color);
    }
}

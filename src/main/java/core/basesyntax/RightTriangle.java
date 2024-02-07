package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (double) (firstSide * secondSide) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + getArea()
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, color: " + getColor().toLowerCase());
    }
}

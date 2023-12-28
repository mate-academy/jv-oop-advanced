package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public RightTriangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + String.format("%.2f", getArea()) + " sq. units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return (double) (firstSide * secondSide) / 2;
    }
}

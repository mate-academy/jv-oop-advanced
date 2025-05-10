package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.round(((firstBase + secondBase) / 2) * height);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first base: " + firstBase + " units, second base: "
                + secondBase + " units, height: " + height + " units, color: " + getColor());
    }
}

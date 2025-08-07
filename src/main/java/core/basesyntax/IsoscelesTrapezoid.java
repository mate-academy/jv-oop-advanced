package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (secondBase + firstBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.2f sq. units, first base: "
                        + "%.2f units, second base: %.2f units, height: "
                        + "%.2f units, color: %s%n",
                getArea(), firstBase, secondBase, height, getColor());
    }
}

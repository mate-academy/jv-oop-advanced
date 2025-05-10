package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, Color color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.round((firstBase + secondBase) * 0.5 * height * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + getArea()
                + ", first base: " + firstBase + ", second base: " + secondBase
                + ", color: " + color
        );
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) * height) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, Figure first base, second base, height: "
                + firstBase
                + ", "
                + secondBase
                + ", "
                + height
                + ", Area: "
                + getArea()
                + ", Color: "
                + getColor());
    }
}

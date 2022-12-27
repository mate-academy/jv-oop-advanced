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
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid - " + "area: " + getArea()
                + "sq.units, " + " firstBase: " + this.firstBase
                + " secondBase: " + this.secondBase
                + " height: " + this.height + " units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid area: "
                + calculateArea()
                + " sq.units, baseOne: "
                + firstBase
                + " sq.units, BaseTwo: "
                + secondBase
                + " units, color: "
                + getColor());
    }
}

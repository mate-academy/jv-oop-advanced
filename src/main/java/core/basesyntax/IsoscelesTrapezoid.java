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
        System.out.println("Figure: Isosceles Trapezoid, " + "area: " + area()
                + "sq.units, " + "firstBase: " + this.firstBase
                + "secondBase: " + this.secondBase
                + "height: " + this.height + " units, "
                + "color: " + this.getColor());
    }

    @Override
    public double area() {
        return ((firstBase + secondBase) / 2) * height;
    }
}


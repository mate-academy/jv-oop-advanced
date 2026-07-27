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
        return (firstBase + secondBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + "units, firstBase: " + firstBase
                + "units, secondBase: " + secondBase
                + "units, height: " + height
                + "units, color: " + getColor()
        );
    }

}

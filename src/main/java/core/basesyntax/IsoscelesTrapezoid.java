package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private static final int DIVISOR = 2;
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(Colors color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (firstSide + secondSide) / DIVISOR * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + calculateArea()
                + " sq. units, base1: " + firstSide + " units, base2: " + secondSide + " units, height: "
                + height + " units, color: " + color.name());
    }
}

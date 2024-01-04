package core.basesyntax;

public abstract class IsoscelesTrapezoid extends AbstractFigure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(double sideA,
                              double sideB, double height,
                              Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public IsoscelesTrapezoid(double sideA,
                              double sideB,
                              double height) {
        this(sideA, sideB, height, AbstractFigure.getRandomColor());
    }

    @Override
    public double getArea() {

        return 0.5 * (sideA + sideB) * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing: isosceles"
                + " trapezoid, area: " + getArea() + " sq. "
                + "ode, side A: " + sideA + " od., side B: "
                + sideB + " od., height: " + height + " od., "
                + "color: " + color);
    }

    public abstract Color getColor();
}

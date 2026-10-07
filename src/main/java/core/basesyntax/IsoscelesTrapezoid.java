package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(Color color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (double) 1 / 2 * (sideA + sideB) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calcArea()
                + " sq. units, side A: " + sideA + " units, side B: " + sideB
                + " units, height: " + height + " units, color: " + getColor()
        );
    }
}

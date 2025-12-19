package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height, String color) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public double getBaseA() {
        return baseA;
    }

    public double setBaseA() {
        return baseA;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2 * height;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstBase: " + baseA
                + " units, secondBase: " + baseB
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}

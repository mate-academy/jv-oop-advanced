package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units,"
                + " baseA: " + baseA + ", baseB: " + baseB
                + ", height: " + height + ",  color: " + getColor());
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2;
    }
}

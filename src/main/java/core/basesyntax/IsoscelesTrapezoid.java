package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseA, double height, double baseB) {
        super(color);
        this.baseA = baseA;
        this.height = height;
        this.baseB = baseB;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + getArea()
                    + " sq. units, baseA: " + baseA
                    + " units, baseB: " + baseB
                    + " units, height: " + height
                    + " units, color: " + getColor()
        );
    }
}

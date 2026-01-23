package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    protected double calculateArea() {
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units" +
                ", baseA: " + baseA + " units" +
                ", baseB: " + baseB + " units" +
                ", height: " + height + " units" +
                ", color: " + getColor());
    }
}


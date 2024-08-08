package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public static final double COEFFICIENT = 0.5;
    private final double baseB;
    private final double baseA;
    private final double height;

    public IsoscelesTrapezoid(
            double height,
            double baseA,
            double baseB,
            String color,
            String name
    ) {
        super(color,name);
        this.height = height;
        this.baseA = baseA;
        this.baseB = baseB;
    }

    public double getHeight() {
        return height;
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    @Override
    public double getArea() {
        return (getBaseA() + getBaseB()) * getHeight() * COEFFICIENT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, hight: "
                + getHeight() + " units, base A: " + baseA + " units, base B: " + getBaseB()
                + " units, color: " + getColor());
    }
}

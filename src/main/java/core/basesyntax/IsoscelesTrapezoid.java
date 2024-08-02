package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double baseB;
    private double baseA;
    private double height;

    public IsoscelesTrapezoid(
            double height,
            double baseA,
            double baseB,
            String color,
            String name
    ) {
        this.height = height;
        this.baseA = baseA;
        this.baseB = baseB;
        setColor(color);
        setName(name);
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
    public String toString() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units, hight: "
                + getHeight() + " units, base A: " + baseA + " units, base B: " + getBaseB()
                + " units, color: " + getColor();
    }
}

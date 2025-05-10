package core.basesyntax.figures;

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

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, " + "area: " + calculateArea()
                + " sq. units, topBase: " + baseA
                + " units, bottomBase: " + baseB
                + " units, height: " + height
                + " units, color: " + getColor().toLowerCase());
    }
}

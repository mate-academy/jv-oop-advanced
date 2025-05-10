package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public int getBaseA() {
        return baseA;
    }

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public int getBaseB() {
        return baseB;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (baseA + baseB) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "base A: " + getBaseA() + " units, "
                + "base B: " + getBaseB() + " units, "
                + "height: " + getHeight() + " units, "
                + "color: " + getColor().toLowerCase());
    }
}

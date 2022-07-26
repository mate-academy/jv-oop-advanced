package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.getBaseA() + this.getBaseB()) * this.getHeight() / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: isosceles trapezoid, area: "
                + this.getArea() + " sq.units, baseA: "
                + this.getBaseA() + " units, baseB: "
                + this.getBaseB() + " units, "
                + "height: " + this.getHeight() + " units, color: "
                + this.getColor());
    }

    public int getHeight() {
        return this.height;
    }

    public int getBaseB() {
        return this.baseB;
    }

    public int getBaseA() {
        return this.baseA;
    }

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

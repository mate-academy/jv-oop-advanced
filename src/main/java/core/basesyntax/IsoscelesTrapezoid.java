package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int side;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int side) {
        super("isosceles trapezoid", color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((this.baseA + this.baseB) / 2) * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, base A length: "
                + getBaseA() + " units, base B length: "
                + getBaseB() + " units, side length: "
                + getSide() + " units, color: "
                + getColor());
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

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle,"
                + " area: " + getArea() + " sq.units"
                + ", sideA: " + this.sideA
                + ", sideB: " + this.sideB
                + ", color: " + this.color);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}

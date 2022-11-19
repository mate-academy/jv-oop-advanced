package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area:" + this.getArea() + " sq.units, sideA: "
                + sideA + "units, sideB: " + sideB + " units, color: " + this.getColor());
    }
}

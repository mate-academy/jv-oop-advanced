package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + "sq. units, sideA: "
                + sideA + ", sideB: "
                + sideB + ", color: "
                + getColor() + ".");
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}

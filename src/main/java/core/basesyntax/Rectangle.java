package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void printInfo() {
        setArea(sideA * sideB);
        System.out.println("Figure: rectangle, area: " + getArea() + ", side a: " + sideA + ", side b: " + sideB + ", color: " + getColor());
    }
}

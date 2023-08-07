package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area() + " sq.units, sideA: " + sideA + " units, sideB:" + sideB + " units, color: " + color.toLowerCase());
    }

    @Override
    public double area() {
        return (double)sideA*sideB;
    }
}

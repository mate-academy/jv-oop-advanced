package core.basesyntax;

public class Rectangle extends Figure implements Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setParameters(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return Math.round(sideA * sideB);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, side weight: "
                + sideB + " units, color: " + getColor());
    }
}

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
    public void draw() {
        System.out.println("This " + getColor() + " rectangle has sides "
                + sideA + " and " + sideB + " and area " + getArea());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}

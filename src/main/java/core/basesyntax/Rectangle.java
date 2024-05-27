package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.firstSide = a;
        this.secondSide = b;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, first side: "
                + firstSide + " units, second side: " + secondSide + ", color: " + getColor());
    }
}

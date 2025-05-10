package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, color: " + getColor() + ", side1: " + side1
                + ", side 2: " + side2 + ", area: " + areaCalculate());
    }

    @Override
    public double areaCalculate() {
        return (side1 * side2);
    }
}

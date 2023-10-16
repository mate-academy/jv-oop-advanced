package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public void drow() {
        System.out.println("Figure: rectangle, color: " + getColor() + ", side1: " + side1
                + ", side 2: " + side2 + ", area: " + getArea());
    }

    @Override
    public void areaObtain() {
        setArea(side1 * side2);
    }
}

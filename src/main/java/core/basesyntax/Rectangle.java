package core.basesyntax;

public class Rectangle extends Figure {
    private int base;
    private int height;

    public Rectangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height;
    }

    public void drawInfo() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, base: " + base
                + ", height " + height + ", color: " + getFigureColor());
    }
}

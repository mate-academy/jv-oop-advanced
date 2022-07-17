package core.basesyntax;

public class Rectangle extends Figure {

    private int base;
    private int height;

    public Rectangle(int base, int height, String figureColor) {
        super(figureColor);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        double area = base * height;
        return area;
    }

    public void drawInfo() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, base: " + base
                + ", height " + height + ", color: " + getFigureColor());
    }
}

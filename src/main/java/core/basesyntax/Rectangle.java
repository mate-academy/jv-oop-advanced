package core.basesyntax;

public class Rectangle extends Figure {
    private int base;
    private int height;

    public Rectangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea()
                + " sq. units, base: "
                + base
                + ", height: "
                + height
                + ", color: "
                + getColor());
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String NAME = "isosceles trapezoid";
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(int base, int top, int height, String color) {
        this.base = base;
        this.top = top;
        this.height = height;
        setColor(color);
        setName(NAME);
        calculateArea();
    }

    public IsoscelesTrapezoid() {
        setName(NAME);
    }

    @Override
    public void calculateArea() {
        setArea(((base + top) / 2) * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + " sq.units, "
                + "base: " + base
                + " units, top: " + top
                + " units, height: " + height + " units, "
                + "color: " + getColor()
        );
    }
}

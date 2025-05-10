package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(int base, int top, int height, String color) {
        this();
        this.base = base;
        this.top = top;
        this.height = height;
        setColor(color);
        calculateArea();
    }

    public IsoscelesTrapezoid() {
        super(FigureType.ISOSCELES_TRAPEZOID.name());
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

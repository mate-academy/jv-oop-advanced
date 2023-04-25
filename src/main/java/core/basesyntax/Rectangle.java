package core.basesyntax;

public class Rectangle extends Figure {
    private final double base;
    private final double height;

    public Rectangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq.units, base: "
                + base
                + " units, height: "
                + height
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}

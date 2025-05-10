package core.basesyntax;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle area: "
                + calculateArea()
                + " sq.units, base: "
                + base
                + " sq.units, height "
                + height
                + " units, color: "
                + getColor());
    }
}

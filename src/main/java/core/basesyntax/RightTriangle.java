package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int base;

    public RightTriangle(String type, String colour, String property, int height, int base) {
        super(type, colour, property);
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (double) base / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getType() + ", " + calculateArea() + " sq. units, height: "
                + height + " units, base: " + base + " units, color: "
                + getColour() + ", property: " + getProperty());
    }
}

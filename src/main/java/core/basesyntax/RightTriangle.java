package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Right Triangle, area: " + calculateArea()
                + " sq. units, base: " + base
                + " units, height: " + height
                + " units, color: " + super.getColor());
    }
}

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(int base, int height, String color) {
        super(color, "right triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String draw() {
        return "Shape: " + getFigure() + ", area: " + getArea() + " sq. units"
                    + ", base: " + base + ", height: " + height
                    + " units, color: " + getColor();
    }

}

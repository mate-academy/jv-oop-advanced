package core.basesyntax;

public class RightTriangle extends Figure {
    private double height;
    private double base;

    public RightTriangle(double height, double base, Color color) {
        this.height = height;
        this.base = base;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle:\n"
                + " height: " + height
                + " base: " + base
                + " color:" + getColor()
                + " area: " + getArea());
    }
}

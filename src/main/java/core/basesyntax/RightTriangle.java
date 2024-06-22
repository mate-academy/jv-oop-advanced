package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + String.format("%.2f", getArea())
                + " sq. cm, base: " + String.format("%.2f", base) + " sq. cm, height: "
                + String.format("%.2f", height) + " cm, color: " + color);
    }
}

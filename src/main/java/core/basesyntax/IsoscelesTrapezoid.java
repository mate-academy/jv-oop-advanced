package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseTop;
    private int baseBottom;
    private int height;

    public IsoscelesTrapezoid(String color, int height, int baseTop, int baseBottom) {
        super("isosceles trapezoid", color);
        this.height = height;
        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
    }

    @Override
    public double getArea() {
        return (baseTop + baseBottom) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + String.format("%.2f", getArea())
                + " sq. units, base top: " + baseTop + " units, base bottom: " + baseBottom
                + " units, height: " + height + " units, color: " + color + ".");
    }
}

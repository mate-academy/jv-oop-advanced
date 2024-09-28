package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private double base;
    private double side;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double base, double side, double height, String color) {
        this.base = base;
        this.side = side;
        this.height = height;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0.5 * (base + side) * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, "
                + "area %.2f, base: %.2f, side: %.2f, height: %.2f, color: %s",
                getArea(), base, side, height, color));
    }
}

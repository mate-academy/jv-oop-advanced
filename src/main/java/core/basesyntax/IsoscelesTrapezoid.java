package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private Color color;
    private double basis1;
    private double basis2;
    private double height;

    public IsoscelesTrapezoid(Color color, double basis1, double basis2, double height) {
        this.color = color;
        this.basis1 = basis1;
        this.basis2 = basis2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (basis1 + basis2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " square units, base1: "
                + basis1 + " units, base2: "
                + basis2 + " units, height: "
                + height + " units, color: "
                + getColor());
    }

    @Override
    public Color getColor() {
        return color;
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final double basis1;
    private final double basis2;
    private final double height;
    private Color color;

    public String figureInfo() {
        return "Figure : Isosceles Trapezoid, Area :" + getArea() +
                " Basis1: " + basis1 + " Basis2: " + basis2 + " Height: " + height + " Color: " + color;
    }

    public IsoscelesTrapezoid(int basis1, int basis2, int height, Color color) {
        this.basis1 = basis1;
        this.basis2 = basis2;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((basis1 + basis2) / 2) * height;
    }
}

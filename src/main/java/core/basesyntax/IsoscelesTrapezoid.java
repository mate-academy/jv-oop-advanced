package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double basis1;
    private final double basis2;
    private final double height;

    public IsoscelesTrapezoid(int basis1, int basis2, int height, Color color) {
        this.basis1 = basis1;
        this.basis2 = basis2;
        this.height = height;
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure : Isosceles Trapezoid, Area :" + getArea()
                + " Basis1: " + basis1 + " Basis2: " + basis2 + " Height: "
                + height + " Color: " + color.name());
    }

    @Override
    public double getArea() {
        return ((basis1 + basis2) / 2) * height;
    }
}

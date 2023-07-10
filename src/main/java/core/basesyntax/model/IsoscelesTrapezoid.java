package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int basis1;
    private int basis2;

    public IsoscelesTrapezoid(int height, int basis1, int basis2, String color) {
        super(color);
        this.height = height;
        this.basis1 = basis1;
        this.basis2 = basis2;

    }

    @Override
    public double getArea() {
        return ((basis1 + basis2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid , area: " + getArea() + " m2, " + "height: "
                + height + " m, " + "basis1: " + basis1 + " m, " + "basis2: " + basis2 + " m, "
                + " color: " + getColor());
    }

}

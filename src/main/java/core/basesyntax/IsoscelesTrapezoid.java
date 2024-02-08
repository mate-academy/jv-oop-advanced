package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double firstBasis;
    private final double secondBasis;

    public IsoscelesTrapezoid(double height, double firstBasis, double secondBasis, String color) {
        this.height = height;
        this.firstBasis = firstBasis;
        this.secondBasis = secondBasis;
    }

    @Override
    public double getArea() {
        return (firstBasis + secondBasis) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", Color: " + color + ", area: "
                + getArea());
    }
}

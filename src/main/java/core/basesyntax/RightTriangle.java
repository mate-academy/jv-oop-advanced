package core.basesyntax;

public class RightTriangle extends Figure {
    private int width;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public RightTriangle() {
    }

    @Override
    public double getArea() {
        return 0.5 * getHeight() * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + new RightTriangle()
                + "area: " + new RightTriangle().getArea() + " sq.units"
                + "side: " + width + "units"
                + "color: " + colorSupplier.getRandomColor());
    }
}

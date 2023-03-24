package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return getHeight() * width;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + new Rectangle()
                + "area: " + new Rectangle().getArea() + " sq.units"
                + "side: " + width + "units"
                + "color: " + colorSupplier.getRandomColor());
    }
}

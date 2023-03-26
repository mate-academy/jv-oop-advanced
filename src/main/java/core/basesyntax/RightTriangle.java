package core.basesyntax;

public class RightTriangle extends Figure {

    public RightTriangle() {
    }

    public RightTriangle(int getHeight, int getWidth, Color color) {
    }

    @Override
    public double getArea() {
        return 0.5 * getHeight() * getWidth();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + new RightTriangle()
                + "area: " + new RightTriangle().getArea() + " sq.units"
                + "side: " + getWidth() + "units"
                + "color: " + getColorSupplier().getRandomColor());
    }
}

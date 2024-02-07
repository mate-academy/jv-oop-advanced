package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int width;

    public RightTriangle() {
    }

    public RightTriangle(int getHeight, int getWidth, String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + "area: " + this.getArea() + " sq.units"
                + "side: " + width + " units"
                + "color: " + this.color);
    }
}

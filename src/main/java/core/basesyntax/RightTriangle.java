package core.basesyntax;

public class RightTriangle extends Figure {

    public RightTriangle() {
    }

    public RightTriangle(int getHeight, int getWidth, String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * getHeight() * getWidth();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + "area: " + this.getArea() + " sq.units"
                + "side: " + getWidth() + " units"
                + "color: " + this.color);
    }
}

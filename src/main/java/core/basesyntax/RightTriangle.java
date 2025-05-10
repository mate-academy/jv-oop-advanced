package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideR;
    private int height;

    public RightTriangle(int sideR, int height, String color) {
        super(color);
        this.sideR = sideR;
        this.height = height;
    }

    @Override
    public double getArea() {
        return sideR * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + " area: " + getArea() + " sq.units, sideR: " + sideR + " height: " + height
                + getColor());
    }
}

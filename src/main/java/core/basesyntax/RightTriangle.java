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
    public void draw() {
    }

    @Override
    public double getArea() {
        return sideR * height;
    }
}

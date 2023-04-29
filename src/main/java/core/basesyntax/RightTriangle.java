package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideR;
    private int height;
    private String color;

    public RightTriangle(int sideR, int height, String color) {
        this.sideR = sideR;
        this.height = height;
        this.color = color;
    }

    @Override
    public void getDraw() {
        super.getDraw();
    }

    @Override
    public double getArea() {
        return sideR * height;
    }
}

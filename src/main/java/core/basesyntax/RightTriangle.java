package core.basesyntax;

public class RightTriangle extends Figure {
    private final int height;
    private final int leg;

    public RightTriangle(String color, int height, int leg) {
        super(color);
        this.height = height;
        this.leg = leg;
    }

    @Override
    public void draw() {
        System.out.print("Figure: RightTriangle, height: " + height + ", leg: " + leg);
        super.draw();
    }

    @Override
    public double area() {
        return 0.5 * height * leg;
    }
}

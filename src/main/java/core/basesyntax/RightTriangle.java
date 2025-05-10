package core.basesyntax;

public class RightTriangle extends Figure {
    private int oneSide;
    private int height;

    public RightTriangle(String color, int oneSide, int height) {
        super(color);
        this.oneSide = oneSide;
        this.height = height;
    }

    @Override
    public double area() {
        return (double)(oneSide * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, color: "
                + getColor()
                + " area: "
                + area());

    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private final int triangleHeight;
    private final int triangleBase;

    public RightTriangle(String color, int triangleHeight, int triangleBase) {
        super(color);
        this.triangleHeight = triangleHeight;
        this.triangleBase = triangleBase;
    }

    @Override
    public double getArea() {
        return (double) 1 / 2 * triangleBase * triangleHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right-Triangle "
                + "\n"
                + "Area: "
                + getArea()
                + "\n"
                + "Triangle Height: "
                + triangleHeight
                + "\n"
                + "Triangle Base: "
                + triangleBase
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

}

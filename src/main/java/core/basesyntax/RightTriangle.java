package core.basesyntax;

public class RightTriangle implements Figure, FigureDraw {
    private double rightTriangleBase;
    private double rightTriangleHeight;
    private String color;

    private static final int DIVISOR = 2;

    public RightTriangle(double rightTriangleBase, double rightTriangleHeight, String color) {
        this.rightTriangleBase = rightTriangleBase;
        this.rightTriangleHeight = rightTriangleHeight;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (rightTriangleBase * rightTriangleHeight) / DIVISOR;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, base: " + rightTriangleBase + " units, height: " + rightTriangleHeight
                + " units, color: " + color);
    }
}

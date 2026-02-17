package core.basesyntax;

public class RightTriangle implements Figure {
    private double rightTriangleBase;
    private double rightTriangleHight;
    private String color;

    public RightTriangle(double rightTriangleBase, double rightTriangleHight, String color) {
        this.rightTriangleBase = rightTriangleBase;
        this.rightTriangleHight = rightTriangleHight;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (rightTriangleBase * rightTriangleHight) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, base: " + rightTriangleBase + " units, height: " + rightTriangleHight
                + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}

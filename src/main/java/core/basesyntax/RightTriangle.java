package core.basesyntax;

public class RightTriangle extends Figure {
    private final double sideA;
    private final double height;

    public RightTriangle(String color, double sideA, double height) {
        super(color);
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public double getArea() {
        return sideA * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area = " + getArea()
                + " square units, side a = " + sideA + " units, height ="
                + height + " units, color = " + color);
    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int base;
    private String color = getColor();

    public RightTriangle(int side, int base, String color) {
        this.side = side;
        this.base = base;
        this.color = color;
    }

    @Override
    public double areaCalculator() {
        return (double) (side * base) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + areaCalculator()
                + ", first leg: " + side + ", second leg: " + base
                + ", color: " + color);
    }
}

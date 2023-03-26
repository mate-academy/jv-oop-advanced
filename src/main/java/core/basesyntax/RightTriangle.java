package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side;

    public RightTriangle(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + String.format("%.2f", getArea()) +
                ", side: " + side + ", color: " + color);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
}

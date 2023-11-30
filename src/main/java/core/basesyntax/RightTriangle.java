package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int height;

    public RightTriangle(int side, int height, String color) {
        this.side = side;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, side: " + side
                + " units, " + "height: " + height
                + " units," + " color: " + color);
    }

    @Override
    public double getArea() {
        return (double) (side * height) / 2;
    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side;
    private final int height;

    public RightTriangle(String color, int side, int height) {
        super(color, FigureType.RIGHT_TRIANGLE);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return side * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea()
                + " sq.units, side: " + side
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}

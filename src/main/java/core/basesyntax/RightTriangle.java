package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int height;

    public RightTriangle(Color color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * side * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right tringle, area: " + getArea()
                + ", side: " + side
                + ", height: " + height
                + ", color: " + getColor());
    }
}

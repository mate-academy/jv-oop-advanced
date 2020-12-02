package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int side;

    public RightTriangle(Colors color, int height, int side) {
        super(0.5 * height * side, color);
        this.height = height;
        this.side = side;
    }

    @Override
    public void drawingFigures() {
        System.out.println("Figure: right rectangle, area: " + getArea() + " sq. units, "
                + "height length: " + height + " units, "
                + "side length: " + side + " units, "
                + "color = " + getColor());
    }
}

package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
        draw();
    }

    @Override
    public void draw() {
        area = this.side * this.side / 2;
    }

    @Override
    public String toString() {
        return "Figure: triangle, area: " + area
                + " sq. units, sides: " + side + ", color: " + color;
    }
}

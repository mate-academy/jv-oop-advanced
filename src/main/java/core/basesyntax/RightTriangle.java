package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(Color color, int side) {
        super(color);
        this.side = side;
        calculate();
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + area
                + " sq. units, sides: " + side + ", color: " + color);
    }

    @Override
    public void calculate() {
        area = this.side * this.side / 2;
    }

    public int getSide() {
        return side;
    }
}

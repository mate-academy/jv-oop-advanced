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
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq. units, sides: " + side + ", color: " + getColor());
    }

    @Override
    public void calculate() {
        setArea(this.side * this.side / 2);
    }

    public int getSide() {
        return side;
    }
}

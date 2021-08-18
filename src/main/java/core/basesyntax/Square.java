package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        super();
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square,"
                + " area: " + getArea() + " sq.units"
                + ", side: " + this.side
                + ", color: " + this.color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "side=" + side
                + ", color=" + getColor()
                + '}';
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square"
                + ", area=" + this.getArea()
                + " sq.units"
                + "side=" + side
                + " units"
                + ", color=" + getColor());
    }
}

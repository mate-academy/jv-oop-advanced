package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, color: " + getColor());
    }
}

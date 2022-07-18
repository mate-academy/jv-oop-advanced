package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void drawInfo() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side
                + ", color: " + getFigureColor());
    }
}

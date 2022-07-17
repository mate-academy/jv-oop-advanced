package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(int side, String figureColor) {
        super(figureColor);
        this.side = side;
    }

    public double getArea() {
        double area = side * side;
        return area;
    }

    public void drawInfo() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side
                + ", color: " + getFigureColor());
    }
}

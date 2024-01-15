package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        super();
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + this.getArea() + " sq.units, side: "
                + this.side + " units, color: " + super.color);
    }
}

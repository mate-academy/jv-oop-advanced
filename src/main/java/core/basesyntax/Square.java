package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(side * side, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, "
                + "side length: " + getSide() + " units, "
                + "color = " + getColor());
    }
}



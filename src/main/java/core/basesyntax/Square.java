package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(side * side, color);
        this.side = side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, "
                + "side length: " + side + " units, "
                + "color = " + getColor());
    }
}



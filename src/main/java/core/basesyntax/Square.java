package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Colors color, int side) {
        super(side * side, color);
        this.side = side;
    }

    @Override
    public void drawingFigures() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, "
                + "side length: " + side + " units, "
                + "color = " + getColor());
    }
}



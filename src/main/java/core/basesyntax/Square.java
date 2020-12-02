package core.basesyntax;

public class Square implements Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String drawFigure() {
        return "Shape: square, area: " + getSquare() + ", side length: "
                + side + ", color: " + getColor();
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public Color getColor() {
        return new ColorProducer().insertRandomColor();
    }
}

package core.basesyntax;

public class Square implements Figure {
    private int side;
    private Color color;

    public String figureInfo() {
        return "Figure : Square, Area :" + getArea() + " Side: " + side + " Color: " + color;
    }

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

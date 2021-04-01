package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color, String id) {
        super(id,color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String drawFigure() {
        return "Figure:" + getId()
                + ", Area " + calculateArea()
                + " sq, "
                + "side length " + side
                + ", color " + getColor();
    }
}

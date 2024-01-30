package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        calcArea();
    }

    @Override
    public void calcArea() {
        setArea(side * side);
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " sq. units, side: "
                + side + " units," + " color: " + getColor();
    }
}

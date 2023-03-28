package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setFigureType("square");
        setColor(color);
        calculateArea();
    }

    @Override
    public void calculateArea() {
        setArea(side * side);
    }

    @Override
    public String toString() {
        return super.toString()
                + getFigureType()
                + ", area: "
                + getArea()
                + " sq.units"
                + ", side: "
                + side
                + " units, color: "
                + getColor();
    }
}

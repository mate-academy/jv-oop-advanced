package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        setFigureType(FigureTypeName.square.toString());
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Drowing a " + getFigureType();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureType() + ", area: "
                + getArea() + " sq.units, side: " + side + " units, color: "
                + getColor();
    }
}

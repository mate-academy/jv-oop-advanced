package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        setFigureType(FigureTypeName.square.toString());
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String drow() {
        return "Drowing a " + getFigureType();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureType() + ", area: "
                + area() + " sq.units, side: " + side + " units, color: "
                + getColor();
    }
}

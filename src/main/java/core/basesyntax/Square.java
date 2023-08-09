package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String type, String color, int side) {
        super(type, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDrawing() {
        return "Figure : " + getType() + ", area: " + getArea()
                + " sq.units, side: " + side + " units, color: "
                + getColor();
    }
}

import core.basesyntax.Figure;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color, "square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Shape: " + getFigure() + ", area: " + getArea() + " sq. units"
                + ", side length: " + side + " units, color: " + getColor();
    }
}

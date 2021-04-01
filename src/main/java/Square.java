import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

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
        return "Shape: " + getName() + ", area: " + getArea() + " sq. units"
                + ", side length: " + side + " units, color: " + getColor();
    }
}

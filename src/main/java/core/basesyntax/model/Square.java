package core.basesyntax.model;

public class Square extends Figure {
    private double side;

    public Square(String name, double area, Color color, double side) {
        super(name, area, color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Figure: " + name
                + ", area: " + area
                + " sq.units, side: " + side
                + " units, color: " + color;
    }
}

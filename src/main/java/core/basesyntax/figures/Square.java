package core.basesyntax.figures;

public class Square extends Figure {
    private final String name = "square";
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, side = " + side
                + " units, color: " + getColor();
    }
}

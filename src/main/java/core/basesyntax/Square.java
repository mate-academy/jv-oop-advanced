package core.basesyntax;

public class Square extends Figure {
    public int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public Square() {

    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + Figures.SQUARE.name() + ", area: "
                + calculateArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor();
    }
}

package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName().toLowerCase() + ", area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + color;
    }
}

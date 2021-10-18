package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) side1 * side2;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName().toLowerCase() + ", area: " + getArea()
                + " sq.units, side 1: " + side1 + " units, side 2: " + side2
                + " units, color: " + color;
    }
}

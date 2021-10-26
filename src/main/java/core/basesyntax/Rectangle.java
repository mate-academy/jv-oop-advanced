package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(String name, int side1, int side2, String color) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    public double getArea() {
        return (double) side1 * side2;
    }

    public String printFigure() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, side1: " + side1
                + " units, side2: " + side2
                + " units, color: " + color;
    }
}

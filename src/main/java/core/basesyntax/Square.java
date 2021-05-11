package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, int side, String color) {
        this.name = name;
        this.side = side;
        this.color = color;
    }

    public double getArea() {
        return (double) side * side;
    }

    public String printFigure() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + color;
    }
}

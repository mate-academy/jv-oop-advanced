package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int height;

    public RightTriangle(String name, int side, int height, String color) {
        this.side = side;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    public double getArea() {
        return ((double) side * height) / 2;
    }

    public String printFigure() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, side: " + side
                + " units, height: " + height
                + " units, color: " + color;
    }
}

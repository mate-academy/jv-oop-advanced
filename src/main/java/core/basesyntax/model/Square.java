package core.basesyntax.model;

public class Square extends Figure {
    private double side;

    public Square(String name, Color color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getAreaReport() {
        return "Figure: " + name
               + ", area = " + getArea() + "sq.units";
    }

    @Override
    public String toString() {
        return "Figure: " + name
               + ", area: " + getArea()
               + " sq.units, side: " + side
               + " units, color: " + color;
    }
}

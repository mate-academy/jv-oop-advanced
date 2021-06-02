package figures;

import behavior.Figure;

public class Square extends Figure {
    private double side;
    private String name = "Square";

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getRandomColor();
    }
}

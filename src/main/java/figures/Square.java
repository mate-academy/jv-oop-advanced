package figures;

import behavior.ColorSupplier;
import behavior.Figure;
import behavior.GetAreaAble;

public class Square extends Figure implements GetAreaAble {
    private final double side;
    private final String name = "Square";

    private ColorSupplier colorSupplier = new ColorSupplier();

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
                + side + " units, color: " + colorSupplier.getRandomColor();
    }
}

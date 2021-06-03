package figures;

import behavior.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}

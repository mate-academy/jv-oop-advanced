package core.basesyntax;

import core.basesyntax.enums.FigureType;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.SQUARE.name().toLowerCase() + " , area: "
                + getArea() + " sq. units, side: "
                + this.side + " units, color: " + getColor());
    }
}

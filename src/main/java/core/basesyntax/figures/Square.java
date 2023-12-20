package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: Square, area: "
                + Math.round(calculateArea() * 10.0) / 10.0 + "sq. units, side: " + side
                + "units, color: " + color.toLowerCase());
    }
}

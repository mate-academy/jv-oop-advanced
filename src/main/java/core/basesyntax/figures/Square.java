package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getSimpleName().toLowerCase() + ", "
                + "area: "
                + this.getArea()
                + " sq. units, "
                + "side: "
                + side
                + " units, "
                + "color: "
                + getColor());
    }
}

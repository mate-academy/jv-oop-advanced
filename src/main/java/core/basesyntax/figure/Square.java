package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureName;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.setFigureName(FigureName.SQUARE);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "side: " + side
                + ", color: " + this.getColor());
    }
}

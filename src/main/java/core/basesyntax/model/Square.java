package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.FigureArea;
import core.basesyntax.service.FigureDrawing;

public class Square extends Figure implements FigureArea, FigureDrawing {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: square, area: "
                + area() + " sq.units, " + "side: "
                + side + " sq.units, "
                + "color: " + super.getColor();
    }
}


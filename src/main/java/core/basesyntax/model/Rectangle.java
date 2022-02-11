package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.FigureArea;
import core.basesyntax.service.FigureDrawing;

public class Rectangle extends Figure implements FigureArea, FigureDrawing {
    private double anySide;
    private double height;

    public Rectangle(Color color, double anySide, double height) {
        super(color);
        this.anySide = anySide;
        this.height = height;
    }

    @Override
    public double area() {
        return (anySide * height) / 2;
    }

    @Override
    public void drawFigure() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: "
                + area() + " sq.units, " + "any side: "
                + anySide + " sq.units, " + "height: "
                + height + " sq.units, "
                + "color: " + super.getColor();
    }

    public double getAnySide() {
        return anySide;
    }

    public double getHeight() {
        return height;
    }
}

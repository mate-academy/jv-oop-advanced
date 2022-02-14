package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Drawable;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    private double anySide;
    private double height;

    public Rectangle(Color color, double anySide, double height) {
        super(color);
        this.anySide = anySide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (anySide * height) / 2;
    }

    @Override
    public void draw() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: "
                + calculateArea() + " sq.units, " + "any side: "
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

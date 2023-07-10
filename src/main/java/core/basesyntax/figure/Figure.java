package core.basesyntax.figure;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Drawable;
import core.basesyntax.tools.Color;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color colorFigure;
    private String name;

    public Figure(String name, Color color) {
        this.name = name;
        this.colorFigure = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return colorFigure;
    }

    public void setColor(Color colorFigure) {
        this.colorFigure = colorFigure;
    }

    @Override
    public void draw() {
        System.out.print("figure: " + name);
    }
}

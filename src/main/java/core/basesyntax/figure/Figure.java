package core.basesyntax.figure;

import core.basesyntax.behaviour.Drawable;
import core.basesyntax.tools.Color;

import java.util.Random;

public abstract class Figure implements Drawable {
    private Color colorFigure;
    private String name;

    Figure(String name, Color color) {
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
        System.out.print("figure: " + getName());
    }
}

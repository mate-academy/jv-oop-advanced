package core.basesyntax;

import core.basesyntax.behavior.FigureArea;
import core.basesyntax.behavior.FigureDescription;

public abstract class Figure implements FigureArea, FigureDescription {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double calculateArea();
}

package core.basesyntax.abstractions;

import core.basesyntax.interfaces.FigureArea;
import core.basesyntax.interfaces.FigureDrawing;

public abstract class Figure implements FigureDrawing, FigureArea {
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
}

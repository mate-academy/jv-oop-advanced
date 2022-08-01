package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String figureType;
    private String color;

    public Figure() {
    }

    public Figure(String figureType, String color) {
        this.figureType = figureType;
        this.color = color;
    }

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

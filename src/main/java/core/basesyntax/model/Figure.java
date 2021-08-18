package core.basesyntax.model;

import core.basesyntax.Drawable;
import core.basesyntax.FigureArea;

public abstract class Figure implements FigureArea, Drawable {
    public String colour;

    public static int getRandomNumber() {
        return (int) (Math.random() * 20);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

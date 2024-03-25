package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculator, Draweble {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

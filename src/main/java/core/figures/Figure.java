package core.figures;

import core.interfaces.AreaCalculator;
import core.interfaces.Drawer;

public abstract class Figure implements Drawer, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

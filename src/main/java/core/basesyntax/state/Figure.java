package core.basesyntax.state;

import core.basesyntax.behavior.FigureArea;
import core.basesyntax.behavior.FigureInformation;

public abstract class Figure implements FigureInformation, FigureArea {
    private String name;
    private String color;

    public Figure(String name) {
        this.name = name;
        color = ColorSupplier.getRandomColor();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String name, String color) {
        this.color = color;
    }

}

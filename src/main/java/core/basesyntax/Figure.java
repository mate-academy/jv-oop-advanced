package core.basesyntax;

import core.basesyntax.behavior.AreaCalculator;
import core.basesyntax.behavior.Draw;

public abstract class Figure implements Draw, AreaCalculator {
    private String color;
    private String name;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}

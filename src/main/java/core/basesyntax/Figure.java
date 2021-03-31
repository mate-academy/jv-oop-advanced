package core.basesyntax;

import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable {
    private String name;
    private Enum color;

    public Figure(String name, Enum color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Enum getColor() {
        return color;
    }
}

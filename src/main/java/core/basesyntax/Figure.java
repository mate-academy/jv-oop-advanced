package core.basesyntax;

import core.basesyntax.interfaces.Calculatable;
import core.basesyntax.interfaces.Drawable;
import core.basesyntax.suppliers.Colors;

public abstract class Figure implements Drawable, Calculatable {
    private String name;
    private Colors color;

    public Figure(String name, Colors color) {
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

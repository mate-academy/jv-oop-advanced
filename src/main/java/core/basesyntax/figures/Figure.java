package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaClculation;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements AreaClculation, Drawable {
    protected String color;
    protected double area;
    public Figure(String color) {
        this.color = color.toLowerCase();
    }
}

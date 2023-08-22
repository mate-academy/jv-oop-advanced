package core.basesyntax.figures;

import core.basesyntax.interfaces.Calculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, Calculable {
    protected double area;
    private final String name;
    private String color;

    protected Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + name
                + ", color: " + color + ", area: "
                + area + ", sq.units");
    }
}

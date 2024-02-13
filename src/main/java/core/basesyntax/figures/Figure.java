package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String name;
    private Color color;

    public Figure(String name, Color color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + name
                + ", color: " + color
                + ", area: " + (double) Math.round(getArea()) + " sq. units, ");
    }
}

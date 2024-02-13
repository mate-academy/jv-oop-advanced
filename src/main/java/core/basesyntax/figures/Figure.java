package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String name;
    private Color color;

    public Figure(String name, Color color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + name
                + ", color: " + color
                + ", area: " + (double) Math.round(getArea() * 100) / 100 + " sq. units, ");
    }
}

package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + getClass().getSimpleName()
                .replace("T", " t").toLowerCase()
                + ", color: " + color
                + ", area: " + (double) Math.round(getArea()) + " sq. units, ");
    }
}

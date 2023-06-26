package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Drawable;

public abstract class Figure implements Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure : ");
    }

    public abstract double getArea();

}

package core.basesyntax.figures;

import java.text.DecimalFormat;

public abstract class Figure implements Drawable, AreaCalculatable {
    protected String color;
    protected DecimalFormat df = new DecimalFormat("#.0");

    public Figure(String color) {
        this.color = color;
    }
}

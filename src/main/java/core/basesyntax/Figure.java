package core.basesyntax;

import java.text.DecimalFormat;

public abstract class Figure {
    private String color;
    protected static final DecimalFormat df = new DecimalFormat("#.00");

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();
}

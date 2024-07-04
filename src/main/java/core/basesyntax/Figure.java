package core.basesyntax;

import java.text.DecimalFormat;

public abstract class Figure implements Area {
    protected static final DecimalFormat df = new DecimalFormat("#.00");
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public abstract void draw();
}

package basesyntax.model;

import basesyntax.servis.AreaCalculator;
import basesyntax.servis.Drawable;


public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}

package core.basesyntax.model;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Drawable;

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

    @Override
    public double getArea() {
        return 0;
    }

    public abstract void draw();
}


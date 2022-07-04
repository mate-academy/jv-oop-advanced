package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

public abstract class Figure implements ColorSupplier {
    private String color;

    public String getColor() {
        return getRandomColor();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {return  getArea();}

    public void draw() {}

    @Override
    public String toString() {
        return "Figure{"
                + "color='"
                + color
                + '\''
                + '}';
    }
}

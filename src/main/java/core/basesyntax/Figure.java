package core.basesyntax;

import java.util.Random;

public abstract class Figure implements CalculateArea, Drawable {
    private Color color;
    private double area;

    public Figure(Color color) {
        this.color = color;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

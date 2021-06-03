package figures;

import randomiser.Color;

public abstract class Figure implements Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getSquare();

    protected abstract double getPerimeter();

    @Override
    public void draw() {
        System.out.println();
    }
}

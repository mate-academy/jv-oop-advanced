package org.example;

public abstract class Figure implements Drawable, Area {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

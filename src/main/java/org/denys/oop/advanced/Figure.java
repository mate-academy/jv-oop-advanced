package org.denys.oop.advanced;

public abstract class Figure implements AreaCalculable, Drawable {
    private final String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}

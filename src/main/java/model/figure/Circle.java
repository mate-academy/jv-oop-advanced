package model.figure;

import model.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * (radius * radius));
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle, area:  " + calculateArea()
                + " sq. units, radius: " + radius + " units, color: " + color);
    }
}

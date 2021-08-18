package main.java.core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String drawTheFigure() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: "
               + radius + " units, color: " + getColor();

    }
}


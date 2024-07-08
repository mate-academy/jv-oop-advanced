package core.basesyntax;

import model.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        print();
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle, area:  " + Math.round(calculateArea() * 100.0) / 100.0
                + " sq. units, radius: " + radius + " units, color: " + color);
    }
}

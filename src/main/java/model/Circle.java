package model;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Object draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + color);
        return null;
    }
}



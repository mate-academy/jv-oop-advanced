package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        String a = "Figure: " + this.getClass().getSimpleName() + ", area: " + getArea();
        String b = " sq.units, radius: " + radius + " units, color: " + color;
        return a + b;
    }
}


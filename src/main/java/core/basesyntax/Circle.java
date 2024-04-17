package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.floor(Math.PI * radius * radius * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}

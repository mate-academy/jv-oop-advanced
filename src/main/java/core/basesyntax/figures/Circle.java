package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String name,double radius, String color) {
        this.setName(name);
        this.radius = radius;
        this.setColor(color);
    }

    public Circle() {

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + calculateArea() + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor());
    }
}

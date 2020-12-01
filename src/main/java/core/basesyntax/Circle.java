package core.basesyntax;

public class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        this.radius = (int) Math.random() * (11 - 1) + 1;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, circumradius: " + getPerimeter() +
                ", area: " + getArea() +
                " sq. units, radius: " + getRadius() +
                " units, diameter: " + getDiameter() +
                " units, color: " + getColor() + ".");
    }

    public int getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }
}

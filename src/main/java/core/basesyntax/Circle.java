package core.basesyntax;

public class Circle extends Figures {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getName() + " is " + getColor().toLowerCase()
                + " and has radius: " + getRadius() + ","
                + " and area: " + getArea() + " sq. units");
    }
}

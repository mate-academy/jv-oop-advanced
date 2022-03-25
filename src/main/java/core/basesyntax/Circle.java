package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: circle" + " radius: " + getRadius() + " units "
                + " area: " + getArea() + " sq. units " + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return (int) Math.PI * getRadius() * getRadius();
    }
}

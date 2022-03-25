package core.basesyntax;

public class Circle extends Figure implements Description, GetArea {
    private int radius;
    private String name = "circle";

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: " + name + " radius: " + getRadius() + " units "
                + " area: " + getArea() + " sq. units " + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return (int) Math.PI * getRadius() * getRadius();
    }
}

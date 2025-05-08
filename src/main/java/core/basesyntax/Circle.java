package core.basesyntax;

public class Circle extends Figures {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + getArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }
}

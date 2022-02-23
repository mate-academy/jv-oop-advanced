package core.basesyntax;

public class Circle extends Figures {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: radius: "
                + radius + " color: " + getColor()
                + " area: " + getArea());
    }

}

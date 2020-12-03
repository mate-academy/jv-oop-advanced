package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public void setRadius(double radius) {
        if (radius <= 0) {
            radius = 1;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI * radius * radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: circle, area: " + area + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}

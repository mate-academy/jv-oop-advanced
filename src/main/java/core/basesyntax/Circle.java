package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    void draw() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq. units, radius: "
                            + this.radius + ", color: " + super.getColor());
    }
}

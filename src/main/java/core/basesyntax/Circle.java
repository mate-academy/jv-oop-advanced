package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius > 0 ? radius : 0;
    }

    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public void draw() {
        System.out.println(" Figure: circle, area: "
                + this.getArea() + " sq.units, radius: "
                + this.getRadius() + " units, color: "
                + this.getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

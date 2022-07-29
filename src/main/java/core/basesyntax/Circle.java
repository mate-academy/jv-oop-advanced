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
    public double getArea() {
        return Math.PI * radius;
    }

    public void draw() {
        System.out.println("Figure: cicle, area: " + String.format("%.1f", getArea())
                + " sq.units, radius: "
                + radius + "  units, color: " + super.getColor());
    }

}

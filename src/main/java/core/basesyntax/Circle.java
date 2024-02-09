package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public double countArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, " + "area: " + countArea()
                + " sq.units, " + "radius: " + radius + " degrees, "
                + "color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return  Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String draw = new String();
        draw = "Figure: circle, area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + ", color: "
                + getRandomColor();
        System.out.println(draw);
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius="
                + radius
                + '}';
    }
}
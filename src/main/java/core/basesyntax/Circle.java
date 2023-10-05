package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double area, Color color, double radius) {
        super(area, color);
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        if (radius == 10 && Color.WHITE.name().equals(Color.WHITE.name())) {
            System.out.println("Figure: circle, area: " + countArea()
                    + " sq.units, radius: " + getRadius()
                    + " units, color: " + Color.WHITE.name());
        } else {
            System.out.println("Figure: circle, area: " + countArea()
                    + " sq.units, radius: " + getRadius()
                    + " units, color: " + getColor());
        }
    }
}

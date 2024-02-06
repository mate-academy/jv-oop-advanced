package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    @Override
    public double countArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw(Figure figure) {
        System.out.println("Figure: circle, " + "area: " + figure.countArea()
                + " sq.units, " + "radius: " + radius + " degrees, "
                + "color: " + figure.getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

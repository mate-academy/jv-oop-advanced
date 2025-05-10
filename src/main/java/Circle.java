public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

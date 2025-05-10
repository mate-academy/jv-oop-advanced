public class Circle extends Figure implements AreaCalculator, FigureDrawer {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + findArea() + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}

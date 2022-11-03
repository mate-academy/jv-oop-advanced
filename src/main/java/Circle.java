public class Circle extends Figure implements AreaCalculator, FigureInformation {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return ("Figure: circle, area: " + getArea() + " sg.units, radius: " + radius
                + " units, color: " + getColor());
    }

    @Override
    public String drawDefault() {
        return ("Figure: circle, color: " + getColor() + " radius: " + radius + " units");
    }
}

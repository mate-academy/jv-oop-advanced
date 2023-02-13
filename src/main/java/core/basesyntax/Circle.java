package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private double radius;

    public Circle() {
        super();
        setName(FigureType.CIRCLE);
        this.radius = 1;
    }

    public Circle(FigureType name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toDraw() {
        StringBuilder builder = new StringBuilder();
        return builder.append(super.toDraw()).append(", radius: ").append(radius)
                .append(", area: ").append(getArea()).toString();
    }
}

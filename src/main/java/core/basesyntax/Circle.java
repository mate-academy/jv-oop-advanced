package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(FigureType.CIRCLE, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: ").append(getName())
                .append(", color: ").append(getColor()).append(", radius: ").append(radius)
                .append(", area: ").append(getArea()).toString());
    }
}

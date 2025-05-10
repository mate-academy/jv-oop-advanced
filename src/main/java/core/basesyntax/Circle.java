package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Circle color is ").append(getColor()).append(", area: ")
                .append(getArea()).append(", radius: ").append(radius);
        System.out.println(stringBuilder);
    }
}

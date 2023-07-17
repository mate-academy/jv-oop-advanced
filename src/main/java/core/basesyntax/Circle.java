package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: Circle, color: ");

        String text = stringBuilder
                .append(super.getColor())
                .append(", radius: ")
                .append(radius)
                .append(", area: ")
                .append(getArea()).toString();
        System.out.println(text);
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }
}

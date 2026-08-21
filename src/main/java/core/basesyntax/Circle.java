package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle,")
                .append(" area: " + calculateArea() + " sq. units,")
                .append(" radius: " + radius + " units,")
                .append(" color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return Math.floor(Math.PI * radius * radius * 10.0) / 10.0;
    }
}

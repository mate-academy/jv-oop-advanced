package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String stringBuilder = "Figure: " + "circle, area: " + calculateArea()
                + " sq.units, radius: "
                + radius + " color: " + color;
        System.out.println(stringBuilder);
    }
}

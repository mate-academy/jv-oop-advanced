package core.basesyntax;

public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle(String color, String color1, double radius) {
        super(color);
        this.color = color1;
        this.radius = radius;
    }
}

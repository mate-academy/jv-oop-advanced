package core.basesyntax;

public class Circle extends Figure{
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
}

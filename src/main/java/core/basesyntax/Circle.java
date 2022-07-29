package core.basesyntax;
// 2*radius * pi
public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }
}

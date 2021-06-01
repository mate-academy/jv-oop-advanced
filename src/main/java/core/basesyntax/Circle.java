package core.basesyntax;

public class Circle extends Figure implements Drawable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }
}

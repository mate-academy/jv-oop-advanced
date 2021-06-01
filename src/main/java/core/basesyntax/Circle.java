package core.basesyntax;

public class Circle extends Figure implements Drawable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double draw() {
        return 2 * Math.PI * radius;
    }
}

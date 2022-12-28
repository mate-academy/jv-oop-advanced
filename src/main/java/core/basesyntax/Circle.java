package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI* radius*radius;
    }

    @Override
    public void PrintInfo() {
        System.out.println(" Figure: circle, area:  " + getArea() + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}

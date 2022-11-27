package core.basesyntax;

public class Circle extends Figure {
    private float radius;

    public Circle(String color, float radius) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public float area() {
        return (float) (3.14 * getRadius() * getRadius());
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " circle with radius equals to "
                + getRadius()
                + " area equals "
                + area());
    }
}

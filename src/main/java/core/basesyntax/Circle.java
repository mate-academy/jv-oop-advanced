package core.basesyntax;

public class Circle extends Figure {
    private float radius;

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float getArea() {
        return (float) (3.14 * radius * radius);

    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " circle with radius equals to "
                + radius 
                + " area equals "
                + getArea());
    }
}

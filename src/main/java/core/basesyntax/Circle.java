package core.basesyntax;

public class Circle extends Figure {
    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }


    public String getColor() {
        return color;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public float area() {
        return (float) (3.14 * radius * radius);

    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " circle with radius equals to "
                + radius 
                + " area equals "
                + area());
    }
}

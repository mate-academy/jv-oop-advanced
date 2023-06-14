package core.basesyntax;

public class Circle extends Figure {
    protected float radius;

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = Color.valueOf(color);
    }

    public Circle(float radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    protected float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has a radius of "
                + radius
                + " and the area of "
                + getArea());
    }
}


package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int getPerimeter() {
        return (int) (Math.PI * radius * 2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + radius);
    }
}

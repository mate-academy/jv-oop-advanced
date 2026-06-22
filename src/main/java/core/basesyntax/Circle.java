package core.basesyntax;

public class Circle extends Figure implements Drawable {
    private int radius;

    public Circle(String color, int i) {
        super(color);
        this.radius = i;
    }

    @Override
    public void toDraw() {
        System.out.println(getColor() + " Circle, radius: " + radius
                + "\n area " + getArea());
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

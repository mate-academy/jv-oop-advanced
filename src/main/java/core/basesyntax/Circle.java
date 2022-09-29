package core.basesyntax;

public class Circle extends Figure implements FiguresArea, Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
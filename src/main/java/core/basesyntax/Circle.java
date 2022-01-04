package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return 2 * radius;
    }

    @Override
    public void draw() {
        int area = getArea();
        String color = getColor();

        System.out.println("Figure: circle, area: " + area + ", color: " + color);
    }
}

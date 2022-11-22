package core.basesyntax;

public class Circle extends Figure {
    private Color color;
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is Circle; Color: " + color + "; area: " + getArea() + ";");
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
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

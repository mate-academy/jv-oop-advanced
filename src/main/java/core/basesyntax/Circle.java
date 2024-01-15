package core.basesyntax;

public class Circle extends BaseFigure implements Behaviour {
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with color: " + getColor() + " and radius: " + radius);
    }
}

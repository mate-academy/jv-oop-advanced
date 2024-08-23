package core.basesyntax;

public class Circle extends FigureBase {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius
                + " units, color: " + color);
    }
}

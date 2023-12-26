package core.basesyntax;

public class Circle extends FigureForCircle {
    public Circle(String color, int radius) {
        super(color, radius);
    }

    @Override
    public double area() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public void fullInfo() {
        System.out.println("Figure: circle, area: " + area() + " sq. units, radius: " + getRadius()
                + " units, color: " + getColor());
    }
}

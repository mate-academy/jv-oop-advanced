package core.basesyntax;

public class Circle extends ColoredFigure {
    private int radius;
    //private String color;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * (radius * radius) * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}

package core.basesyntax;

public class Circle extends AbstractFigure {
    private double radius;

    public Circle(String name, double radius, Color color) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        String formattedArea = String.format("%.2f", getArea());
        String formattedRadius = String.format("%.2f", radius);
        System.out.println("Figure: " + name + ", area: " + formattedArea
                + " sq.units, radius: " + formattedRadius + " units, color: " + color);
    }
}

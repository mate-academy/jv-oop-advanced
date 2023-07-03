package core.basesyntax.figures;

public class Circle extends Figures {
    private int radius;

    public Circle(int radius, String color) {
        setColor(color);
        this.radius = radius;
    }

    public Circle() {

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.ceil((Math.PI * radius * radius) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                           + " sq.units, radius: " + radius
                           + " " + unitOrUnits(radius) + ", color: " + getColor());
    }
}

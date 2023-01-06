package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
        this.setName(Figures.CIRCLE.name());

    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().toLowerCase()
                + ", color: " + getColor().toLowerCase()
                + ", area: " + String.format("%.2f", getArea())
                + " sq.units," + " radius: " + radius + " units");
    }
}

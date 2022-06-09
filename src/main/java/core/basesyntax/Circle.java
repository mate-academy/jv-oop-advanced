package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color = String.valueOf(ColorSupplier.getRandomColor());

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq.units , radius: "
                + radius + " units, color: " + color);
    }
}

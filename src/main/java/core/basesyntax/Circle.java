package core.basesyntax;

public class Circle extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name;
    private String color;
    private int radius;

    public Circle() {
        this.name = "circle";
        this.color = colorSupplier.getRandomColor();
        this.radius = (int)(Math.random() * 100);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drow() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "radius: " + radius + " units, " + "color: " + color;
    }
}

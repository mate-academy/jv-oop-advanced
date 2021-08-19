package core.basesyntax;

public class Circle extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name = "circle";
    private String color = colorSupplier.getRandomColor();
    private int radius = (int)(Math.random() * 100);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    public void drow() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "radius: " + radius + " units, " + "color: " + color);
    }
}

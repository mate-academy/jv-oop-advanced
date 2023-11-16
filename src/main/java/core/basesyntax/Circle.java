package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private String color = getColor();

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return getSupplier().getRandomColor();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area:" + getArea() + " sq. units, radius: "
                + radius + " units, color: "
                + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}

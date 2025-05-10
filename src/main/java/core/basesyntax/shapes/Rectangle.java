package core.basesyntax.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "width: " + getWidth() + " units, "
                + "height: " + getHeight() + " units, "
                + "color: " + this.getColor());
    }
}

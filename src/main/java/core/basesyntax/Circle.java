package core.basesyntax;

public class Circle extends Figure {
    private ColorSupplier sc = new ColorSupplier();
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getInfoAboutFigure() {
        System.out.println("Figure: circle , area : " + (Math.PI * (radius * radius))
                + " radius : " + radius
                + ", color: " + color);
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private Colors color;
    private double area;

    public Circle(double radius, Colors color) {
        this.radius = radius;
        this.color = color;
        this.area = Math.PI * radius * radius;
    }

    public Circle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.radius = Math.random();
        this.color = colorSupplier.getRandomColor();
        this.area = Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle:");
        System.out.println(" radius: " + radius
                + " color: " + color
                + " area: " + area);
    }
}

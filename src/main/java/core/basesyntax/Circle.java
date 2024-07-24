package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private double area = getArea();
    private String name;

    public Circle() {

    }

    public Circle(String color, int radius, String name) {
        super(color, name);
        this.radius = radius;
    }

    public Circle(String color, double area) {
        super(color);
        this.area = area;
    }

    public Circle(String name, double area, String color) {
        super(color, name);
        this.area = area;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + FigureName.CIRCLE + ", color: "
                + getColor() + ", radius: " + radius + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

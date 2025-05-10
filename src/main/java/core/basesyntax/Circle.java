package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private double area;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
        this.area = radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                            + ", area: " + area
                            + " sq.units, radius: " + radius
                            + " units, color: " + color);
    }

    @Override
    public void getArea() {
        System.out.println(this.area);
    }
}

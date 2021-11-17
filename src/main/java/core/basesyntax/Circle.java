package core.basesyntax;

public class Circle extends Figure implements DrawAble {
    private int radius;
    private double area;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
        this.area = radius * radius * 3.14;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                            + ", area: " + area
                            + " sq.units, radius: " + radius
                            + " units, color: " + color);
    }
}

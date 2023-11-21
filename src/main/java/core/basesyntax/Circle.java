package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Painter {
    private final int radius;

    public Circle(String color, int radius) {
        name = "circle";
        this.color = color;
        this.radius = radius;
    }


    @Override
    public void getArea() {
        area = 3.14 * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + area + " sq. units, " + "radius: " + radius + " units, " + "color: " + color);
    }
}

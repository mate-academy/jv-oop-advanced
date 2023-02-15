package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        super.draw();
        String output = ", area: " + getArea()
                + " sq.units, radius " + radius + " units";
        System.out.println(output);
    }
}

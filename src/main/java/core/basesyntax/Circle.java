package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.pow(radius, 2) * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", color: " + color
                + ", area: " + area() + " sq.units"
                + ", radius: " + radius
                + ";"
        );
    }
}

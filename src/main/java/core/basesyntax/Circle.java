package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure : circle, area: "
                    + getArea()
                    + " sq.units, "
                    + "radius: "
                    + radius
                    + " units, "
                    + "color: "
                    + color);
    }
}

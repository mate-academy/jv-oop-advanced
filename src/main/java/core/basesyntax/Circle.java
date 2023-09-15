package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure : circle, area: " + calculateArea() + " sq.units, "
                        + "radius: " + radius + " units, "
                        + "color: " + color);
    }

}

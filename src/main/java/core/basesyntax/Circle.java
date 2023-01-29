package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Name: circle" + "color: " + getColor() + ", radius: "
                + radius + "units" + ", area: " + getArea() + " square units");
    }
}

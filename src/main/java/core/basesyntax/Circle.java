package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(){

    }

    Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                            + getArea() + " sq.units, radius: "
                            + radius + " units, color: " + color);
    }
}

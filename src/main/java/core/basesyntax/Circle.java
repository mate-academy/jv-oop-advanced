package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super.setName("circle");
        super.setColor(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "radius: " + radius + " units, " + "color: " + getColor());
    }
}

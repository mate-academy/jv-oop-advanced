package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, String name, int radius) {
        super(color, name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return radius * Math.PI;
    }

    @Override
    public void getFigureInfo() {
        System.out.println("Figure: " + getName() + ", area: " + area() + " sq. units, radius: "
                + getRadius() + " , color: " + getColor());
    }
}

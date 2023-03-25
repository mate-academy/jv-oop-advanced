package core.basesyntax;

public class Circle extends Figure {
    private static final String name = "circle";
    private final int radius;
    private double area;

    public Circle(int radius,String color) {
        this.radius = radius;
        this.setColor(color);
    }

    public String getName() {
        return name;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units," + " color: " + getColor());
    }
}

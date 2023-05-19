package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Circle,"
                + "area:" + getArea() + " sq.units,radius:"
                + radius + " units,color:" + getColor());
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area:" + getArea() + " sq.units,radius:"
                + radius + " units,color:" + getColor());
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure:" + getType()
                + " area:" + area() + " sq.units,radius:"
                + radius + " units,color:" + getColor());
    }

    @Override
    public String getType() {
        return "circle";
    }
}

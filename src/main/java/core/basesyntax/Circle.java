package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure:  " + getClass().getName() + ",  area:  "
                + getArea() + " sq.units" + "  radius = " + radius + "units"
                + " color:  " + getColor());
    }
}

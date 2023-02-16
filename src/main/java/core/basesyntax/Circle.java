package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Figure: circle" + ", area =  " + calculateArea() + " sq.units" + ", radius = " + radius + " units" + ", color = " + getColor());
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " color=" + getColor() +
                '}';
    }
}



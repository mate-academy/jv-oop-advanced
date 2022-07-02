package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle() {
        setName("Circle");
        setColor(new ColorSupplier().getRandomColor());
        this.radius = getRandom().nextInt(getMaxNumber());
    }

    Circle(double radius, Color color) {
        setName("Circle");
        setColor(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius * Math.PI, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}

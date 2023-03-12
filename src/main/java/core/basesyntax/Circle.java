package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
        setColor(new ColorSupplier().getRandomColor());
        setName("circle");
        setArea(getArea());
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

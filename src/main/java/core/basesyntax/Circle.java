package core.basesyntax;

public class Circle extends Figure {
    private final int radius;


    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public Circle(int radius) {
        this.radius = radius;
        this.setColor(new ColorSupplier().getRandomColor());
        setName("circle");
        setArea(getArea());
    }
    public Circle() {
        radius = 10;
        setArea(getArea());
        setColor("white");
        setName("circle");
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, radius: " + radius + " units," + " color: " + getColor());
    }

}

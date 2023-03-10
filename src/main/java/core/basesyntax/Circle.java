package core.basesyntax;

public class Circle extends Figure {
    private final int radius;


    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public Circle(int radius) {
        this.radius = radius;
        setArea(getArea());
        setColor("white");
        setName("circle");
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
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

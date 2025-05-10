package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color,int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : "
                + getName()
                + ", area: "
                + getArea()
                + " sq.units, radius : "
                + getRadius()
                + " color : "
                + getColor());
    }
}

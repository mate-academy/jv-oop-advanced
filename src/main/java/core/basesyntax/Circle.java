package core.basesyntax;

public class Circle extends Figure implements Area, Draw{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public Circle(String color, int radius) {
        super(color);
        this.radius =  radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, getNumberTwo);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, " + "radius: " + radius
                + " units, color: " + super.getColor());
    }
}

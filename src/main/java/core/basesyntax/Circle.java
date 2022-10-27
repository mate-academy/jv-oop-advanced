package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Figure draw() {

        System.out.println("Figure: " + getClass().getSimpleName() + ", volume: "
        + getVolume() + " sq.units, color: " + getColor() + ", radius: " + getRadius());

        return null;
    }

    @Override
    public double getVolume() {
        return (radius * radius) * 3.14;
    }
}

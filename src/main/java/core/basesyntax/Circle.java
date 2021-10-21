package core.basesyntax;

public class Circle extends Shape implements AreaCounter {
    private int radius;

    public Circle(int radius, String color) {
        super("Circle", color);
        this.radius = radius;
        float valueOfArea = countArea();
        setArea(valueOfArea);
    }

    @Override
    public float countArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle, " + "area: " + getArea() + " sq.units" + " radius: "
                + radius + " units" + ", color: " + getColor();
    }
}

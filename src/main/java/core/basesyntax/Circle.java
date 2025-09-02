package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    @Override
    public void draw() {
        System.out.println( "circle, " +
                "area: " + getArea() + "sq. units, " +
                "radius: " + radius + "units, " +
                "color: " + getColor());
    }
    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    protected Circle(int radius, Color color) {
        super(Math.PI * radius * radius, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String draw() {
        return "Figure:Circle" + "," + "Color:" + getColor() + ","
                + "Area:" + getArea() + "," + "Radius:" + getRadius();
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void obtainArea() {
        double area = Math.PI * Math.pow(radius, 2);
        setArea(area);
    }

    @Override
    public String draw() {
        String figureInfo = "Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, radius length: " + getRadius()
                + " units, color: " + getColor();

        return figureInfo;
    }

    public int getRadius() {
        return radius;
    }
}

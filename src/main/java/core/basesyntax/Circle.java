package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
        calcArea();
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units," + " color: " + getColor();
    }

    @Override
    public void calcArea() {
        setArea(Math.ceil(Math.PI * Math.pow(radius, 2)));
    }
}

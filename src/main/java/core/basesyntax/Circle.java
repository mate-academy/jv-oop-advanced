package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        calcArea();
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq. units, raidus: "
                + radius + " units," + " color: " + getColor();
    }

    @Override
    public void calcArea() {
        setArea(Math.ceil(Math.PI * Math.pow(radius, 2)));
    }
}

package core.basesyntax;

public abstract class Circle extends Figure {
    private final Color color;
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String draw(){
        return ("Figure: Circle, area: " + getArea() + "sq. units," + "radius: " + radius
                + "units" + "color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

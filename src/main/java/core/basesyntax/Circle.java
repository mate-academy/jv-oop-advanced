package core.basesyntax;

public class Circle extends Figure {
    private final Color color;
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Figure: Circle, area: " + getArea() + "sq. units," + "radius: " + radius
                + "units" + "color: " + color.name());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

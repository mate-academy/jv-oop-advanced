package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, color: " + getColor()
                + ", radius: " + radius + ", area: " + areaCalculate());
    }

    @Override
    public double areaCalculate() {
        return (Math.PI * Math.pow(radius, 2));
    }
}

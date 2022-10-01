package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private double circleArea;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        getArea();
        draw();
    }

    @Override
    public double getArea() {
        circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle; color: " + color
                + "; radius: " + radius
                + "; area: " + String.format("%.2f", circleArea));
    }
}

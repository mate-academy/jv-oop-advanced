package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle; color : " + getColor() + "; radius: "
                + radius + "; area: " + getArea() + ";");
    }
}

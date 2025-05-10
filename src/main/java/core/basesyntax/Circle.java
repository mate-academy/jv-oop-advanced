package core.basesyntax;

public class Circle extends Figure implements GetFigureArea {
    private double radius;

    public void draw() {
        System.out.println("Figure - circle: radius " + this.radius
                + " ,area " + this.getArea() + " color "
                + this.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
}

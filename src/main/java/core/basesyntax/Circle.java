package core.basesyntax;

public class Circle extends Figure {
    private double area;
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;

        super.setColor(color);
    }

    @Override
    public double getArea(double area) {
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Circle , area : " + getArea(area)
                           + " , Radius = " + getRadius()
                            + " , Color = " + super.getColor());
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

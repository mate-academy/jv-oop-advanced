package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

    Circle(Color color) {
        super(color);
    }

    Circle(Color color, double radius) {
        super(color);
        this.setName(FigureName.CIRCLE);
        this.radius = radius;
        this.area = calculateArea();
    }

    @Override
    public void draw() {
        String text = "Figure: " + getName() + ", area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor();
        System.out.println(text);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Figuredraw{
    private double a;
    private double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Rectangle " + "Color:" + getColor() + " " + "Area: " + getArea());
    }
}

package core.basesyntax.figure;

public class Circle extends Figure{
    private double radius;
    private static final String FIGURE_NAME = "circle";

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, radius: " + radius;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

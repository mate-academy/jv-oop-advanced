package core.basesyntax;

public class Circle extends Figure {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double uniqueMethod() {
        return this.radius;
    }

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' radius is " + uniqueMethod()
                + " units , color: " + this.color.toLowerCase());
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * this.radius * this.radius);
    }

    @Override
    public String getColor() {
        return this.color;
    }
}

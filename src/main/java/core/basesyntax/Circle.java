package core.basesyntax;

public class Circle extends Figure {

    private double radius = 0;

    public Circle(String color) {
        setName("Circle");
        setColor(color);
        this.radius = getRandomSize();
    }

    public Circle(String color,double radius) {
        setName("Circle");
        setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, radius : " + radius + " units, color : " + getColor());
    }
}

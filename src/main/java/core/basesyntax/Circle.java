package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) Math.round(Math.PI * Math.pow(radius, 2));

    }

    @Override
    public void draw() {
        System.out.println("Circle information: " + "\n"
                    + "Color: " + getColor() + ", "
                    + "Radius: " + radius + ", "
                    + "Area of circle: " + getArea() + "\n");
    }
}
